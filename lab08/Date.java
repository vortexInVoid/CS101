/**
 * Date
 */
import java.util.ArrayList;

public class Date {

    private int day;
    private int month;
    private int year;
    private static ArrayList<Integer> daysOfMonth = initDaysInMonth();

    public Date(int day,int month,int year)
    {
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    public Date(String date)
    {
        setYear(Integer.parseInt(date.substring(0,date.indexOf("-"))));
        setMonth(Integer.parseInt(date.substring(date.indexOf("-")+1,date.lastIndexOf("-"))));
        setDay(Integer.parseInt(date.substring(date.lastIndexOf("-")+1,date.length())));
    }

    public Date(Date date)
    {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    // Here we have getters
    public int getDay()
    {
        return this.day;
    }
    public int getMonth()
    {
        return this.month;
    }
    public int getYear()
    {
        return this.year;
    }
    public ArrayList<Integer> getArrayList()
    {
        return daysOfMonth;
    }

    // Here we have setters
    public void setYear(int year)
    {
        if(year > 0 && year < 10000)
        {
        this.year = year;
        }
    }
    public void setMonth(int month)
    {
        if (month <13 && month > 0)
        {
        this.month = month;
        }
    }
    public void setDay(int day)
    {
        if (day <= daysOfMonth.get(month))
        {
            this.day = day;
        }
        else if (isLeapYear(year) && this.month == 2 && day <=29)
        {
            this.day = day;
        }
    }

    /**
     * Checks whether the given year is leap or not
     * @param year
     * @return true or false
     */
    public boolean isLeapYear(int year)
    {
        if (year % 100 == 0)
        {
            if (year % 400 != 0)
            {
                return false;
            }
        }
        if (year % 4 == 0)
        {
            return true;
        }
        return false;
    }
    /**
     * casts the date objects attributes to a compact string form
     */
    public String toString()
    {
        String dummyDay = Integer.toString(this.day);
        String dummyMonth = Integer.toString(this.month);
        String dummyYear = Integer.toString(this.year);
        return dummyYear+"-"+dummyMonth+"-"+dummyDay;
    }
    /**
     * Checks whether given date is before or not
     * @param date
     * @return true if this is before else false
     */
    public boolean isBefore(Date date)
    {
        if (this.year <= date.year)
        {
            if (this.month <= date.month)
            {
                if(this.day < date.day)
                {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    // In case of leap year february is not setted to 29 !!!
    public static ArrayList<Integer> initDaysInMonth()
    {
        ArrayList<Integer> daysOfMonth = new ArrayList<Integer>();
        daysOfMonth.add(-1);
        for (int i =1 ; i<=12 ;i++)
        {
            if (i == 4  || i == 6  || i == 9 || i == 11 )
            {
                daysOfMonth.add(30);
            }
            else if (i == 2)
            {
                daysOfMonth.add(28);
            }
            else
            {
            daysOfMonth.add(31);
            }
        }
        return daysOfMonth;
    }
    /**
     * Counts the days between given dates by converting all months and years to corresponding days and then substracts
     * @param x
     * @return number of days
     */
    public int daysBetween(Date x )
    {
        int sumA = 0;
        int sumB = 0;
        for(int i =1; i<x.year;i++)
        {
            if(isLeapYear(i))
            {
                sumA += 366;
            }
            else{
                sumA += 365;
            }
        }
        for(int i =1; i<this.year;i++)
        {
            if(isLeapYear(i))
            {
                sumB += 366;
            }
            else{
                sumB += 365;
            }
        }
        for(int i = 1;i<x.month;i++)
        {
            if(isLeapYear(i) && i ==2)
            {
                sumA+= 29;
            }
            else 
            {
                sumA += daysOfMonth.get(i);
            }
        }
        for(int i = 1;i<this.month;i++)
        {
            if(isLeapYear(i) && i ==2)
            {
                sumB+= 29;
            }
            else 
            {
                sumB += daysOfMonth.get(i);
            }
        }
        sumA += x.day;
        sumB += this.day;
        if(sumA < sumB)
        {
            return sumB-sumA;
        }
        else 
        {
            return sumA-sumB;
        }
        
    }
    /**
     * adds days to the date object given
     * @param days
     */
    public void addDays(int days)
    {
        for(int i = 1;i<this.month;i++)
        {
            if(isLeapYear(this.year) && i ==2)
            {
                days+= 29;
            }
            else 
            {
                days += daysOfMonth.get(i);
            }
        }
        days += this.day;
        this.day =1;
        this.month= 1;
        
        while (days >= 365)
        {
            if (isLeapYear(this.year +1))
            {
                days -= 366;
            }
            else
            {
                days -= 365;
            }
            this.year++;
        }
        int i =1;
        int limiter = daysOfMonth.get(1);
        while (days <365 && days > limiter )
        {
            if (isLeapYear(this.year) && i ==2)
            {
                this.month+=1;
                days -= 29;
            }
            else
            {
                this.month+=1;
                days -= daysOfMonth.get(i);
            }
            i++;
            limiter = daysOfMonth.get(i);
            if (isLeapYear(this.year) && i ==1)
            {
                limiter = limiter+1;
            }
        }
        if (days > 0)
        {
            this.day = days;
        }
    }
}