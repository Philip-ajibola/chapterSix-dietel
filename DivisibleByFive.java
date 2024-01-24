import java.util.Scanner;

public class DivisibleByFive{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		for(int count = 0;count<10;count++){
		System.out.println("Enter A Number (positive number) ");
			int number = input.nextInt();
			while(number<0){
				System.out.println("Please Enter A Positive Number ");
				number = input.nextInt();
			}
		
			boolean condition = checkMultiple(number);
			if(condition){
				System.out.println(number + " is divisible by 5 " );

				}else{
					System.out.println(number + " is not divisble by 5 ");

				}
			System.out.println();
		}

	}
	public static boolean checkMultiple(int number){
		if(number%5==0){
			return true;
		}else{
			return false;
		}			


	}


}