package zadanie10.domowe1;

public class Test {
    public static void main(String[] args) {
        try {
            Person person1 = PersonCreator.birth();
            System.out.println(person1);
        }catch(IncorrectAgeException e){
            System.err.print("Wiek nie może być ujemny");
        }catch(NameUndefinedException ex){
            System.err.print("Imię nie może się składać z 2(lub mniej) znaków");
        }

    }
}
