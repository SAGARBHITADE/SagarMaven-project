package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends LonchBrowser implements ITestListener {

	public void onTestFailure(ITestResult result) {
	  
		
		
		try {
			ScrenShout.screnshot1(ref, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
