package coltonchrane_polymorphismlab;

import java.util.Scanner;

abstract class State {

    static State mMenu, credit, options, level1, level2, level3, load, save, current, progress;

    void enter() {
    }

    void update() {
    }
}

class mMenu extends State {

    void enter() {
        System.out.println("***Main Menu***");
    }

    void update() {
        while (true) {
            System.out.println("1. New Game");
            System.out.println("2. Load Game");
            System.out.println("3. Options");
            System.out.println("4. Credits");
            System.out.println("5. Exit");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = level1;
                    return;
                case "2":
                    current = load;
                    return;
                case "3":
                    current = options;
                    return;
                case "4":
                    current = credit;
                    return;
                case "5":
                    System.out.println("Thanks for playing!");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

class credit extends State {
    void enter() {
        System.out.println("***Credits Menu***");
        System.out.println("Created by: Colton Chrane");
        System.out.println("Instructed by: Alley Bowden");

    }

    void update() {
        while (true) {
            System.out.println("1. Cedits ended. Return to Main Menu");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = mMenu;
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

class options extends State {
    void enter() {
        System.out.println("***Options***");
        System.out.println("Options will be in future updates!");
    }

    void update() {
        while (true) {
            System.out.println("1. Return to Main Menu");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = mMenu;
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

class level1 extends State {
    void enter() {
        System.out.println("***Level 1***");
    }

    void update() {
        while (true) {
            System.out.println("1. Proceed to level 2");
            System.out.println("2. Save Game");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = level2;
                    return;
                case "2":
                    progress = level1;
                    current = save;
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

class level2 extends State {
    void enter() {
        System.out.println("***Level 2***");
    }

    void update() {
        while (true) {
            System.out.println("1. Proceed to level 3");
            System.out.println("2. Save Game");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = level3;
                    return;
                case "2":
                    progress = level2;
                    current = save;
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

class level3 extends State {
    void enter() {
        System.out.println("***Level 3***");
    }

    void update() {
        while (true) {
            System.out.println("1. Complete Game");
            System.out.println("2. Save Game");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = credit;
                    return;
                case "2":
                    progress = level3;
                    current = save;
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

class load extends State {
    void enter() {
        System.out.println("***Load Game***");
    }

    void update() {
        while (true) {
            //Wasnt sure if the load was suppose to have the ability to jump through levels, but the diagram made it seem that way so I included it.
            System.out.println("1. Load Level 1");
            System.out.println("2. Load Level 2");
            System.out.println("3. Load Level 3");
            System.out.println("4. Load Current Game");//use progress handler
            System.out.println("5. Return to Main Menu");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = level1;
                    return;
                case "2":
                    current = level2;
                    return;
                case "3":
                    current = level3;
                    return;
                case "4":
                    if(progress!= null)
                    {
                        current = progress;
                    }
                    else
                    {
                        System.out.println("No File Found");
                    }
                    return;
                case "5":
                    current = mMenu;
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }    
}

class save extends State {
    void enter() {
        System.out.println("***Save Game***");
        System.out.println("Game has been saved.");
    }

    void update() {
        while (true) {
            System.out.println("1. Return to Game");
            System.out.println("2. Return to Main Menu");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            switch (input) {
                case "1":
                    current = progress;
                    return;
                case "2":
                    current = mMenu;
                    return;
                default:
                    System.out.println("Error. Try Again.");
            }
        }
    }
}

public class ColtonChrane_PolymorphismLab {

    public static void main(String[] args) {
        State.mMenu = new mMenu();
        State.credit = new credit();
        State.options = new options();
        State.level1 = new level1();
        State.level2 = new level2();
        State.level3 = new level3();
        State.save = new save();
        State.load = new load();
        State.current = State.mMenu;
        
        while(true)
        {
            State.current.enter();
            State.current.update();
        }
        
    }

}
