package coltonchane_advinheritlab;
import java.util.Scanner;

public class ColtonChane_advInheritLab {

    public static void main(String[] args)
    {
        String firstItem = "1";
        String secondItem;
        Scanner in = new Scanner(System.in);
        Knife k = new Knife();
        Bottle b = new Bottle();
        Grape g = new Grape();
        Apple a = new Apple();
        while(firstItem.equals("1")||firstItem.equals("2")||firstItem.equals("3")||firstItem.equals("4")||firstItem.equals("6"))
        {
            System.out.println("*****************************");
        System.out.println("1. " + a.name);
        System.out.println("2. " + g.name);
        System.out.println("3. " + k.name);
        System.out.println("4. " + b.name);
        System.out.println("5. Exit");
        System.out.println("6. Inventory Details");
        System.out.println("Which item will you use: ");
        firstItem = in.nextLine();
        switch (firstItem.trim())
        {
            case "1":
                System.out.println("Which item will be used with the " + a.name + "? (0 for none): ");
                secondItem = in.nextLine();
                switch(secondItem.trim())
                {
                    case "1":
                        a.use(a);
                        break;
                    case "2":
                        a.use(g);
                        break;
                    case "3":
                        k.use(a);
                        break;
                    case "4":
                        b.use(a);
                        break;
                    case "0":
                        a.use();
                        System.out.println();
                        break;
                }
                break;
            case "2":
                System.out.println("Which item will be used with the " + g.name + "? (0 for none): ");
                secondItem = in.nextLine();
                switch(secondItem)
                {
                    case "1":
                        g.use(a);
                        break;
                    case "2":
                        g.use(g);
                        break;
                    case "3":
                        k.use(g);
                        break;
                    case "4":
                        b.use(g);
                        break;
                    case "0":
                        g.use();
                        System.out.println();
                        break;
                }
                break;
            case "3":
                System.out.println("Which item will be used with the " + k.name + "? (0 for none): ");
                secondItem = in.nextLine();
                switch(secondItem)
                {
                    case "1":
                        k.use(a);
                        break;
                    case "2":
                        k.use(g);
                        break;
                    case "3":
                        k.use(k);
                        break;
                    case "4":
                        k.use(b);
                        break;
                    case "0":
                        k.use();
                        System.out.println();
                        break;
                }
                break;
            case "4":
                System.out.println("Which item will be used with the " + k.name + "? (0 for none): ");
                secondItem = in.nextLine();
                switch(secondItem)
                {
                    case "1":
                        b.use(a);
                        break;
                    case "2":
                        b.use(g);
                        break;
                    case "3":
                        b.use(k);
                        break;
                    case "4":
                        b.use(b);
                        break;
                    case "0":
                        b.use();
                        System.out.println();
                        break;
                }
                break;
            case "5":
                System.out.println("Exiting program");
                break; 
            case "6":
                System.out.println(a.toString());
                System.out.println(g.toString());
                System.out.println(k.toString());
                System.out.println(b.toString());

        }
                
        

        
        }
    }
}



