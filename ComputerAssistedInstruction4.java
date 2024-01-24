import java.security.SecureRandom;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class ComputerAssistedInstruction4{
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
	
	public int collectAnswer1(){

		System.out.printf("What is %d plus(+) %d ",firstNumber, secondNumber);
			int userInput = input.nextInt();
			return userInput;	
	}
	
	public int collectAnswer2(){

		System.out.printf("What is %d minus(-) %d ",firstNumber, secondNumber);
			int userInput = input.nextInt();
			return userInput;	
	}

	public BigDecimal collectAnswer3(){

		System.out.printf("What is %d divided by(/)  %d ",firstNumber, secondNumber);
			double userInput1 = input.nextDouble();
			BigDecimal userInput = BigDecimal.valueOf(0);

			String convertInput = "" + userInput1;
			System.out.println(convertInput);
			int checkLength = convertInput.length();
			System.out.println(checkLength);
		if(checkLength>2 && checkLength<4){
			convertInput = convertInput + "0";
			 userInput = new BigDecimal(convertInput);
			return userInput;
		}else{
			userInput = BigDecimal.valueOf(userInput1);
			return userInput;
		}	
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

	public int addNumber(){
			return firstNumber + secondNumber;
	}

	public BigDecimal divideNumber(){
		BigDecimal result = BigDecimal.valueOf(firstNumber).divide(BigDecimal.valueOf(secondNumber),2,RoundingMode.HALF_UP);
			System.out.println(result);
			return result;
	}

	public int subtractNumber(){
		return firstNumber - secondNumber;	
	}

	public void displayResult(){
		System.out.println("Enter 1 for Addition.\nEnter 2 for Subtraction.\nEnter 3 for Multiplication.\nEnter 4 for Division \nEnter 5 For random Calculation");
			int userInput = input.nextInt();
		
		switch(userInput){
			case 1:
				int result = 0;
				int checker = 0;
				for(int count = 0;count<5;count++){
					generateNumber();
				do{
					result = collectAnswer1();
					checker = addNumber();
				
					if(result == checker){
						System.out.println("Very Good!!");
				}else{
						System.out.println("No!! Try Again");
				}

				}while(result!=checker);
				}
			break;
			case 2:
				 result = 0;
				 checker = 0;
				for(int count = 0;count<5;count++){
					generateNumber();
				do{
					result = collectAnswer2();
					checker = subtractNumber();
				
					if(result == checker){
						System.out.println("Very Good!!");
				}else{
						System.out.println("No!! Try Again");
				}

				}while(result!=checker);
				}
			break;
			case 3:
				result = 0;
				 checker = 0;
				for(int count = 0;count<5;count++){
					generateNumber();
				do{
					result = collectAnswer();
					checker = checkAnswer();
				
					if(result == checker){
						System.out.println("Very Good!!");
				}else{
						System.out.println("No!! Try Again");
				}

				}while(result!=checker);
				}
			break;
			case 4:
				BigDecimal result1 =  BigDecimal.valueOf(0);
				 BigDecimal checker1 = BigDecimal.valueOf(0);
				for(int count = 0;count<5;count++){
					generateNumber();
				do{
					result1 = collectAnswer3();
					 checker1 = divideNumber();
				
					if(result1.equals(checker1)){
						System.out.println("Very Good!!");
				}else{
						System.out.println("No!! Try Again");
				}

				}while(!result1.equals(checker1));
				}
			break;
			case 5:
			    for(int count = 0; count<5;count++){
				int randomGenerator = 1 + random.nextInt(4);
				switch(randomGenerator){
					case 1:
						 result = 0;
						 checker = 0;
	
						generateNumber();
						do{
							result = collectAnswer1();
							checker = addNumber();
				
						if(result == checker){
							System.out.println("Very Good!!");
						}else{
							System.out.println("No!! Try Again");
						}

						}while(result!=checker);
					break;

					case 2:
						 result = 0;
						checker = 0;
	
						generateNumber();
						do{
							result = collectAnswer2();
							checker = subtractNumber();
				
						if(result == checker){
							System.out.println("Very Good!!");
						}else{
							System.out.println("No!! Try Again");
						}

						}while(result!=checker);
					break;
				
					case 3:

						result = 0;
						checker = 0;
	
						generateNumber();
						do{
							result = collectAnswer();
							checker = checkAnswer();
				
						if(result == checker){
							System.out.println("Very Good!!");
						}else{
							System.out.println("No!! Try Again");
						}

						}while(result!=checker);
					break;
					default:
						BigDecimal result2 = BigDecimal.valueOf(0);
						BigDecimal checker2 = BigDecimal.valueOf(0);
	
						generateNumber();
						do{
							result2 = collectAnswer3();
							checker2 = divideNumber();
				
						if(result2.equals(checker2)){
							System.out.println("Very Good!!");
						}else{
							System.out.println("No!! Try Again");
						}

						}while(!result2.equals(checker2));
				
			    }
			

			}
		}
	}


}



