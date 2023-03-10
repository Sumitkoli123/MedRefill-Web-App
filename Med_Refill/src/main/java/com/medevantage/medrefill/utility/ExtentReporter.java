package com.medevantage.medrefill.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {

	static ExtentReports report;
	ExtentTest test;

	public static ExtentReports extentReportGenerator() {

		String path = System.getProperty("user.dir") + "\\Extent_Reports\\TestReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("MedRefill Web App Automation Results");
		reporter.config().setDocumentTitle("Medevantage Test Results");
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Tester Name", "Sumit");
		report.setSystemInfo("App Name", "MedRefill Web");
		return report;
	}

}
