package coltonchrane_advinherit.polyexam;

import java.util.Scanner;

abstract class State {

    static State loginMenu, mainMenu, updateSoftware, dataEntry, reports, printing, current, previous;

    void enter() {
    }

    void update() {
    }

}

class loginMenu extends State {

    void enter() {
        System.out.println("***Login Portal***");
        System.out.println("Access Granted...");
    }

    void update() {
        while (true) {
            System.out.println("1. Main Menu");
            System.out.println("2. Update Software");
            System.out.println("3. Exit");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = mainMenu;
                    return;
                case "2":
                    current = updateSoftware;
                    previous = loginMenu;
                    return;
                case "3":
                    System.out.println("Thank you! Goodbye");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

class mainMenu extends State {

    void enter() {
        System.out.println("***Main Menu***");
    }

    void update() {
        while (true) {
            System.out.println("1. Data Entry");
            System.out.println("2. Update Software");
            System.out.println("32. Reports");
            System.out.println("4. Exit");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = dataEntry;
                    return;
                case "2":
                    current = updateSoftware;
                    previous = mainMenu;
                    return;
                case "3":
                    current = reports;
                    return;
                case "4":
                    System.out.println("Thank you!Goodbye");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

class updateSoftware extends State {

    void enter() {
        System.out.println("Software Updated");
    }

    void update() {
        while (true) {
            System.out.println("1. Return");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = previous;
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

class dataEntry extends State {

    void enter() {
        System.out.println("***Data Entry***");
        System.out.println("Data Entered Succesfully...");
    }

    void update() {
        while (true) {
            System.out.println("1. Main Menu");
            System.out.println("2. Reports");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = mainMenu;
                    return;
                case "2":
                    current = reports;
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

class reports extends State {

   void enter() {
        System.out.println("***Reports***");
        System.out.println("Data Reported Succesfully...");
    }

    void update() {
        while (true) {
            System.out.println("1. Data Entry");
            System.out.println("2. Printing");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = dataEntry;
                    return;
                case "2":
                    current = printing;
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

class printing extends State {

    void enter() {
        System.out.println("***Printing***");
        System.out.println("Data Printed Succesfully...");
    }

    void update() {
        while (true) {
            System.out.println("1.Reports");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = reports;
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

public class ColtonChrane_advInheritPolyExam {

    public static void main(String[] args) {
        State.loginMenu = new loginMenu();
        State.mainMenu = new mainMenu();
        State.updateSoftware = new updateSoftware();
        State.dataEntry = new dataEntry();
        State.reports = new reports();
        State.printing = new printing();
        State.current = State.loginMenu;
        
        while(true)
        {
            State.current.enter();
            State.current.update();
        }

    }

}
