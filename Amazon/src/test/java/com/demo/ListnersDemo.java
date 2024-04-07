package com.demo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " The Test is Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " The Test is Successful");
	}

	public void onTestFaliure(ITestResult result) {
		System.out.println(result.getName() + " The Test is Fail");
	}

	
	
	

}
