import java.util.Scanner;
import java.security.SecureRandom;

public class GuessTheNumber{
	private static Scanner input = new Scanner(System.in);
	//private static SecureRandom randomNumber = new SecureRandom();

	public static void checkerUserGuessedNumber(SecureRandom random){
		
		final int RANDOM = 1+random.nextInt(1000);
			System.out.println("Guess A number ");
				int userGuess = input.nextInt();

			while(RANDOM!=userGuess){
				if(RANDOM>userGuess){
					System.out.println("\nToo low. Try Again\nGuess A Number ");
			userGuess = input.nextInt();
				}
				else if(RANDOM<userGuess){
					System.out.println("\nToo high. Try Again/nGuess A Number ");
			userGuess = input.nextInt();
				}

			}
			if(RANDOM==userGuess){
			System.out.print("Congratulations!!! Your Guess Was Right ");
		}
	}
		
}