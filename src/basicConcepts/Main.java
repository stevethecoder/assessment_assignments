package basicConcepts;

class Main {
	public static void main(String[] args) {

		// Create a House class
		// Give it one public property
		// You do not need methods
		// create 2-3 objects in this file
		// Set the value for the propety for each object

		House myHouse = new House();
		myHouse.address = "17002 Little Eagle Creek";
		myHouse.color = "blue";
		myHouse.age = 36;

		System.out.println(
				"I live at " + myHouse.address + " in a " + myHouse.color + " which is " + myHouse.age + " years old.");

	}
}