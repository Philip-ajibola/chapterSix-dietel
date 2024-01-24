import java.util.Scanner;

public class TestLeapYear{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter The Year You Want To Check For ");
			int year = input.nextInt();

			isLeapYear(year);
	}
	public static void isLeapYear(int year){
		if(year%4==0){
			System.out.print(year + " is a leap year ");
		}else{
			System.out.print(year + " is not a leap year ");

		}
		
	}



}