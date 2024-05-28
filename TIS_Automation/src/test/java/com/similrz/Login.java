package com.similrz;

import com.relevantcodes.extentreports.LogStatus;

public class Login extends Baseclass {
	public void LoginPage() throws Exception {
		// ImplicitlyWait();
		test3 = report.startTest("Login Functionality Automation Test Results");
		FileInputStream();
		Thread.sleep(5000);
		test3.log(LogStatus.PASS, "Application launched apk and install the app successfully");
		
		ClickFunctionality("AppAllow_buttonid", "Id");
		test3.log(LogStatus.PASS, "App Allow button clicked successfully");
		
		ClickFunctionality("Login_button", "Xpath");
		test3.log(LogStatus.PASS, "Home page login button clicked successfully");
		
		Thread.sleep(5000);
		FillTextbox("Email_txtbox", "Xpath", "validEmai");
		test3.log(LogStatus.PASS, "Valied login email/Username entered successfully");
		
		FillTextbox("Password_txtbox", "Xpath", "vlidpassword");
		test3.log(LogStatus.PASS, "Valied login Password entered successfully");
		
		ClickFunctionality("Loginbutton_xpath", "Xpath");
		test3.log(LogStatus.PASS, "Login button clicked successfully");
//		test3.log(LogStatus.FAIL, "Enter valid UserName and password and Login button is not clicked");
		
		Thread.sleep(8000);
		ClickFunctionality("LoginAllow_buttonid", "Id");
		
		report.endTest(test3);
		report.flush();
	}
}
