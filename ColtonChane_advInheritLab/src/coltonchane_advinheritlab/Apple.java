package coltonchane_advinheritlab;

public class Apple extends Consumable 
{
    String action = "";
    public Apple()
    {
        super.Item("Apple","Consumable");
        super.Consumable(15);
    }
    public String toString()
    {
        String i = "Name: \t" + name + "\n Value: \t" + value + "\n Charges Remaining: \t" + numberOfCharges;
        return i;
    }
    public void use()
    {
        if(numberOfCharges<1)
        {
            System.out.println("Can't use out of charges");
        }
        else
        {
            numberOfCharges--;
            System.out.print(name + " was used");

        }
    }
    public void use(Item item)
    {
        if(numberOfCharges<1)
        {
            System.out.println("Can't use out of charges");
        }
        else
        {
            if(item.value.equals("Consumable"))
            {
                System.out.println("Items dont interact. Try again."); 
            }
            else
            {
                numberOfCharges--;
                item.use();
                System.out.println(" with " + name);
            }
        }
    }
}
