package temperatureconverter;
import java.util.Scanner;


public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userTemperature = new Scanner(System.in); // Stores user entered temperature
		Scanner userSelection = new Scanner(System.in); // Stores user input if user wants to convert to Fahrenheit or Celsius.
		
		System.out.println("Enter your temperature.");
		double Temperature = userTemperature.nextDouble();
		
		System.out.println("Press 1 if you want to convert to Fahrenheit. Press 2 if you want to convert to Celsius. ");
		int selection = userSelection.nextInt();
		
		if(selection == 1) 
		{
			float Fahrenheit = (float) (((9/5) * Temperature) + 32);
			System.out.println("Your temperature " + Temperature + " in Celsius is " + Fahrenheit + " degrees Fahrenheit.");
		}
		
		if(selection == 2) 
		{
			float Celsius = (float) ((Temperature - 32) * (5/9));
			System.out.println("Your temperature " + Temperature + " in Fahrenheit is " + Celsius + " degrees Celsius.");
		}
		
		userTemperature.close();
		userSelection.close();
	}

}
