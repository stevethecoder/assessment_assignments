package reverseNumbers;

class Main {
	public static void main(String[] args) {
		String string = "reverse";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("String before reverse: " + string);
		System.out.println("String after reverse: " + reverse);

		for (int i = 0; i < reverse.length(); i+=7) {
			System.out.println("String after reverse...every other letter: " + reverse.charAt(0) + reverse.charAt(2)
					+ reverse.charAt(4) + reverse.charAt(6));
		}
	}
}
