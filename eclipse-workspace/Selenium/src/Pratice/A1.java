package Pratice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class A1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("This start before suite");		
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This method called when testcase succesful");		
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This method called when testcase failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This method called when testcase skipped");
		}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}
	@Override
	public void onStart(ITestContext context) {
		
	System.out.println("This method is called when suit is ");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}