package constructorsChaining;

public class Pizza {

	public void placeOrder(String company, int pizzaSize, boolean hasCoupon) {

		System.out.println("I want to order a " + pizzaSize + " inch pizza from " + company + ".");

		if (hasCoupon == true) {
			System.out.println("I have a coupon.");
		} else if (hasCoupon == false) {
			System.out.println("I don't have a coupon.");
		} else
			;
	}

}
