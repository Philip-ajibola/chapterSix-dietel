public class ComputerAssistedInstructionTest{


	public static void main(String[] args){
		ComputerAssistedInstruction assistant  = new ComputerAssistedInstruction();

		for(int count = 0; count<6;count++){
			 assistant.generateNumber();
				int result = 0;
				int checker = 0;
			do{
				 result = assistant.collectAnswer();
				 checker = assistant.checkAnswer();

			
				if(result != checker){
					System.out.println("No,Please Try Again ");
				
				}else{
					System.out.println("Very Good!! ");

				}
				
				System.out.println();

			}while(result!=checker);	
			
		}
			System.out.Println("Welldone Keep it up and keep reading your books okay!!!");
	}



}