public class Classobject {
	int x = 5;
	int modelyear;
	String modelname;

	public void method1() {
		System.out.println("hy");
	}
	public void method2(int x) {
		System.out.println("pawan " + x);
	}
	public car(int year, String name) {
		modelyear = year;
		modelname = name;
	}

	public static void main(String[] args) {
		Classobject obj = new Classobject();
		System.out.println(obj.x);

		obj.x = 20; 
		System.out.println(obj.x);

		Classobject obj2 = new Classobject();
		obj2.method1();
		obj.method2(200);
		Classobject vehicle = new Classobject(2020, "bajaj");
		System.out.println(vehicle.year + " " + vehicle.name);

	}
}