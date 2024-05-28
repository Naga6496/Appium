package com.similrz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;

public class Home extends Baseclass {
	
	public void Profile() throws InterruptedException {
		Thread.sleep(8000);
		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Network']"));
		System.out.println(element);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Home_ProfileIcon_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("RequestIcon_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("MessageTextbox_xpath"))).sendKeys(Valueprop.getProperty("message_textbox"));
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("MessageIcon_xpath"))).click();	
		Thread.sleep(7000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Profilepage_bckicon_xpth"))).click();	
	}

	public void PostLike() throws Exception {
		test3 = report.startTest("Like Command and share Functionality Automation Test Results");
		FileInputStream();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Munnar\"))")).getText();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Postlike_icon_xpath"))).click();
		test3.log(LogStatus.PASS, "Post Heart like icon clicked successfully");
		report.endTest(test3);
		report.flush();
	}
	
	public void Postcommand() throws Exception {
		test3 = report.startTest("Like Command and share Functionality Automation Test Results");
		FileInputStream();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Munnar\"))")).getText();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Postlike_icon_xpath"))).click();
		test3.log(LogStatus.PASS, "Post Heart like icon clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Addcommandtextbox_xpath"))).click();
		test3.log(LogStatus.PASS, "Add command text clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("command_textbox_xpath"))).sendKeys(Valueprop.getProperty("commandtext"));
		test3.log(LogStatus.PASS, "Command entered successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Commandsend_button_xpath"))).click();
		test3.log(LogStatus.PASS, "Send icon clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Command_backbutton_xpath"))).click();
		test3.log(LogStatus.PASS, "Back arrow icon clicked successfully");
		report.endTest(test3);
		report.flush();
	}
		
	public void PostShare() throws Exception {
		test3 = report.startTest("Like Command and share Functionality Automation Test Results");
		FileInputStream();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Share_icon_xpath"))).click();
		test3.log(LogStatus.PASS, "Post Share icon clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("ShareSerch_textbox_xpath"))).sendKeys(Valueprop.getProperty("shareserchname"));
		test3.log(LogStatus.PASS, "In the Search textbox the Appropriate shered person name entered successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Radio_button_xpath"))).click();
		test3.log(LogStatus.PASS, "Radio button clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("ShareSend_button_xpath"))).click();
		test3.log(LogStatus.PASS, "Send button clicked successfully");
		report.endTest(test3);
		report.flush();
	}
	
	public void UserPost3dots() throws Exception {
		test3 = report.startTest("User post 3 Dots Functionality Automation Test Results");
		FileInputStream();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("post_3dots_xpth"))).click();
		test3.log(LogStatus.PASS, "User post 3dots clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("3dot_Removeconnection_xpath"))).click();
		test3.log(LogStatus.PASS, "Remove connection text clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("post_3dots_xpth"))).click();
		test3.log(LogStatus.PASS, "User post 3dots clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("3dot_Unfollow_xpth"))).click();
		test3.log(LogStatus.PASS, "Unfollow text clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("post_3dots_xpth"))).click();
		test3.log(LogStatus.PASS, "User post 3dots clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("3dot_Addconnection_xpth"))).click();
		test3.log(LogStatus.PASS, "Add connection text clicked successfully");
		report.endTest(test3);
		report.flush();	
	}
	
	public void Editpost() throws Exception {
		test3 = report.startTest("User post 3 Dots Functionality Automation Test Results");
		FileInputStream();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("OurPost_3dots_xpath"))).click();
		test3.log(LogStatus.PASS, "Our post 3 dots clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Post_Edit_xpth"))).click();
		test3.log(LogStatus.PASS, "Edit post text clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Post_Imageicon_xpth"))).click();
		test3.log(LogStatus.PASS, "Post image icon clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("No_button_xpath"))).click();
		test3.log(LogStatus.PASS, "No text button clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Post_Imageicon_xpth"))).click();
		test3.log(LogStatus.PASS, "Post image icon clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Yes_button_xpath"))).click();
		test3.log(LogStatus.PASS, "Yes text button clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("PostImageAllow_button_xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Select_downlodes_xpath"))).click();
		test3.log(LogStatus.PASS, "downloads tge clicked successfully");
		driver.findElement(By.xpath(Attriputeprop.getProperty("Edit_Imageselect_xpth"))).click();
		test3.log(LogStatus.PASS, "Image clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Post_button_xpath"))).click();
		test3.log(LogStatus.PASS, "Post button clicked successfully");
		report.endTest(test3);
		report.flush();
	}
	
	public void Deletepost() throws Exception {
		test3 = report.startTest("User post 3 Dots Functionality Automation Test Results");
		FileInputStream();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("OurPost_3dots_xpath"))).click();
		test3.log(LogStatus.PASS, "Our post 3 dots clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Post_Delete_xpath"))).click();
		test3.log(LogStatus.PASS, "Delete Post text clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("No_button_xpath"))).click();
		test3.log(LogStatus.PASS, "No text button clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Post_Delete_xpath"))).click();
		test3.log(LogStatus.PASS, "Delete Post text clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Delete_button_xpath"))).click();
		test3.log(LogStatus.PASS, "Delete text button clicked successfully");
		report.endTest(test3);
		report.flush();	
	}

}
