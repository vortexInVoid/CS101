/**
 * Application
 * This is the application for the homework II. Here we test sorting algorithm with a list of objects. SQL is coming.
 */

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        //Created books for Ms Lori Russel Dağ's new year gift booklist.

        Book masteringJava = new Book("Mastering Java", "Lori Rae Russel Dag", "Fictional legendary Coursebook for CS101. Written by a wonderful professional", 50.47, true, false, "1-5-2010");
        Book masteringPyhton = new Book("Mastering Python", "ipek Sozen", "Coursebook for CS115. You will have pyhton eaten itself", 42.99, true, false, "11-10-2011");
        Book radicals = new Book("Radicals", "Saul D. Alinsky", "A pragmatic Primer for Realistic Radicals", 9, true, false,"01-02-1977");
        Book faust = new Book("Faust", "Wolfgang von Goethe", "The folk story couldn't be told any better", 26, false, true, "01-5-1808");
        Book signalsAndSystems = new Book("Signals and Systems", "Douglas K. Lindner", "An introducary book for signals and systems. Digital signals and continous time signals will be parted.", 100, true, false, "01-01-1999");
        Book newFaust = new Book(faust);

        //Create the list
        ArrayList<Book> giftsToLori = new ArrayList<Book>();

        //Add books to the list
        giftsToLori.add(masteringJava);
        giftsToLori.add(masteringPyhton);
        giftsToLori.add(radicals);
        giftsToLori.add(faust);
        giftsToLori.add(signalsAndSystems);
        giftsToLori.add(newFaust);

        //ArrayList<Book> sorted = sortingByPrice(giftsToLori);
        /*
        for (int i = 0; i<sorted.size();i++)
        {
            System.out.println(sorted.get(i).getPrice_USD());
        }
        */
        //System.out.println(masteringJava.toString());

        //Sort the book list
        giftsToLori = sortingByPrice(giftsToLori);
        //Find the given object's index of the desired property
        int itemIndex = binarySearch(giftsToLori, 42.99);
        //Print the results to the console
        if (itemIndex < giftsToLori.size() && itemIndex >= 0)
        {
            System.out.println(giftsToLori.get(itemIndex).toString());
        }
        else
        {
            System.out.println("Your desired property cannot be found in the Ms. Lori Russel Dag's gift list!");
        }
    }

    /*
    The sorting algorithm have been implemented by me. It basically adds the least value found in the original list
    to a new list and removes the added object from the original list.
    With this way loop iterates through a smaller and smaller list untill eventually the original list dries up.
    It's efficient but creates two ArrayLists which consumes more memory than a single one. 
    */

    public static ArrayList<Book> sortingByPrice(ArrayList<Book> list)
    {
        ArrayList<Book> sorted = new ArrayList<Book>();

        while (list.size()>0)
        {
            int i = 0;
            int dummy = 0;
            while (i<list.size())
            {
                if (list.get(i).lessThan(list.get(dummy)))
                {
                    dummy = i;
                }
                i++;
            }
            sorted.add(list.get(dummy));
            list.remove(list.get(dummy));
        }
        return sorted;
    }

    /**
     * An alternative sorting method.
     * @param list
     * @return
     */
    public static ArrayList<Book> sortingByPriceAlternative(ArrayList<Book> list)
    {
        //System.out.println("How would you like the books to be sorted?\n1-Price in USD\n2-Description length\n");
        ArrayList<Book> sorted = new ArrayList<Book>();

        while (list.size() >0)
        {
        double maxPrice = 0;

        for(Book books:list)
        {
            if (books.getPrice_USD() > maxPrice)
            {
                maxPrice = books.getPrice_USD();
            }
        }

        for(int i = 0;i<list.size();i++)
        {
            if (list.get(i).getPrice_USD() == maxPrice)
            {
                sorted.add(list.get(i));
                list.remove(i);
            }
        }
        }
        return sorted;
    }

    /*
    The binary search algorithm sorts the elements with some reference and then divides the list when the targeted value haven't been found in the list.
    Then adjusts the border and finds it.
    Algorithm is very efficient when we compare element by by element. In a statistical perspective it finds elements faster than just iteration.
    This is because of the sorted nature of the list objects. This gives a chance to skip unnecessear smaller/larger object properties.
    */

    /**
     * Delivers the first occurance of the the given property for an object index
     * @param yourBookList The sorted list you want to be searched
     * @param desiredPrice The desired price you search in the book list.
     * @return
     */
    public static int binarySearch(ArrayList<Book> yourBookList,double desiredPrice)
    {
        //ArrayList<Book> sorted = sortingByPrice(yourBookList);
        /*
        for (int i = 0; i<sorted.size();i++)
        {
            System.out.println(sorted.get(i).getPrice_USD());
        }
        */
        ArrayList<Book> sorted = yourBookList;

        int upperBound = sorted.size()-1;
        int lowerBound = 1;
        int midpoint;

        while (upperBound >= lowerBound){

            midpoint = lowerBound + (upperBound-lowerBound) / 2;
            if(sorted.get(midpoint).getPrice_USD() == desiredPrice)
            {
                return midpoint;
            }
            if(sorted.get(midpoint).getPrice_USD() > desiredPrice)
            {
                upperBound = midpoint-1;
            }
            if(sorted.get(midpoint).getPrice_USD() < desiredPrice)
            {
                lowerBound = midpoint+1;
            }
        }
        return -1;
    }
}