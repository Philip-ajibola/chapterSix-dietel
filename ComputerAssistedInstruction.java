import java.security.SecureRandom;
import java.util.Scanner;
public class ComputerAssistedInstruction{
	private  SecureRandom random = new SecureRandom();
	private Scanner input = new Scanner(System.in);
	private int firstNumber;
	private int secondNumber;

	public void generateNumber(){
			 firstNumber = 1 + random.nextInt(12);	
			secondNumber = 1 + random.nextInt(12);
	}

	public int collectAnswer(){

		System.out.printf("What is %d times %d ",firstNumber, secondNumber);
			int userInput = input.nextInt();
			return userInput;	
	}

	public int checkAnswer(){
		return firstNumber * secondNumber;
	}


}