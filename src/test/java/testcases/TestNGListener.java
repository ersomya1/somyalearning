package testcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public  class TestNGListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test cas passed"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped"+result.getName());
		

		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


		
	}

	
