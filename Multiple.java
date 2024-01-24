import java.util.Scanner;

public class Multiple{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		for(int count = 0;count<3;count++){
		System.out.println("Enter Your First Number (positive number) ");
			int number = input.nextInt();
			while(number<0){
				System.out.println("Please Enter A Positive Number ");
				number = input.nextInt();
			}
		System.out.println("Enter Your Second Number (positve number) ");
			int number1 = input.nextInt();		
			while(number1<0){
				System.out.println("Please Enter A Positive Number ");
				number1 = input.nextInt();
			}
			boolean condition = checkMultiple(number,number1);
			if(condition){
				System.out.println(number1 + " is a multiple of " + number);

				}else{
					System.out.println(number1 + " is not a multiple of " + number);
			System.out.println();

				}
		}

	}
	public static boolean checkMultiple(int number, int number1){
		if(number%number1==0){
			return true;
		}else{
			return false;
		}			


	}


}