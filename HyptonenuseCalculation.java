import java.util.Scanner;

public class HyptonenuseCalculation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	System.out.println("Enter side 1 of the triangle ");
		double side1 = input.nextDouble();

	System.out.println("Enter side 2 of the triangle ");
		double side2 = input.nextDouble();
		
		double result = calculateHypothenuse(side1,side2);
	System.out.println("The Hypothenuse Of Triangle is "+result);
	}

	public static double calculateHypothenuse(double side1,double side2){
			double result = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
		return result;

	}


}