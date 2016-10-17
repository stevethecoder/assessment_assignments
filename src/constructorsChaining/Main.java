package constructorsChaining;

public class Main {

	public static void main(String[] args) {

		// Create a Pizza class.
		// This class will have no properties.
		// Method 1
		// Create a method called placeOrder.
		// The method will have one parameter that is a string called company.
		// The method will simply print: "I want to order " + company.

		// Method 2
		// Overload that method by adding a number of inches parameter.
		// The method will print "I want to order a 16 inch from Dominos."

		// Method 3
		// On the second overload, add a boolean hasCoupon parameter.
		// The method will print something like this: "I want to order a 16 inch
		// from Dominos. I have a coupon."

		// Create 3 objects in main and call a different method on each one.

		Pizza companyName1 = new Pizza();
		companyName1.placeOrder("Dominoes", 16, true);
		
		Pizza companyName2 = new Pizza();
		companyName2.placeOrder("Pizza Hut", 12, false);
		
		Pizza companyName3 = new Pizza();
		companyName3.placeOrder("Noble Romans", 20, true);

	}

}
