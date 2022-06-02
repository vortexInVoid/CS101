import java.time.LocalDate;

/**
 * Book
 * Book class is a visual description of a book. Inspired by the Global Amazon Bookstore.
 */
public class Book {

    private String name;
    private String author;
    private  String description;

    private int ID;
    private double price_USD; 

    private boolean isHardcopy;
    private boolean isTranslation;

    private LocalDate published;

    private static int numberOfRegisters = 0;

    public Book(String name,String author, String description, double price_USD, boolean isHardcopy, boolean isTranslation,String published)
    {
        setAuthor(author);
        setName(name);
        setDescription(description);
        setPrice(price_USD);
        setIsHardcopy(isHardcopy);
        setIsTranslation(isTranslation);
        setPublished(published);
        setId();
    }

    //The copy constructor
    public Book(Book x)

    {
        this.author = x.author;
        this.name = x.name;
        this.description = x.description;
        this.price_USD = x.price_USD;
        this.isHardcopy = x.isHardcopy;
        this.isTranslation = x.isTranslation;
        this.published = x.published;
        setId();
    }

    //Setters
    public void setName(String var)
    {
        this.name = var;
    }
    public void setAuthor(String var)
    {
        this.author = var;
    }
    public void setDescription(String var)
    {
        this.description = "------------------\n" + var +"\n------------------";
    }
    public void setId()
    {
        numberOfRegisters = numberOfRegisters +1;
        this.ID = 1000 + numberOfRegisters;
    }
    public void setPrice(Double var)
    {
        this.price_USD = var;
    }
    public void setIsHardcopy(boolean var)
    {
        this.isHardcopy = var;
    }
    public void setIsTranslation(boolean var)
    {
        this.isTranslation = var;
    }
    public void setPublished(String var)
    {
        int day = Integer.parseInt(var.substring(0,var.indexOf("-")));
        int month = Integer.parseInt( var.substring(var.indexOf("-")+1,var.lastIndexOf("-")));
        int year = Integer.parseInt(var.substring(var.lastIndexOf("-")+1,var.length()));
        this.published = LocalDate.of(year, month, day);
    }

    //Getters
    public String getName()
    {
        return this.name;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public String getDescription()
    {
        return this.description;
    }
    public int getID()
    {
        return this.ID;
    }
    public double getPrice_USD()
    {
        return this.price_USD;
    }
    public boolean getIsHardcopy()
    {
        return this.isHardcopy;
    }
    public boolean getIsTranslation()
    {
        return this.isTranslation;
    }
    public String getPublished()
    {
        return this.published.toString();
    }
    public int getNumberRegistered()
    {
        return numberOfRegisters;
    }
    public boolean equals(Book x)
    {
        if (this.ID == x.ID)
        {
            return true;
        }
        else return false;
    }
    /**
     * Checks whether the given book is cheaper than the compared one
     * @param x
     * @return
     */
    public boolean lessThan(Book x)
    {
        if(this.price_USD <= x.price_USD)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * Casts the string summary of a book
     */
    
    public String toString()
    {
        String hardCopy; 
        String translation;

        if (this.isHardcopy == true)
        {
            hardCopy  = "Yes.";
        }
        else
        {
            hardCopy = "No!";
        }
        if (this.isTranslation == true)
        {
            translation = "Yes!";
        }
        else{
            translation = "No.";
        }

        String stringedBook;
        stringedBook = "Book Name = " + this.name + "\n" + "Book Author = " + this.author + "\n" + "Book Published In = " + this.published.toString() +"\n"+ "Book Price = " + this.price_USD +"\n";
        stringedBook += "Book Description" +"\n" + this.description + "\n" + "Book Translated " + translation + "\nBook Hardcopy " + hardCopy;
        return stringedBook;
    }

}