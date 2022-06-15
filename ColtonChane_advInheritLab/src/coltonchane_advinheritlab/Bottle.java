package coltonchane_advinheritlab;

public class Bottle extends Tool
{
    int uses;
    public Bottle()
    {
      super.Item("Bottle","Tool");
      super.Tool(grade.MINT);
      uses = 0;
    }
    public String toString()
    {
        String i = "Name: \t" + name + "\n Value: \t" + value + "\n Grade: \t" + grade+ "\n Use Count: \t" + uses;
        return i;
    }
    public void use()
    {
        if(uses>30)
        {
           System.out.println(name + " is broken");
        }
        else
        {
            if(uses>25)
            {
                super.Tool(grade.POOR);
            }
            if(uses>15)
            {
                super.Tool(grade.USED);
            }
            if(uses>5)
            {
                super.Tool(grade.LIKE_NEW);
            }
        uses ++;
        System.out.print(name + "was used");
        }
    }
    public void use(Item item)
    {   
        if(uses>30)
        {
           System.out.println(name + " is broken");
        }
        else
        {
            if(uses>25)
            {
                super.Tool(grade.POOR);
            }
            if(uses>15)
            {
                super.Tool(grade.USED);
            }
            if(uses>5)
            {
                super.Tool(grade.LIKE_NEW);
            }
            if(item.value.equals("Consumable"))
            {
                item.use();
                System.out.println(" and squeezed into the " + name);              
                uses++;
            }
            else
            {
                System.out.println("Items dont interact.Try again.");
            }
        }
    }
}
