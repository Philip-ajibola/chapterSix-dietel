import java.security.SecureRandom;
import java.util.Scanner;
public class ComputerAssistedInstruction1{
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
	
	public void pickCorrectResponse(){
			int number = 1 + random.nextInt(4);
		switch(number){
			case 1:
				System.out.println("Very good!");
			break;
			case 2:
				System.out.println("Excellent!");
			break;
			case 3:
				System.out.println("Nice work!");
			break;
			default:
				System.out.println("Keep up the good work!");
		}

	}
	
	public void pickWrongResponse(){
			int number = 1 + random.nextInt(4);
		switch(number){
			case 1:
				System.out.println("No. Please try again.");
			break;
			case 2:
				System.out.println("Wrong. Try once more.");
			break;
			case 3:
				System.out.println("Don't give up!");
			break;
			default:
				System.out.println("No. Keep trying!");
		}




	}



}