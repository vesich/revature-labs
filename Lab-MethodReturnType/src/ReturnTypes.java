
public class ReturnTypes {
	public static void main(String[] args) {
		// create a class instance
		ReturnTypes myInstance = new ReturnTypes();
		
		//call your method here
		myInstance.returnNothing();
		boolean isTrue = myInstance.returnBoolean();
		System.out.println(isTrue);
		double myPi = myInstance.returnPi();
		System.out.println(myPi);
		System.out.println(myInstance.getAlphabetArray());
		
		}
		//create your first method here
		public void returnNothing() {
			System.out.println("inside of a void method");
		}
		
		public boolean returnBoolean() {
			return true;
		}
		
		public double returnPi() {
			return Math.PI;
		}
		
		public char[] getAlphabetArray() {
			 char[] letters = {'a', 'b', 'c', 'd', 'e'};
			 return letters;
		}
	
}
