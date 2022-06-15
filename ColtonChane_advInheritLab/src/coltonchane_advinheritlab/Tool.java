package coltonchane_advinheritlab;

abstract class Tool extends Item
{
    public enum Grade{
        MINT,
        LIKE_NEW,
        USED,
        POOR
    }
    Grade grade;
    public void Tool(Grade grade)
    {
        super.Item(name, value);
        this.grade = grade;
    }
    public String toString()
    {
        String i = "Name: \t" + name + "\n Value: \t" + value + 
                "\n Grade: \t" + grade;
        return i;
    }
    public abstract void use();
    public abstract void use(Item item);

}
