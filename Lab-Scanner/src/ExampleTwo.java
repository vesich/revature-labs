import java.util.Scanner;

public class ExampleTwo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type in a line and hit Enter."); 
		
		String line = scanner.nextLine();
		
		int vowels = 0;
		
		char[] stringChars = line.toCharArray();
		
		for (int i = 0; i < stringChars.length; i++) {
			if ( stringChars[i] == 'a' || stringChars[i] == 'o' || stringChars[i] == 'u' || stringChars[i] == 'e' || stringChars[i] == 'i') {
				vowels++;
			}
		}

		System.out.print("You have typed: " + vowels + " vowels");

		scanner.close();

	}
}
