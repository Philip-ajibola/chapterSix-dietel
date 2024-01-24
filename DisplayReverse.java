import java.util.Scanner;

public class DisplayReverse{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);	
			int number = 0;
			String number1 = "" ;
		System.out.println("Enter A Five Digit Number ");
			if(input.hasNextInt()){
				number = input.nextInt();
				while(number>100_000 || number<10_000){
					System.out.println("Please Read The Given Instruction!!! \n Enter A Five Digit Number ");
						number = input.nextInt();
					
				}	
			}else{
				System.out.println("Enter An Integer Please!!!!\n Enter A Five Digit Number");
						number = input.nextInt();
					while(number>100_000 || number<10_000){
						System.out.println("Please Read The Given Instruction!!! \n Enter A Five Digit Number ");
						number = input.nextInt();
					
					}	
				}

					printReverseOfNumber(number);
	}

	public static void printReverseOfNumber(int number){
			String convertNumber = "" + number;
			int length = convertNumber.length();
			String reverse ="";
			for(int count = length-1; count>=0; count--){
				reverse +="" + convertNumber.charAt(count);
					
				}
			System.out.printf("The Reverse Of %d is %s",number,reverse);
	}


}