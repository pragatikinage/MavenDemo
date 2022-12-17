package com.paramedutech.project;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerUse implements ITestListener{
	public void onTestStart(ITestContext IR)
{
	Reporter.log("Test case Started"+IR.getName());
}
public void ITestSuccess(ITestContext IR)
{
	Reporter.log("Test case success"+IR.getName());
}
public void onTestFailure(ITestContext IR)
{
	Reporter.log("Test case failed"+IR.getName());
}
	
}
