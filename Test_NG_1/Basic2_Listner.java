package Test_NG_1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Basic2_Listner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	
		System.out.println("------test start------");
		
	}
	

	@Override
	public void onTestSuccess(ITestResult result) {
	
		ITestListener.super.onTestSuccess(result);
		System.out.println("-------test success------");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		System.out.println("-----Test failure-----");
	}
	
}


