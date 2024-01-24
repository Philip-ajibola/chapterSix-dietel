import java.util.Scanner;

public class RoundingNumbers2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a decimal number ");
		double number = input.nextDouble();
		 printRoundedValue(number);


	}
	public static void printRoundedValue(double value){
		System.out.println("The Original Decimal Number You Input is  " + value);
		double numberRounded = Math.floor(value + 0.5);
		System.out.printf("The Rounded Decimal Number You Input is %.0f%n ",numberRounded);
		numberRounded = Math.floor(value*10+0.5)/10;
		System.out.printf("The Rounded To Tenths Decimal Number You Input is %.1f%n ",numberRounded);
		numberRounded = Math.floor(value*100+0.5)/100;
		System.out.printf("The Rounded To Hundredth Decimal Number You Input is %.2f%n ",numberRounded);
		numberRounded = Math.floor(value*1000+0.5)/1000;
		System.out.printf("The Rounded To Thousandth Decimal Number You Input is %.3f%n ",numberRounded);

	}



}