import java.time.LocalDateTime;
import java.util.Scanner;

public class EncryptionMain {
	
	public EncryptionMain() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		EncryptionMain myTracker = new EncryptionMain();
		
		myTracker.askForData();
		myTracker.outputAllData();
		
	}
	
	public void askForData()
	{
	// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.println("What message would you like to encrypt?");
		
	}
	public void outputAllData()
	{
		System.out.println(appData.toString());
		appData.writeToFile();
		
	}

}
