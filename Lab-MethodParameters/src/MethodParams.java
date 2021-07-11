
public class MethodParams {
	public static void main(String[] args) {
		
		//create a class instance 
		MethodParams myInstance = new MethodParams();
		
		
		//call your method here
		double d = myInstance.convertIntToDouble(44);
		double mySum = myInstance.sum(5, 7, 123.65);
		System.out.println(mySum);
		System.out.println(d);
		//float[] newArr = myInstance.square(2, 4, 6, 7);
		System.out.println(myInstance.square(2, 4, 6, 7)[2]);
	}
	
	//create your first method here
	public double convertIntToDouble(int num) {
		return (double)num;
	}
	
	public double sum(int x, int y, double z) {
		return x + y + z;
	}
	
	public float[] square(int a, int b, int c, int d) {
		float[] myArr = {a*a, b*b, c*c, d*d};
		return myArr;
	}
	
	public String findFirstWord(String a, String b) {
		
		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray();
		
		for (int i = 0; i < aArray.length; i++) {
			if (aArray[i] < bArray[i]) {
				return a;
			} 
			else if (aArray[i] == bArray[i]){
				if (aArray[i+1] < bArray[i+1]) {
					return a;
				} else {
					return b;
				}
			} else {
				return b;
			}
		}
		
		return a;
	}
}
