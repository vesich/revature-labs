
public class MethodDeclaration {
	public static void main(String[] args) {
		MethodDeclaration myInstance = new MethodDeclaration();
		myInstance.talk();
		int value = 15;
		int sameValue = myInstance.getInt(value);
		
		System.out.println(myInstance.sum(3,6,8.5));
	
		System.out.println(sameValue);
		
		System.out.println(myInstance.randomNumber());
	}
	
	public void talk() {
		System.out.println("Inside of the talk method");
	}
	
	public int getInt(int input) {
		return input;
	}
	
	public double sum(int x, int y, double z) {
		return x + y + z;
	}
	
	public int randomNumber() {
		int result = (int) (Math.random() * 50) + 1;
		return result;
	}
}
