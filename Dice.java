import java.security.SecureRandom;

public class Dice{
	public static void main(String[] args){
		SecureRandom random = new SecureRandom();
	int[] frequency = new int[7];

	for(int roll=1;roll<60_000_000;roll++){
		++frequency[1+random.nextInt(6)];
	
	}
	for(int face = 1; face<frequency.length;face++){
	System.out.printf("%4d%10d%n",face,frequency[face]);

	}

	}





}