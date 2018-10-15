package zadanie10.domowe4.Control;

import zadanie10.domowe4.ExcAndEnum.FreezeAlertException;
import zadanie10.domowe4.Model.Computer;
import zadanie10.domowe4.ExcAndEnum.Options;
import zadanie10.domowe4.ExcAndEnum.OverheatException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputerShop {
    private static Scanner sc = new Scanner(System.in);
    private TimingManipulator tm = new TimingManipulator();

    public void mainLoop() {
        Computer comp = ComputerCreator.create();
        int option = -1;
        int speedUP;
        int slowDown;
        boolean check;
        boolean checkOption;


        while (option != 0) {
            System.out.println("Wybierz opcję");
            Options();
            check = true;
            checkOption = true;
            while(checkOption) {
                try {
                    option = sc.nextInt();
                    checkOption = false;
                } catch (InputMismatchException e1) {
                    System.out.println("Nieprawidłowa wartość, spróbuj znowu");
                    sc.next();
                }
            }
            switch (option) {
                case 1:
                    while (check) {
                        try {
                            System.out.println("O ile chcesz przyspieszyć procesor?");
                            speedUP = sc.nextInt();
                            tm.boostTiming(comp.getProc(), speedUP);
                            check = false;
                            System.out.println("Aktalne taktowanie procesora: "+comp.getProc().getTiming()+"MHz\nTemperatura: "+comp.getProc().getTemp()+"C\n");
                        } catch (OverheatException ex1) {
                            System.out.println("Komputer nie wytrzyma tak wysokiej temperatury, podaj niższą wartość");
                            continue;
                        } catch (InputMismatchException e2) {
                            System.out.println("Podałeś nieprawidłową wartość, spróbuj ponownie");
                            sc.next();
                        }
                    }
                    break;
                case 2:
                    while (check) {
                        try {
                            System.out.println("O ile chcesz zwolnić procesor?");
                            slowDown = sc.nextInt();
                            tm.lowerTiming(comp.getProc(), slowDown);
                            check = false;
                            System.out.println("Aktalne taktowanie procesora: "+comp.getProc().getTiming()+"MHz\nTemperatura: "+comp.getProc().getTemp()+"C\n");
                        } catch (FreezeAlertException ex3) {
                            System.out.println("Komputer nie może mieć ujemnej temperatury, podaj wyższą wartość");
                            continue;
                        } catch (InputMismatchException e3) {
                            System.out.println("Podałeś nieprawidłową wartość, spróbuj ponownie");
                            sc.next();
                        }
                    }
                    break;
                case 3:
                    while (check) {
                        try {
                            System.out.println("O ile chcesz przyspieszyć ram?");
                            speedUP = sc.nextInt();
                            tm.boostTiming(comp.getRam(), speedUP);
                            check = false;
                            System.out.println("Aktalne taktowanie RAMu: "+comp.getRam().getTiming()+"MHz\nTemperatura: "+comp.getRam().getTemp()+"C\n");
                        } catch (OverheatException ex4) {
                            System.out.println("Komputer nie wytrzyma tak wysokiej temperatury, podaj niższą wartość");
                            continue;
                        } catch (InputMismatchException e4) {
                            System.out.println("Podałeś nieprawidłową wartość, spróbuj ponownie");
                            sc.next();
                        }
                    }
                    break;
                case 4:
                    while (check) {
                        try {
                            System.out.println("O ile chcesz zwolnić RAM?");
                            slowDown = sc.nextInt();
                            tm.lowerTiming(comp.getRam(), slowDown);
                            check = false;
                            System.out.println("Aktalne taktowanie RAMu: "+comp.getRam().getTiming()+"MHz\nTemperatura: "+comp.getRam().getTemp()+"C\n");
                        } catch (FreezeAlertException ex5) {
                            System.out.println("Komputer nie może mieć ujemnej temperatury, podaj wyższą wartość");
                            continue;
                        } catch (InputMismatchException e5) {
                            System.out.println("Podałeś nieprawidłową wartość, spróbuj ponownie");
                            sc.next();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Aktalne taktowanie procesora: "+comp.getProc().getTiming()+"MHz\nTemperatura: "+comp.getProc().getTemp()+"C\n");
                    System.out.println("Aktalne taktowanie RAMu: "+comp.getRam().getTiming()+"MHz\nTemperatura: "+comp.getRam().getTemp()+"C\n");
                    break;
                case 6:
                    System.out.println(comp);
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Komputer wyłączony");
                    break;
            }
        }
        sc.close();
    }

    private static void Options() {
        for (Options o : Options.values()) {
            System.out.println(o.getValue() + ": " + o.getDescription());
        }
    }
}
