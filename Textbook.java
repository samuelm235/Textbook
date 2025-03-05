public class Textbook extends Book
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

    public boolean canSubstituteFor(Textbook t)
    {
        if(getTitle().equals(t.getTitle())) return edition >= t.edition;
        return false;
    }

    public String getBookInfo()
    {
        return super.getBookInfo() + "-" + edition;
    }

}