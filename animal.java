class animal {
	public void animalsound() {
		System.out.println("the animal makes sound");
	}
}

class pig extends animal {
	public void animalsound() {
		System.out.println("the pic says:");
	}
}

class dog extends animal {
	public void animalsound() {
		System.out.println("the dog sound:");

	}
}
class Mainclass {
	public static void main(String[] args) {
		animal myanimal = new animal();
		animal mypig = new pig();
		animal mydog = new dog();

		myanimal.animalsound();
		mypig.animalsound();
		mydog.animalsound();
	}
}