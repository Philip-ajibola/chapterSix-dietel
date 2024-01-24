import java.util.Scanner;

public class DistanceBetweenPointTest{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		DistanceBetweenPoint distance = new DistanceBetweenPoint();
		System.out.println("Enter Point X1 And Y1 (e.g 10.2 5.6) ");
				double firstPointX = input.nextDouble();
				double firstPointY = input.nextDouble();

			System.out.println("Enter Point X2 And Y2 (e.g 10.2 5.6) ");
				double secondPointX = input.nextDouble();
				double secondPointY = input.nextDouble();

			double distanceX = distance.getDifference(firstPointX,secondPointX);
			double distanceY = distance.getDifference(firstPointY,secondPointY);

			double distanceOfTwoPoint = distance.getDistance(distanceX,distanceY);

	System.out.printf("The Distance The Two Point (%.2f,%.2f) and (%.2f,%.2f) is %.2f ",firstPointX,firstPointY,secondPointX,secondPointY,distanceOfTwoPoint);
			
	}

}