import java.util.Scanner;
import java.security.SecureRandom;

public class GuessTheNumberModified{
	private static Scanner input = new Scanner(System.in);
	//private static SecureRandom randomNumber = new SecureRandom();

	public static void checkerUserGuessedNumber(SecureRandom random){
		
		final int RANDOM = 1+random.nextInt(1000);
			int count = 0;
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
				count++;
			}
			if(RANDOM==userGuess){
			System.out.print("Congratulations!!! Your Guess Was Right ");
		}
			if(count>=10){
				System.out.println("\n You Got lucky");
			}
			else if(count==10){
				System.out.println("\nAha! You Know The the secret ");
			}else{
				System.out.println("\n You Should do better ");
			}
	}
		
}