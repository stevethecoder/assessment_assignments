package constructors;

public class Main {

	public static void main(String[] args) {

		// Create a Main class with a main method.

		// Create a CouchPotato Class. Create three properties.
		// 3 public properties(public for this example)
		// name
		// mostHoursOnCouch
		// isNotMovingThisWeekend
		// Create four constructors
		// default
		// one property
		// two properties
		// three properties
		// Create four objects
		// Print out a few of the property values.

		CouchPotato CouchPotato1 = new CouchPotato();
		CouchPotato1.name = "Paul";
		CouchPotato1.mostHoursOnCouch = 23;
		CouchPotato1.isNotMovingThisWeekend = true;

		CouchPotato CouchPotato2 = new CouchPotato();
		CouchPotato2.name = "James";
		CouchPotato2.mostHoursOnCouch = 7;
		CouchPotato2.isNotMovingThisWeekend = false;

		if (CouchPotato1.isNotMovingThisWeekend == true) {
			System.out.println(CouchPotato1.name + " you have been on the couch for " + CouchPotato1.mostHoursOnCouch
					+ " hours. " + CouchPotato1.name + " are you conscious?");
		} else if (CouchPotato1.isNotMovingThisWeekend == false) {
			System.out.println(CouchPotato1.name + " you have been on the couch for " + CouchPotato1.mostHoursOnCouch
					+ " hours. "+ CouchPotato1.name + " are you tired?");
		} else {
			System.out.println("Stay on couch.");
		}

		if (CouchPotato2.isNotMovingThisWeekend == true) {
			System.out.println(CouchPotato2.name + " you have been on the couch for " + CouchPotato2.mostHoursOnCouch
					+ " hours. " + CouchPotato2.name + " are you conscious?");
		} else if (CouchPotato2.isNotMovingThisWeekend == false) {
			System.out.println(CouchPotato2.name + " you have been on the couch for " + CouchPotato2.mostHoursOnCouch
					+ " hours. "+ CouchPotato2.name + " are you tired?");
		} else {
			System.out.println("Stay on couch.");
		}

	}

}
