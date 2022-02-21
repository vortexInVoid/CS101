import java.util.Scanner;

public class Lab02_Q3_Ertan 
{
	public static void main(String[] args) 
	{
		//Create the scanner object and our input paramee-ters

		System.out.print("Enter your weight(kg), height(cm) and age respectively: ");

		Scanner input = new Scanner(System.in);

		double weight;

		double height;

		double age;

		final double PAL = 1.4;

		final int caloriesPerFat = 9;

		final int caloriesPerProteinAndCarb = 4;

		weight = input.nextDouble();

		height = input.nextDouble();

		age = input.nextDouble();

		input.close();

		double bmr = 10 * weight + 6.25 * height - 5 * age - 161;

		double calories = bmr *PAL;

		double proteinRequired = calories*0.25/caloriesPerProteinAndCarb;

		double fatRequired = calories*0.3/caloriesPerFat;

		double carbRequired = calories*0.45/caloriesPerProteinAndCarb;

		System.out.printf("%18s\t %.2f\n%18s\t %.2f\n%18s\t %.2f\n%18s\t %.2f","Calories required:",calories,"GRAMS PROTEIN:",proteinRequired,"GRAMS FAT:",fatRequired,"GRAMS CARBS:",carbRequired);




		


		
		







	}

}
