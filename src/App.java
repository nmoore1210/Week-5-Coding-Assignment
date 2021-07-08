// Create a class named App that has a main method. //

public class App {

	public static void main(String[] args) {
		
		// In this class instantiate an instance of each of your logger classes that implement the Logger interface. //
		// Test both methods on both instances, passing in Strings of your choice. //

		Logger logger1 = new AsteriskLogger();
		
		logger1.Log("Test1");
		logger1.Error("Test2");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.Log("Test3");
		logger2.Error("Test4");
		
	}
	
}
