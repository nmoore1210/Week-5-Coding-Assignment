
// Create two classes that implement the Logger interface //
public class AsteriskLogger implements Logger {

// The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either //
// side of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console. //
	
	@Override
	public void Log(String Log) {
		// TODO Auto-generated method stub
		System.out.println("***" + Log + "***");
	}

	
// The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”. //
	
	@Override
	public void Error(String Error) {
		// TODO Auto-generated method stub
		System.out.println("****************" + "\n***" + "Error: " + Error + "***" + "\n****************");
	}

}
