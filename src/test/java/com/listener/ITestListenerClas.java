package com.listener;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.BaseClass;



	public class ITestListenerClas extends BaseClass implements ITestListener{

		public void onTestStart(ITestResult result) {
			System.out.println("OnTestStart");
		}

		public void onTestSuccess(ITestResult result) {
			System.out.println("onTestSuccess");
		}

		public void onTestFailure(ITestResult result) {
			System.out.println("onTestFailure");
			try {
				screenShot(result.getName());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}

		public void onTestSkipped(ITestResult result) {
			System.out.println("onTestSkipped");
		}


		

		public void onStart(ITestContext context) {
			System.out.println("onStart");
		}

		public void onFinish(ITestContext context) {
			System.out.println("onFinish");
			
		}

	}


