import java.util.Scanner;

public class BeautifyingString{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String");
			String words = input.next();
			String beautifiedWord = beautifyString(words);
		System.out.print(beautifiedWord);

		}

	public static String beautifyString(String name){
		int number = name.length()-1;
		String lastChar ="" + name.charAt(number);
		String firstChar ="" + name.charAt(0);
		if(lastChar.equals(".")){
			name = name;
		}else{
			name +=".";
			}
			String firstCharToUpperCase = firstChar.toUpperCase();
			for(int count = 1; count<name.length();count++){
				firstCharToUpperCase +="" + name.charAt(count);
			}
			
			return firstCharToUpperCase;
		}




}