package main.java.resources;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC Passed. :-)");
		
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		
	}

}
