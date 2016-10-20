package castingBasics;

class Main {
	  public static void main(String[] args) {
	  
	//byte 100 to an int;
	  byte b1 = 100; 
	  int i1 = (byte)b1; 
	  System.out.println("byte value: " + b1); 
	  System.out.println("converted int value: " + i1); 
	  
	//short 10 to a long;
	  short b2 = 10; 
	  long i2 = (short)b2; 
	  System.out.println("short value: " + b2); 
	  System.out.println("converted long value: " + i2);
	  
	//int 3 to 3.0;
	  int b3 = 3; 
	  double i3 = (int)b3; 
	  System.out.println("int value: " + b3); 
	  System.out.println("converted double value: " + i3);
	  
	//long 10000 to 10000.0;
	  long b4 = 10000; 
	  double i4 = (long)b4; 
	  System.out.println("long value: " + b4); 
	  System.out.println("converted double value: " + i4);
	  
	//float 12.5f to int;
	  float b5 = 12.5f;
	  int i5 = (int) b5;
	  System.out.println("float value: " + b5);
	  System.out.println("converted int value: " + i5);
	  
	        
	  	
	  }
	}
