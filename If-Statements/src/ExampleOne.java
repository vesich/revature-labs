
public class ExampleOne {
	public static void main(String[] args) {
		boolean firstCondition = true;
		boolean secondCondition = false;
		
		if(firstCondition) {
			System.out.println("Inside the if-statements");
			
			if (secondCondition) {
				System.out.println("Inside the nested if-statement");
			}
		} else {
			System.out.println("Inside the else-statements");
		}
		
		System.out.println("Outside of the if-statement");
	}
}
