import java.util.Scanner;

public class SumOfDigit{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter A Four Digit Number (1234) ");
		String number = input.next();
		
	while(number.length() != 4){
			System.out.println("Please enter a four digit number ");
				number = input.next();

		}

		sumDigit(number);

	}
	public static void sumDigit(String number){
			String number1 = "";
			int total = 0;
		for(int count = 0; count<number.length();count++){
			
		 number1 ="" + number.charAt(count);
		total += Integer.parseInt(number1);
		
	}
		
		System.out.println("The sum of the digit is " + total);
	

		}



}