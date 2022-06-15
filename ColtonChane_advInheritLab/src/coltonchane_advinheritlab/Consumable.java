package coltonchane_advinheritlab;

abstract class Consumable extends Item
{
    int numberOfCharges;
    public void Consumable(int charges)
    {
        super.Item(name, value);
        numberOfCharges = charges;
    }
    public String toString()
    {
        String i = "Name: \t" + name + "\n Value: \t" + value + "\n Charges Remaining: \t" + numberOfCharges;
        return i;
    }
   public abstract void use();
   public abstract void use(Item item);
}
