import java.util.Scanner;

public class ParkingCharges{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	int hour = 0;
	double charges = 0;
	double runningTotal = 0;
	for(int count = 0;count<4;count++){
		System.out.printf("Enter customer %d hours parked %n",count+1);
			hour = input.nextInt();
			charges = calculateCharges(hour);
		System.out.printf("Your charges for the hours you spent is %.2f%n",charges);
		System.out.println();
			runningTotal +=charges;
	}
	System.out.println();
	System.out.printf("The Running Total Of Yesterday Reciept Is %.2f%n",runningTotal);	
	System.out.println();
	System.out.println("The price to park for up to three hours is $2.00 ");
	System.out.println("After Three Hour $0.50 is added to your charges ");
	System.out.println("The Charges For a day (24 hours) is $10.00");

	}
	public static double calculateCharges(int hour){
		double price = 0;
		if(hour<=3){
			price = 2.00;
		}
		else if(hour>3 && hour<16){
				price = (hour - 3)*0.50 + 2.00;

			}
		else if(hour>=16 && hour<=24){
				price = 10.00;
			}
		return price;

	}


}