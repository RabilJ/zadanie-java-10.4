package zadanie10.domowe1;

import javax.naming.Name;
import java.util.Scanner;

public class PersonCreator {
    private static Scanner sc = new Scanner(System.in);
    public static Person birth(){
        System.out.println("Imię: ");
        String name = sc.nextLine();
        if(name==null||name.length()<3){
            throw new NameUndefinedException();
        }
        System.out.println("Nazwisko");
        String surname = sc.nextLine();
        System.out.println("Wiek: ");
        int age = sc.nextInt();
        if(age<0){
            throw new IncorrectAgeException();
        }
        sc.nextLine();
        System.out.println("Pesel: ");
        String pesel = sc.nextLine();
        Person person = new Person(name, surname,age,pesel);
        return person;
    }
}
