
import java.util.Scanner;
public class Lab02_Q2_Ertan 
{
	public static void main(String[] args)
	{
		String countryCode;

		String cityCode;

		String phoneNumber;

		//Create the scanner object

		Scanner input;

		//Create variable string

		String telephoneNumber;

		input = new Scanner(System.in);

		//Print ouput message

		System.out.print("Please enter your phone number: ");

		telephoneNumber = input.nextLine();

		//Close scanner to save resources

		input.close();

		//Start string manipulation 

		//Remove spaces

		telephoneNumber =  telephoneNumber.replace(" ", "");

		//Define indexes for string navigation


		int firstParanthesis;

		int secondParanthesis;

		int firstDash;

		//Find the indexes of delimiters

		firstParanthesis = telephoneNumber.indexOf("(");

		secondParanthesis = telephoneNumber.indexOf(")");

		firstDash = telephoneNumber.indexOf("-");

		//Assign the given variables and Finally print out the results

		countryCode = telephoneNumber.substring(firstParanthesis +1, secondParanthesis);

		cityCode = telephoneNumber.substring(secondParanthesis +1,firstDash);

		phoneNumber = telephoneNumber.substring(firstDash +1, telephoneNumber.length());

		System.out.printf("Country code is : %s\nCity code is : %s\nPhone number is : %s .",countryCode,cityCode,phoneNumber);



		



















	}

}
