package tests;

interface Say{
	void hello();
}

interface addNum{
	void add(int a, int b);
}

interface checkEven {
	boolean even(int a);
}

public class lambda {

	public static void main(String[] args) {
		
		Say h = new Say() {
			public void hello() {
				System.out.println("Hello using anonymous class");
			}
		};
		h.hello();
		
		Say hello = () -> System.out.println("Hello using lambda exp");
		hello.hello();
		
		addNum add  = (a,b) -> System.out.println("sum = " + (a + b));
		add.add(20,30);
		
// -----------------------------------------------------------------------------------------------		
		checkEven s = new checkEven() {
			public boolean even(int a) {
				if(a%2==0)
					return true;
				else
					return false;
			}
		};
		System.out.println(s.even(30));
		
		checkEven check = a -> {
								if(a%2==0)
									return true;
								else
									return false;
								};
		System.out.println(check.even(25));
	}
}
