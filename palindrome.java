import java.util.Scanner;

public class palindrome{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter A Positive Integer");
		int number = input.nextInt();
		
	boolean condition = checkPalindrome(number);
		if(condition){
			System.out.print(number + " is a palindrome number ");
		}else{
			System.out.print(number + " is not a palindrome number ");
			}
			

		}
	
		public static boolean checkPalindrome(int number){
			String numberToString ="" + number;
			int number1 = numberToString.length()-1;
			int number2 = 0;
			int remainder = 0;
			String stringResult = "";
			for(int count = 0;count<numberToString.length();count++){
				number2 = number%10;
				remainder = number/10;
				number = remainder;
				stringResult +="" + number2;	
			}
		int result = Integer.parseInt(stringResult);
			System.out.println(result);
			if(numberToString.equals(stringResult)){
				return true;
			}else{
					return false;
				}
		}

}