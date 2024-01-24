import java.util.Scanner;

public class DisplaySquareAsterisks{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter The Side Of The Sqaure ");
		int number = input.nextInt();
		
		printSquare(number);

	}
	public static void printSquare(int number){
		for(int count = 0; count<number; count++){
			for(int counter = 0; counter<number;counter++){
			System.out.print("* ");
			}
			System.out.println();
		}

	}


}