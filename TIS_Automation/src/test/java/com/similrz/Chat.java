package com.similrz;

import com.relevantcodes.extentreports.LogStatus;

public class Chat extends Baseclass{
	public void chat() throws Exception {
		test5 = report.startTest("Chat Functionality Automation Test Results");
		FileInputStream();
		
		Thread.sleep(8000);
		ClickFunctionality("Chat_icon_xpath", "Xpath");
		test5.log(LogStatus.PASS, "Chat icon clicked successfully");
//		test5.log(LogStatus.FAIL, "Chat icon is not clicked");
		
		Thread.sleep(8000);
		ClickFunctionality("Appropriat_Chat_xpath", "Xpath");
		test5.log(LogStatus.PASS, "Appropriate Chat clicked successfully");
//		test5.log(LogStatus.FAIL, "Approprite Chat is not clicked");

		Thread.sleep(5000);
		FillTextbox("Chat_textbox_xpath", "Xpath", "message_textbox");
		test5.log(LogStatus.PASS, "Chat text message entered successfully");
//		test5.log(LogStatus.FAIL, "Chat text message is not entered");
		
		Thread.sleep(3000);
		ClickFunctionality("Send_icon_xpath", "Xpath");
		test5.log(LogStatus.PASS, "Send icon clicked successfully");
//		test5.log(LogStatus.FAIL, "Send icon is not clicked");

		Thread.sleep(5000);
		ClickFunctionality("Attachment_icon_xpath", "Xpath");
		test5.log(LogStatus.PASS, "Attachment icon clicked successfully");
//		test5.log(LogStatus.FAIL, "Attachment icon is not clicked");

		Thread.sleep(5000);
		ClickFunctionality("Gallery_icon_xpath", "Xpath");
		test5.log(LogStatus.PASS, "Gallery icon clicked successfully");
//		test5.log(LogStatus.FAIL, "Gallery icon is not clicked");

		Thread.sleep(9000);
//		ClickFunctionality("GalleryAllow_button_xpath", "Xpath");
		ClickFunctionality("Select_downloads_xpath", "Xpath");
		test5.log(LogStatus.PASS, "Downloads tag selected successfully");
//		test5.log(LogStatus.FAIL, "Downloads tag is not selected");
		
		Thread.sleep(5000);
		ClickFunctionality("Choose_pic_xpath", "Xpath");
		test5.log(LogStatus.PASS, "Choosed Image selected successfully");
//		test5.log(LogStatus.FAIL, "Choosed Image is not selected");
		
		Thread.sleep(8000);
		ClickFunctionality("chat_backarrow_xpath", "Xpath");
		
//		Thread.sleep(5000);
//		ClickFunctionality("chat_backarrow_xpath", "Xpath");
		
	}
	
	public void Chat_Creategroup() throws Exception  {

		Thread.sleep(4000);
		ClickFunctionality("Chat_Add_Icon", "Xpath");
		test5.log(LogStatus.PASS, "Chat add icon clicked successfully");
//		test5.log(LogStatus.FAIL, "Chat add icon is not clicked");
		
		Thread.sleep(4000);
		ClickFunctionality("Group_Add_Icon", "Xpath");
		test5.log(LogStatus.PASS, "Group add icon clicked successfully");
//		test5.log(LogStatus.FAIL, "Group add icon is not clicked");

		Thread.sleep(4000);
		ClickFunctionality("Chat_Popup", "Xpath");

		Thread.sleep(3000);
//		ClickFunctionality("AppAllow_buttonid", "Id");
		
		FillTextbox("Chat_Enter_Group_Name", "Xpath", "Chat_Group_Name");
		test5.log(LogStatus.PASS, "Chat group name entered successfully");
//		test5.log(LogStatus.FAIL, "Chat group name is not entered");
		
		Thread.sleep(4000);
		ClickFunctionality("Member_Checkbox_xpath", "Xpath");
		test5.log(LogStatus.PASS, "Group members checkbox clicked successfully");
//		test5.log(LogStatus.FAIL, "Group members checkbox is not clicked");
		
		
		Thread.sleep(5000); 
		ClickFunctionality("Group_Create_Button", "Xpath");
		test5.log(LogStatus.PASS, "Chat Group create button clicked successfully");
//		test5.log(LogStatus.FAIL, "Chat Group crete button is not clicked");
	}
	
	public void Chat_Add() throws Exception {

		Thread.sleep(8000);
		ClickFunctionality("Chat_Add_Icon", "Xpath");
		test5.log(LogStatus.PASS, "Chat add icon clicked successfully");
//		test5.log(LogStatus.FAIL, "Chat add icon is not clicked");

		Thread.sleep(5000);
		ClickFunctionality("Chat_Icon", "Xpath");
		test5.log(LogStatus.PASS, "Chat icon clicked successfully");
//		test5.log(LogStatus.FAIL, "Chat icon not clicked");
		
//		Thread.sleep(4000);
//		ClickFunctionality("Chat_Popup", "Xpath");
		
//		Thread.sleep(3000);
//		ClickFunctionality("AppAllow_buttonid", "Xpath");

		Thread.sleep(9000);
		ClickFunctionality("Chat_User", "Xpath");
		test5.log(LogStatus.PASS, "Appropriate chat user clicked successfully");
//		test5.log(LogStatus.FAIL, "Appropriate chat user is not clicked");
		
		Thread.sleep(5000);
		
		FillTextbox("Chat_Type_Field", "Xpath", "message_textbox");
		test5.log(LogStatus.PASS, "Chat text messge entered successfully");
//		test5.log(LogStatus.FAIL, "Chat text message is not entered");
		
		ClickFunctionality("Chat_Send_Button", "Xpath");
		test5.log(LogStatus.PASS, "Send button clicked successfully");
//		test5.log(LogStatus.FAIL, "Send button is not clicked");
		
		ClickFunctionality("chat_backarrow_xpath", "Xpath");
		
		Thread.sleep(3000);
		ClickFunctionality("chat_backarrow_xpath", "Xpath");
		
		report.endTest(test5);
		report.flush();
	}
}
