public class DistanceBetweenPoint{
		
	public double getDifference(double number1, double number2){
			double result = number2-number1;
			return Math.pow(result,2);
	}

	
	public double getDistance(double number1, double number2 ){
			double distanceDifference = Math.sqrt(number1 + number2);
				return distanceDifference;
	}
	



}