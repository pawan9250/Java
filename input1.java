import java.util.Scanner;

 class input1 {
 	public static void main(String[] args) {
 		Scanner obj = new Scanner(System.in);
 		String name;
 		String city;
 		String country;
 		String age;
 		System.out.println("enter your name:-");
 		name = obj.nextLine();
 		System.out.println("enter your city:-");
 		city = obj.nextLine();
 		System.out.println("enter your country:-");
 		country = obj.nextLine();
 		System.out.println("enter your age:-");
 		double age = obj.nextLine();


 		System.out.println("name is:- " + name);
 		System.out.println("city is:- " + city);
 		System.out.println("country is:- " + country);
 		System.out.println("age is:- " + age);
 	}
 }