import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
	
	//-----shopping cart program----


	Scanner scanner = new Scanner(System.in);

	String item;

	double price;

	int quantity;

	char currency = '$';   //--- code of a smart shopping cart---

	double total;

	System.out.println("What item u would like to buy: ");

	item = scanner .nextLine();

	System.out.println("What's the price of each: ");

	price = scanner.nextDouble();

	System.out.println("how many would u like:");

	quantity = scanner.nextInt();

	total = price * quantity;

	System.out.println("you have bought " + quantity + " " + item + "/s");

	System.out.println("your total is " + currency + total);

	System.out.println(total);
	
	scanner.close(); */
	
	//--if statements = performs a block of code if its condition is true-
	
	Scanner scanner = new Scanner(System.in);
	
	int age;
	
	System.out.println("Enter your age ");
	age = scanner.nextInt();
	
	if(age >= 18){
	System.out.println("You are an adult");
}
	else if(age <0){
  	System.out.println("you haven't been born yet ");
	}
	else{
	 System.out.println ("you are a child");
	scanner.close();
}

}
}