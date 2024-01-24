import java.util.Arrays;
public class StudentPoll{

	public static void main(String[] args){
	int[] response = {2,5,4,3,5,2,3,3,4,3,3,3,2,3,3,2};
	int[] number = new int[6];
	System.out.println(Arrays.toString(number));
	for(int answer = 0;answer<response.length;answer++){
	//try	{
++number[response[answer]];

	}

	//catch (ArrayIndexOutOfBoundsException e) {
	//System.out.println(e); // invokes toString method
	//System.out.printf(" response[%d] = %d%n%n",answer, response[answer]);
//}
//}
	//System.out.println(Arrays.toString(frequency));
	for (int rating = 0; rating < number.length; rating++) {
 System.out.printf("%6d%10d%n", rating, number[rating]);
}



	}




}