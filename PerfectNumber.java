import java.util.Scanner;

public class PerfectNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		for(int counter = 1; counter<=1000;counter++){
			 isPerfect(counter);
		}

	}

	public static void isPerfect(int number){
			int factor = 0;
			for(int count = 1; count<number;count++){
				if(number%count==0){
					factor += count;
				}
			}
			if(number == factor){
				System.out.println(number + " is a perfect number ");

				System.out.printf("the factors of %d is %n", number);
				for(int count = 1; count<number;count++){
					if(number%count==0){
						System.out.print(count + " ");
					}
				}
				System.out.println();
				System.out.println();
				
			}else{
			
			}
		}

}