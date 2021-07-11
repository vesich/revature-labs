
public class MultiDimensionalArrays {
	public static void main(String[] args) {
		int[][][] my3dArray = new int[3][3][3];
		
		//assign a value to the first position of my array
		my3dArray[0][0][0] = 1;
		System.out.println(my3dArray[0][0][0]);
		
		//assigning a 2d array
		int[][] my2dArray = { {1,2,0}, {4,5,6}, {1,4,5} };
		System.out.println(my2dArray[0].length);
	}
}
