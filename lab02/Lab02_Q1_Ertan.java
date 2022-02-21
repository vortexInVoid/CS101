import java.util.Scanner;

public class Lab02_Q1_Ertan 
{
	public static void main(String[] args) 
	{
		// Define the variables for the input

		Scanner take;

		take = new Scanner(System.in);

		//Define conversion factors to find weights relative to EARTH, I have chosen SATURN,URANUS,NEPTUNE and finally PLUTO

		//To find conversion I use F = ma. Let us g denote acceleration due to mass of the planet. Mass is conserved therefore, F/a is constant in all planets. Thus F1/a2 = F2/a1 . Thus a2 = (F2*a1)/F1 .
        
		final double saturnToEarth = 53.0/50;

		final double uranusToEarth = 46.0/50;

		final double neptuneToEarth = 59.5/50;

		final double plutoToEarth = 1.0/50;

		// Now lets take the input
		
		System.out.print("Enter the weight of the first earthling (kg): ");

		double firstEarthlingOnEarth = take.nextDouble();

		System.out.print("\nEnter the weight of the second earthling (kg): ");

		double secondEarhtlingOnEarth = take.nextDouble();

		//Closed take to sace resources

		take.close();

		//Let us calculate their new weight

		//The first one is:

		double firstEarthlingOnSaturn = firstEarthlingOnEarth / saturnToEarth;

		double firstEarthlingOnUranus = firstEarthlingOnEarth / uranusToEarth;

		double firstEarthlingOnNeptune = firstEarthlingOnEarth / neptuneToEarth;

		double firstEarthlingOnPluto = firstEarthlingOnEarth / plutoToEarth;

		//Second one is:

		double secondEarthlingOnSaturn = secondEarhtlingOnEarth / saturnToEarth;

		double secondEarthlingOnUranus = secondEarhtlingOnEarth / uranusToEarth;

		double secondEarthlingOnNeptune = secondEarhtlingOnEarth / neptuneToEarth;

		double secondEarthlingOnPluto = secondEarhtlingOnEarth / plutoToEarth;

		// Now let us finally output our findings

		System.out.println("\t\t\tSATURN\tURANUS\tNEPTUNE\tPLUTO\n");
		System.out.printf("HALFLING ONE(%.1fkg)\t%.1f\t%.1f\t%.1f\t%.1f\n",firstEarthlingOnEarth,firstEarthlingOnSaturn,firstEarthlingOnUranus,firstEarthlingOnNeptune,firstEarthlingOnPluto);
        System.out.printf("HALFLING TWO(%.1fkg)\t%.1f\t%.1f\t%.1f\t%.1f",secondEarhtlingOnEarth,secondEarthlingOnSaturn,secondEarthlingOnUranus,secondEarthlingOnNeptune,secondEarthlingOnPluto);





		
	}

}
