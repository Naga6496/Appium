package com.similrz;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;

public class Event extends Baseclass{
	public void CreatEvent() throws Exception {
//	ImplicitlyWait();
	Thread.sleep(5000);
	ClickFunctionality("Eventicon_xpath", "Xpath");
	
	Thread.sleep(5000);
	ClickFunctionality("Createvent_button_xpath", "Xpath");
	
	Thread.sleep(3000);
	ClickFunctionality("Even_dropdown_xpath", "Xpath");
	
	Thread.sleep(3000);
	ClickFunctionality("Select_event_xpath", "Xpath");
	ClickFunctionality("Okbutton_xpath", "Xpath");
	
	Thread.sleep(3000);
	ClickFunctionality("Addphoto_xpath", "Xpath");
	
	Thread.sleep(3000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Fromphotos_xpath"))).click();
	
	Thread.sleep(9000);
	ClickFunctionality("AppAllow_buttonid", "Xpath");
	
	Thread.sleep(10000);
//	ClickFunctionality("Downloadtaggle_xpath", "Xpath");
	
	Thread.sleep(3000);
	ClickFunctionality("Select_Eventimage_xpath", "Xpath");
	
	Thread.sleep(10000);
	ClickFunctionality("Cancelbutton_xpath", "Xpath");
	
	Thread.sleep(8000);
	FillTextbox("EventTitle_textbox_xpath", "Xpath", "EventTitle");
	
	Thread.sleep(3000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Startdate_xpath"))).click();
	
	Thread.sleep(3000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Nextmonth_Arrow_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Select_Startdate_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
	
	Thread.sleep(5000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Enddate_xpath"))).click();
	
	Thread.sleep(2000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Select_Enddate_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
	
	Thread.sleep(5000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Staettime_xpath"))).click();
	
	Thread.sleep(2000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("SetStarttime_1_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("SetStarttime_2_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Set_AM_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
	
	Thread.sleep(5000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Endtime_xpath"))).click();
	
	Thread.sleep(2000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("SetEndtime_1_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("SetEndtime_2_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Set_PM_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
//	
	//Thread.sleep(5000);
//	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	//driver.findElement(By.xpath(Attriputeprop.getProperty("Location_xpath"))).click();
//	
	//Thread.sleep(8000);
//	
	//driver.findElement(By.xpath(Attriputeprop.getProperty("Select_loction_xpath"))).sendKeys(Valueprop.getProperty("Loction"));
//	
	//Thread.sleep(5000);
//	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	//driver.findElement(By.xpath(Attriputeprop.getProperty("Choose_location_xpath"))).click();
//	
	//Thread.sleep(3000);
//	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	//driver.findElement(By.xpath(Attriputeprop.getProperty("Loction_savebutton_xpath"))).click();
	
	Thread.sleep(5000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("RSVP_Startdate_xpath"))).click();
	
	Thread.sleep(3000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Nextmonth_Arrow_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Startdate_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
	
	Thread.sleep(5000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("RSVP_Enddate_xpath"))).click();
	
	Thread.sleep(2000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Enddate_xapth"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
	
	Thread.sleep(3000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("RSVP_Starttime_xapth"))).click();
	
	Thread.sleep(2000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Starttime_1_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Starttime_2_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Set_AM_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
	
	Thread.sleep(3000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("RSVP_Endtime_xpath"))).click();
	
	Thread.sleep(2000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Endtime_1_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Endtime_2_Xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Set_PM_xpath"))).click();
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
	
	Thread.sleep(5000);
	ClickFunctionality("chat_backarrow_xpath", "Xpath");
	driver.findElement(By.xpath(Attriputeprop.getProperty("Description_textbox_xpath"))).sendKeys(Valueprop.getProperty("Testtext"));
	
	Thread.sleep(9000);
	

//	driver.findElement(By.xpath(Attriputeprop.getProperty("Specialinstruction_textbox_xpath"))).sendKeys(Valueprop.getProperty("Testtext"));
	
}
	
public void YourEvent() throws Exception {
	test3 = report.startTest("Your Event Functionality Automation Test Results");
	FileInputStream();
	Thread.sleep(5000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Eventicon_xpath"))).click();
	test3.log(LogStatus.PASS, "Event icon clicked successfully");
	Thread.sleep(5000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("yourevent_xpath"))).click();
	test3.log(LogStatus.PASS, "Your Event clicked successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Manage_button_xpath"))).click();
	test3.log(LogStatus.PASS, "Manage button clicked successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Duplicate_xpath"))).click();
	test3.log(LogStatus.PASS, "Duplicate text button clicked successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_startdate_textbox_xpath"))).click();
	test3.log(LogStatus.PASS, "Strt date textbox clicked successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_startdate_xpath"))).click();
	test3.log(LogStatus.PASS, "Start date selected successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_setbutton_xpath"))).click();
	test3.log(LogStatus.PASS, "Start date set button clicked successfully");
	Thread.sleep(5000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_enddate_textbox_xpath"))).click();
	test3.log(LogStatus.PASS, "End date textbox clicked successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_enddate_xpath"))).click();
	test3.log(LogStatus.PASS, "End date selected successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_setbutton_xpath"))).click();
	test3.log(LogStatus.PASS, "End date set button clicked successfully");
	Thread.sleep(5000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_startTime_textbox_xpath"))).click();
	test3.log(LogStatus.PASS, "Start time textbox clicked successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_startTime_xpath"))).click();
	test3.log(LogStatus.PASS, "Start time selected successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_startTimeseconds_xpath"))).click();
	test3.log(LogStatus.PASS, "Start time seconds selected successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_setbutton_xpath"))).click();
	test3.log(LogStatus.PASS, "Start time set button clicked successfully");
	Thread.sleep(5000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_endTime_textbox_xpath"))).click();
	test3.log(LogStatus.PASS, "End time textbox clicked successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_endTime_xpath"))).click();
	test3.log(LogStatus.PASS, "End time selected successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_endTimeseconds_xpath"))).click();
	test3.log(LogStatus.PASS, "End time second selected successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_setbutton_xpath"))).click();
	test3.log(LogStatus.PASS, "End time set button clicked successfully");
	Thread.sleep(5000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_RSVP_startdate_textbox_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP start date textbox clicked successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_RSVP_startdate_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP start date selected successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_setbutton_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP start date set button clicked successfully");
	Thread.sleep(5000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_RSVP_enddate_textbox_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP end date textbox clicked successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_RSVP_enddate_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP end date selected successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_setbutton_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP end dte set button clicked successfully");
	Thread.sleep(5000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_RSVP_startTime_textbox_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP start time textbox clicked successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_RSVP_startTime_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP start time selected successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_RSVP_startTimeseconds_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP start time second selected successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_setbutton_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP start time set button clicked successfully");
	Thread.sleep(5000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_RSVP_endTime_textbox_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP end time textbox clicked successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_endTime_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP end time selected successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_RSVP_endTimeseconds_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP end time second selected successfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_setbutton_xpath"))).click();
	test3.log(LogStatus.PASS, "RSVP end time setbutton clicked successfully");
	Thread.sleep(5000);
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Event Settings\"))")).getText();
	Thread.sleep(5000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_eventSettings_xpath"))).click();
	test3.log(LogStatus.PASS, "Event settings clicked successfully");
	Thread.sleep(5000);
	driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_eventSettings_Savebutton_xpath"))).click();
	test3.log(LogStatus.PASS, "Event settings save clicked successfully");
	Thread.sleep(5000);
//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"//android.widget.Button[@text=\"Create\"]\"))")).click();
	driver.findElement(By.xpath(Attriputeprop.getProperty("Event_createbutton_xpath"))).click();
	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	Thread.sleep(5000);
//	driver.findElement(By.xpath(Attriputeprop.getProperty("RSVP_Enddate_xpath"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Enddate_xapth"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath(Attriputeprop.getProperty("RSVP_Starttime_xapth"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Starttime_1_xpath"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Starttime_2_xpath"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	driver.findElement(By.xpath(Attriputeprop.getProperty("Set_AM_xpath"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath(Attriputeprop.getProperty("RSVP_Endtime_xpath"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Endtime_1_xpath"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Endtime_2_Xpath"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	driver.findElement(By.xpath(Attriputeprop.getProperty("Set_PM_xpath"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
//	test3.log(LogStatus.PASS, "Event icon clicked successfully");
//	Thread.sleep(5000);
//	driver.findElement(By.xpath(Attriputeprop.getProperty("Description_textbox_xpath"))).sendKeys(Valueprop.getProperty("Testtext"));
	report.endTest(test3);
	report.flush();
}

	public void ShareEvent() throws Exception {
		test3 = report.startTest("Your Event Functionality Automation Test Results");
		FileInputStream();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Eventicon_xpath"))).click();
		test3.log(LogStatus.PASS, "Event icon clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Share_yourevent_xpth"))).click();
		test3.log(LogStatus.PASS, "Your Event clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Share_eventlinkbutton_xpth"))).click();
		test3.log(LogStatus.PASS, "Share event link button clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Event_invitebutton_xpath"))).click();
		test3.log(LogStatus.PASS, "Event invite button clicked successfully");
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Invite_closebutton_xpath"))).click();
//		test3.log(LogStatus.PASS, "Event icon clicked successfully");
//		Thread.sleep(3000);
		report.endTest(test3);
		report.flush();
	}
	
}
