import java.util.Scanner;


public class ExampleOne {
	public static void main(String[] args) {
		
		String numbers = "1 3 4 5 6 7";
		
		Scanner scanner = new Scanner(numbers);

		while(scanner.hasNext()) {
			System.out.print(scanner.nextInt());
			
			if (scanner.hasNext()) {
				System.out.print(",");
			}
		}
		
		scanner.close();
		
		
	}
}
