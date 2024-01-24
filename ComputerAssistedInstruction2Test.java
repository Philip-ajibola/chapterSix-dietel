public class ComputerAssistedInstruction2Test{


	public static void main(String[] args){

	for(int count = 0; count<3;count++){
		ComputerAssistedInstruction2 assistant  = new ComputerAssistedInstruction2();
			int counter1  = 0;
			int counter2  = 0; 

		for(int counter = 0; counter<10;counter++){
			 assistant.generateNumber();
				int result = 0;
				int checker = 0;
			
				 result = assistant.collectAnswer();
				 checker = assistant.checkAnswer();

			
				if(result != checker){
						counter1++;
				}else{
						counter2++;
				}
			
			
		}
			System.out.println();
		double percentage = counter2/10.0;
			if(percentage>0.75){
				System.out.println("Congratulations, you are ready to go to next level ");
			}else{
				System.out.println("Please Ask Your Teacher For Extra Help ");
			}	
	}

	}

}