package automationseleniumcoverfox;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listenerclass implements ITestListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Pass", true);
	}
		
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Fail", true);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Skip", true);
		
	}
}
