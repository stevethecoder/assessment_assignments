package constructorChaining;

public class Main {

	public static void main(String[] args) {
		
		/*Task: Create a constructor with super

		*http://stackoverflow.com/questions/2054022/is-it-unnecessary-to-put-super-in-constructor
		//TODO 
			1. Create a School class with a private name property.
			2. Create a constructor that uses that property.
			3. Create a getName() method.
			4. Create a College class that extends School.
			5. Create an int property that is average cost of tuition per semester.
			6. Create a constructor in College that uses super() to chain back to the parent constructor.
			7. Make it so that the two statements below will print.
		*/
		   	
			   College college = new College("IU", 7000);
			   System.out.println(college.getTuition());
			   
			   College school = new College("Purdue", 7000);
			   System.out.println(school.getName());
			  
		   }
		}
	}

}
