public class method {
	static void method() {
		System.out.println("this is method");
	}
	static void method1(int age) {
		if (age < 18) {
			System.out.println("not enogh!");
		} else if (age==18) {
			System.out.println("you are 18");
			
		} else {
			System.out.println("old enogh");
		}

	}
	static void addition(int x, int y) {
		System.out.println(x+y);
	}
	static void subtration(int x, int y) {
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		method();
		method();
		method();
		method();

		method1(22);
		method1(18);
		method1(15);
		

		addition(5, 10);
		subtration(10, 5);
	}
}