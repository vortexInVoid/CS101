
/**
 * Page
 */

public class Page {
    private char[] content = new char[50];

    public Page(int contentSize)
    {
        this.content = new char[contentSize];
        for(int i = 0; i<contentSize;i++)
        {
            this.content[i] = '-';
        }
    }

    public void writePage(String write)
    {
        int i = 0;

        while(i < this.content.length && i < write.length())
        {
            this.content[i] = write.charAt(i);
            i++;
        }
    }

    public String toString()
    {
        String stringed = "";
        for(char element:this.content)
        {
            stringed += element;
        }
        return stringed;
    }

}