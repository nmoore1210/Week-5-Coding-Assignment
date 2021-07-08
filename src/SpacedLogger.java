
// Create two classes that implement the Logger interface //
public class SpacedLogger implements Logger {

// The SpacedLogger should add spaces between each character of the String argument passed into its methods. //
	
	@Override
	public void Log(String Log) {
		// TODO Auto-generated method stub
		String spaced = "";
		
		for (int i = 0; i <= Log.length()-1; i++) {
			
			spaced += Log.charAt(i) + " ";
		}
	
		System.out.println(spaced);
	}

// The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o) //
	
	@Override
	public void Error(String Error) {
		// TODO Auto-generated method stub
		
		String spaced = "ERROR: ";
		
		for (int i = 0; i <= Error.length()-1; i++) {
			
			spaced += Error.charAt(i) + " ";
		}
	
		System.out.println(spaced);
		
	}
	
	
	
}
