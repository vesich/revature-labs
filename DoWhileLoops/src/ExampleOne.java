
public class ExampleOne {
	public static void main(String[] args) {
		char letter = 'a';
		char end = 'z';
		do {
			System.out.print(letter);
			if (letter < end) {
				System.out.print(", ");
			}
			letter++;
		} while (letter <= end);
	}

}
