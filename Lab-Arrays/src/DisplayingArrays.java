import java.util.Arrays;

public class DisplayingArrays {
	
	public static void main(String[] args) {
		int[] intArray = new int[3];
		intArray[0] = -5123;
		intArray[2] = 32;
		intArray[1] = 32;
		
		System.out.println(Arrays.toString(intArray));
	}
}
