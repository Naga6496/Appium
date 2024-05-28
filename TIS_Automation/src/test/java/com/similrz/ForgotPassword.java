package com.similrz;

import org.openqa.selenium.By;

public class ForgotPassword extends Baseclass{
	public void forgotPassword() throws Exception {
		Thread.sleep(5000);
		ClickFunctionality("AppAllow_buttonid", "Id");
		
		Thread.sleep(3000);
		ClickFunctionality("Login_button", "Xpath");
		
		Thread.sleep(3000);
		ClickFunctionality("ForgotpasswordHyperlink_xpath", "Xpath");
		
		Thread.sleep(3000);
		ClickFunctionality("ForgotpasswordEmail_xpath", "Xpath");
		
		Thread.sleep(3000);
		ClickFunctionality("Submitbutton_xpath", "Xpath");
	}
}
