public class Textbook extends book
{
    private int edition;
    public Textbook(String title, double price, int ed)
    {
        super(title, price);
        edition = ed;
    }
    
    public int getEdition()
    {
        return edition;
    }
}