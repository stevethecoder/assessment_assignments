package arrayListBasics;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> ingredients = new ArrayList<String>();
		ingredients.add("Apple");
		ingredients.add("Peach");
		ingredients.add("Orange");
		ingredients.add("Lemon");
		ingredients.add("Banana");
		
		System.out.println("Available ingredients: " + ingredients);
		
		ingredients.remove("Orange");
		System.out.println("Available ingredients minus Orange: " + ingredients);

	}

}
