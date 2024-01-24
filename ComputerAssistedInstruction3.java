import java.security.SecureRandom;
import java.util.Scanner;
public class ComputerAssistedInstruction3{
	private  SecureRandom random = new SecureRandom();
	private Scanner input = new Scanner(System.in);
	private int firstNumber;
	private int secondNumber;

	public void generateNumber(){
			 firstNumber = 1 + random.nextInt(9);	
			secondNumber = 1 + random.nextInt(9);
	}

	public int collectAnswer(){

		System.out.printf("What is %d times %d ",firstNumber, secondNumber);
			int userInput = input.nextInt();
			return userInput;	
	}

	public int checkAnswer(){
		return firstNumber * secondNumber;
	}
	public void generateNumber1(){
		 	 firstNumber = 1 + random.nextInt(9);	
			secondNumber = 10 + random.nextInt(89);

	}

		public void generateNumber2(){
		 	 firstNumber = 1 + random.nextInt(9);	
			secondNumber = 100 + random.nextInt(899);

	}

		public void displayResult(){
				for(int count = 0;count<3;count++){
					System.out.println("Enter 1 for level1\nEnter 2 for level2\nEnter 3 for level3");
						int number = input.nextInt();

					switch(number){
						case 1:
							System.out.println("Difficulty Level 1");
							for(int counter = 0; counter<6;counter++){
									 generateNumber();
										int result = 0;
										int checker = 0;
								do{
									 result = collectAnswer();
									 checker = checkAnswer();

			
									if(result != checker){
										System.out.println("No,Please Try Again ");
				
									}else{
										System.out.println("Very Good!! ");

									}
				
									System.out.println();

								}while(result!=checker);	
			
							}
							break;

						case 2:
							System.out.println("Difficulty Level 2");

							for(int count2 = 0; count2<6;count2++){
								 generateNumber1();
									int result = 0;
									int checker = 0;
								do{
									 result = collectAnswer();
									 checker = checkAnswer();

			
									if(result != checker){
										System.out.println("No,Please Try Again ");
				
									}else{
										System.out.println("Very Good!! ");

									}
				
									System.out.println();

								}while(result!=checker);	
			
							}
						break;
						case 3:
							System.out.println("Difficulty Level 3");

							for(int count1 = 0; count1<6;count1++){
								 generateNumber2();
									int result = 0;
									int checker = 0;
							do{
								 result = collectAnswer();
								 checker =checkAnswer();

			
								if(result != checker){
									System.out.println("No,Please Try Again ");
				
								}else{
									System.out.println("Very Good!! ");

								}
				
								System.out.println();

							}while(result!=checker);
							}
						break;
						default:
							System.out.println("You Chose The Wrong Number Retry ");	

					}
						System.out.println();
				}
		}

}