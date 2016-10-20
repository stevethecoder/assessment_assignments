package threadBasics;

public class Main {

	public static void main(String[] args) {
		
		Thread getTime = new GetTime();
		
		Runnable getMail = new GetTheMail(10);
		
		Runnable getMailAgain = new GetTheMail(20);
		
		getTime.start();
		
		new Thread(getMail).start();
		new Thread(getMailAgain).start();

	}

}
