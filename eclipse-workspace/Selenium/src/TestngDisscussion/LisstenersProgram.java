package TestngDisscussion;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisstenersProgram implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("this method is invoke before starting the testcase");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
			
	System.out.println("This method called whenever the test case passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("whenever the method failed this test case failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This method is skipped whenever test case skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("This method is start before execution of suit");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This method is finshed whenerver suit excution finished");
	}
	
	

}
