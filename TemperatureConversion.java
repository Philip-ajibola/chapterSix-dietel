import java.util.Scanner;

public class TemperatureConversion{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
	System.out.println("Enter 1 to convert kelvin to celsius or 2 to convert celsius to kelvin");
		int number = input.nextInt();
		while(number<1 || number>2){
			System.out.println("Please!!! Enter 1 or 2 to Start the conversion");
	number = input.nextInt();

		}
	if(number == 1){
		System.out.println("Enter Temperature In Kelvin ");
			double temperature = input.nextDouble();
		System.out.printf("%.2f kelvin to Celsius is %.2f celsius",temperature,convertKelvinToCelsius(temperature));
			

	}
	if(number == 2){
		System.out.println("Enter Temperature In Celsuis ");
			double temperature = input.nextDouble();
		System.out.printf("%.2f celsius to Kelvin is %.2f celsius",temperature,convertCelsiusToKelvin(temperature));
			

	}



	}

	public static double convertCelsiusToKelvin(double number){
			double result = number + 273.15;
		return result;
	}

	public static double convertKelvinToCelsius(double number){
			double result = number - 273.15;
		return result;
	}

}