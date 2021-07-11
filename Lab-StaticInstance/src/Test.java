
public class Test {
	public static void main(String[] args) {
		A a = new A();

		System.out.println(a.instanceCount);
		System.out.println(A.staticCount);

		A a2 = new A();
		System.out.println(a2.instanceCount);
		System.out.println(A.staticCount);
		
		a.setInstanceCount(13);
		A.setStaticCount(123);
		
		System.out.println("object a - "  + a.instanceCount);
		System.out.println("object a2 - "  + a2.instanceCount);
		System.out.println("class A - "  + A.staticCount);
	}
}
