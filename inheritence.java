class inheritance {
	protected String brand = "ford";
	public void honk() {
		System.out.println("ford");
	} 
}

class car extends inheritance {
	private String modelname = "mustang";
	public static void main(String[] args) {
		car myobj = new car();
		myobj.honk();
		System.out.println(myobj.brand + " " + myobj.modelname);
	}
}