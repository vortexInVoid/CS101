
/**
 * Notebook
 */
public class Notebook {

    private Page[] pages = new Page[100];
    private int currentPageIndex = 0;

    public Notebook(int pageCount,int pageSize)
    {
        this.pages = new Page[pageCount];
        for(int i = 0;i<pageCount;i++)
        {
            this.pages[i] = new Page(pageSize);
        }
    }
    public void writeNote(String written)
    {
        this.pages[this.currentPageIndex].writePage(written);
        this.currentPageIndex = this.currentPageIndex +1;
    }
    public void printNotebook()
    {
        for(int i = 0 ; i <this.pages.length;i++)
        {
            System.out.println(i+".\t" + this.pages[i].toString());
        }
    }
}