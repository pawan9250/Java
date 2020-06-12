class enum1 {
	low,
	medium,
	high
}

public class my {
	public static void main(String[] args) {
		for (enum1 var : enum1.values()) { 

		System.out.println(var);
		}
	} 
}