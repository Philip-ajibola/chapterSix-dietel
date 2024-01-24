import java.util.Scanner;

public class DisplaySquareWithInputSymbol{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

	System.out.println("Enter The Side Of The Sqaure ");
		int number = input.nextInt();
	System.out.println("Enter The Symbol You Want To Print Your Square With ");
		String symbol = input.next();
		while(symbol.length()>1){
			System.out.println("Please Enter Just One Symbol");
			symbol = input.next();
		}
		char character = symbol.charAt(0);
		printSquare(number,character);

	}
	public static void printSquare(int number, char symbol){
		for(int count = 0; count<number; count++){
			for(int counter = 0; counter<number;counter++){
			System.out.print(symbol+" ");
			}
			System.out.println();
		}

	}


}