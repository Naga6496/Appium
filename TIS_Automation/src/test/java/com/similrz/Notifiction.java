package com.similrz;

public class Notifiction extends Baseclass{
	public void Home_Notifictionpage() throws Exception {
//		ImplicitlyWait();
		Thread.sleep(8000);
		ClickFunctionality("Notificationiconbutton_xpath", "Xpath");
		
		Thread.sleep(8000);
		ClickFunctionality("Notifiction_profile_xpath", "Xpath");
		ClickFunctionality("Notifiction_profile_xpath", "Xpath");
		
		Thread.sleep(5000);
		ClickFunctionality("AddConnectionbutton_xpath", "Xpath");
		
		Thread.sleep(5000);
		ClickFunctionality("Profile_backicon_xpath", "Xpath");
		
		Thread.sleep(5000);
		ClickFunctionality("Notification_backicon_xpath", "Xpath");
	}
}
