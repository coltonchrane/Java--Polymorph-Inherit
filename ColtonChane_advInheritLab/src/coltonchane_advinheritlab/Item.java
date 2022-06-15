package coltonchane_advinheritlab;

abstract class Item 
{
    
    String name = new String();
    String value = new String();
    static int itemsCreated;
    public void Item(String name, String value)
    {
        this.name = name;
        this.value = value;
        itemsCreated ++;
    }
    public String toString()
    {
        String i = "Name: \t" + name + "\n Value: \t" + value ;
        return i;
    }
    public String getItemsCreated()
    {
        return "Items Created: \t" + itemsCreated;             
    }
    public abstract void use();
    public abstract void use(Item item);

}
