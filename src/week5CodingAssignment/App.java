package week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = new AsteriskLogger();
		logger.log("Hello World");
		logger.error("Hello");
		
		Logger loggered = new SpacedLogger();
		loggered.log("evan");
		loggered.error("Hello");
	}

}
