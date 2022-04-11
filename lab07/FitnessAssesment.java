import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * FitnessAssesment
 */
public class FitnessAssesment {
    // Declare object states
    private double height = -1;
    private double weigth = -1;
    private double restingHeartRate = -1;
    private double waist = -1;
    private double hips = -1;
    private char gender = 'o';
    private LocalDate birthdate;
    //initialize object states
    public FitnessAssesment(double h, double w, double r,double wa, double hi,char g, String date)
    {
        setHeight(h);
        setBirthDate(date);
        setGender(g);
        setRestingHR(r);
        setWeight(w);
        sethips(hi);
        setwaist(wa);
    }
    //Here we have behaviours!
    public double calculateTargetHeartRate()
    {
        return 0.85 * calculateMaxHeartRate();
    }
    
    public double calculateMaxHeartRate()
    {
        return (220 - calculateAge()) ;
    }

    public long calculateAge()
    {
        return ChronoUnit.YEARS.between(birthdate, LocalDate.now());
    }

    public double calculateWaistHipRatio()
    {
        return waist/hips;
    }

    public double calculateBMI()
    {
        return weigth/(height*height);
    }

    public String findBMICategory()
    {
        double bmi = calculateBMI();
        if (bmi > 30)
        {
            return "Obese";
        }
        else if (25 <= bmi && 30 > bmi)
        {
            return "Overweight";
        }
        else if (20 <= bmi && 25 > bmi)
        {
            return "Normal";
        }
        else if ( bmi < 20 && bmi >= 0)
        {
            return "Underweight";
        }
        else return null;
    }
    public String determineFitnessLevel()
    {
        short total = 0;
        if (calculateBMI() <= 24 && calculateBMI() >= 20)
        {
            total++;
        }
        if (restingHeartRate < 70)
        {
            total++;
        }
        if ((gender == 'm' && calculateWaistHipRatio() < 1) || (gender == 'f' && calculateWaistHipRatio() < 0.9) );
        {
            total++;
        }
        if (total == 3)
        {
            return "Excellent";
        }
        else if (total == 2)
        {
            return "Good";
        }
        else if (total == 1)
        {
            return "Average";
        }
        else 
        {
            return "Poor";
        }
    }

    //Here we have getters!
    public double getHeight(){
        return this.height;
    }
    public double getWeight(){
        return this.weigth;
    }
    public double getRestingHR(){
        return this.restingHeartRate;
    }
    public double getWaist(){
        return this.waist;
    }
    public double getHips(){
        return this.hips;
    }
    public char getGender(){
        return this.gender;
    }
    public LocalDate getBirthDate(){
        return this.birthdate;
    }
    // Here we have Setters!
    public void setHeight(double h)
    {
        if (h<2.5 && h >0)
        {
        this.height = h;
        }
    }
    public void setWeight(double w)
    {
        if (w > 0)
        {
        this.weigth = w;
        }
    }
    public void setRestingHR(double r)
    {
        if (r >0)
        {
        this.restingHeartRate = r;
        }
    }
    public void setwaist(double wa)
    {
        if (wa >0)
        {
        this.waist = wa;
        }
    }
    public void sethips(double hi)
    {
        if (hi > 0)
        {
        this.hips = hi;
        }
    }
    public void setGender(char g){
        if (g == 'm' || g == 'M'){
        this.gender = 'm';
        }
        else if (g == 'f' || g == 'F'){
        this.gender = 'f';
        }
    }
    public void setBirthDate(String date){
    this.birthdate = LocalDate.parse(date);
    }

}