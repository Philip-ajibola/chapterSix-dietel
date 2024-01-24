public class PrimeNumbers{
	public static void main(String[] srgs){

	for(int count = 1; count<10_000;count++){
			isPrime(count);
	}




	}

	public static void isPrime(int number){
		if(number>1 && number<10){
		int factor = 0;
		for(int count = 1; count<=number;count++){
			if(number%count==0){
				factor +=1; 	
			}

		}
			if(factor==2){
				System.out.println(number + " Is a prime factor ");
			}
		}


		if(number>9){
			int factor = 0;
		for(int count = 1; count<=number/2;count++){
			if(number%count==0){
				factor +=1; 	
			}

		}
			if(factor==1){
				System.out.println(number + " Is a prime factor ");
			}

			}

		}




}