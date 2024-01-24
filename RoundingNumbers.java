import java.util.Scanner;

public class RoundingNumbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter A Decimal Number ");
		double number = input.nextDouble();
		double numberRounded = Math.floor(number + 0.5);
		
		System.out.println("The Original Decimal Number You Input is  " + number);

			System.out.printf("The Rounded Decimal Number You Input is %.0f%n ",numberRounded);
	}




}