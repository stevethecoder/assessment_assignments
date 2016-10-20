package mathBasics;


class Main {
	  public static void main(String[] args) {

	   int x = 12;
	   int y = 3;
	   
	   System.out.println("Between 12 and 1, " +Math.max(x, y) +" is the maximum number.");
	   
	   int a = 100;
	   int b = 1;

	   System.out.println("Between 100 and 1, " +Math.min(a, b) +" is the minimum number.");
	   
	   double z = Math.random ();
	   
	   System.out.println("Random number: " + z);
	   
	   double h = -1.4;
	   
	   System.out.println("Round -1.4 equals " +Math.round (h));
	   
	   double m = Math.random();
	   double n = m*10;
	   System.out.println("Rounded random number: " +Math.round(n));
	   }
	   
	   
	}