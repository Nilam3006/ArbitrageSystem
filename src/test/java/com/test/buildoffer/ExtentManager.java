package com.test.buildoffer;

//http://relevantcodes.com/Tools/ExtentReports2/javadoc/index.html?com/relevantcodes/extentreports/ExtentReports.html

import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null) {
			Date d = new Date();
			String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".html";
			extent = new ExtentReports(System.getProperty("user.dir") + "\\report\\" + fileName);
			//extent.loadConfig(new File(System.getProperty("user.dir") + "//ReportsConfig.xml"));
			// optional
			extent.addSystemInfo("Selenium Version", "2.53.1").addSystemInfo("Environment", "QA");
		}
		return extent;
	}
}
