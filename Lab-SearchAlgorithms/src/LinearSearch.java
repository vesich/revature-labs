
public class LinearSearch {
	public static void main(String[] args) {
		// creating some dummy data for our method

		char letter = 'd';

		char letter2 = 'd';

		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',

				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		LinearSearch test = new LinearSearch();
//		System.out.println(test.findLetter(letter, letters));
//		System.out.println(test.findLetterBackwards(letter2, letters));
		System.out.println(test.findLetterFromMiddle(letter, letters));
		// call methods in the main

	}

	// create first method
	public int findLetter(char target, char[] data) {
		if (data == null) {
			return -1;
		}
		int result = -1;

		for (int i = 0; i < data.length; i++) {
			char temp = data[i];
			if (temp == target) {
				return i;
			}
		}

		return result;

	}

	public int findLetterBackwards(char target, char[] data) {
		if (data == null) {
			return -1;
		}
		int result = -1;

		for (int i = data.length - 1; i > -1; i--) {
			char temp = data[i];
			if (temp == target) {
				return i;
			}
		}

		return result;
	}

	public int findLetterFromMiddle(char target, char[] data) {
		if (data == null)
			return -1;

		// split data in half
		char[] firstHalf = new char[data.length / 2];
		char[] secondHalf = new char[data.length - data.length / 2];

		// fill first array
		for (int i = 0; i < firstHalf.length; i++) {
			firstHalf[i] = data[i];
		}

		// fill second array
		for (int i = 0; i < secondHalf.length; i++) {
			secondHalf[i] = data[i + firstHalf.length];
		}

		// perform searching
		int result1 = findLetter(target, firstHalf);
		int result2 = findLetterBackwards(target, secondHalf);
		// compare results
		if (result1 > -1)
			return result1;
		else if (result2 > -1)
			return result2 + firstHalf.length;
		// remember that secondHalf needs to add length/2 to return the correct index
		else
			return -1;
	}

}
