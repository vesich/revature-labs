
public class ExampleOne {
	public static void main(String[] args) {
		// create some dummy data for our method
		int input = 5;
		ExampleOne myInstance = new ExampleOne();
		// call your methods here
		System.out.println(myInstance.factorial(input));
		myInstance.printChar('f');
	}

	// create the method below
	public int factorial(int num) {
		if (num <= 0)
			return 0;
		if (num == 1)
			return 1;
		return num * factorial(num - 1);
	}

	// exercise One
	public void printChar(char letter) {
		if (letter < 'a' || letter > 'z')
			return;

		System.out.println(letter);
		letter -= 1;
		printChar(letter);

	}

	// exercise Two
	public int binarySearch(int[] data, int target) {
		if (data == null || data.length == 0)
			return -1;

		// define the range of indexes
		int minRange = 0;
		int maxRange = data.length;

		// find the midpoint value
		int midpoint = data[maxRange / 2];

		if (midpoint == target) {
			return maxRange / 2;
		} else if (data.length == 1) {
			return -1;
		} else if (midpoint < target) {
			minRange = (maxRange / 2);

			// create new data to search upon
			int[] temp = copyArray(data, minRange, maxRange);
			
			//need to add the range if it is in the upper half
			 //to keep track of the index otherwise the index is based
			 //on the smaller range
			 int indexAdder = (maxRange/2);

			 //find the index in the smaller array
			 int search = binarySearch(temp, target);

			 //check if the search found the value
			 if (search == -1) {
			 return -1; //return -1, if the search didn't find it
			 }else {
			 return indexAdder + search;
			//return the value plus the adder if found
			 }
			 }else if (midpoint > target) {
			 maxRange = (maxRange/2);

			 //create new data to search upon
			 int[] temp = copyArray(data, minRange, maxRange); 
			//because we're searching the lower half, we don't need to keep track of the index
			  return binarySearch(temp, target);
			  }

			  return -1;
			 }

	// A method used to copy the values of one array into the next
	public int[] copyArray(int[] original, int min, int max) {
		int[] target = new int[max - min];
		for (int i = 0; i < target.length; i++) {
			target[i] = original[min + i];
		}
		return target;
	}
}

