package com.similrz;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

public class Home_LikeCommentShare extends Baseclass {

	public void LikeCommandShare() throws Exception {
		test3 = report.startTest("Like Command and share Functionality Automation Test Results");
		FileInputStream();
		Thread.sleep(15000);
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Munnar\"))")).getText();
//		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Postlike_icon_xpath"))).click();
		test3.log(LogStatus.PASS, "Post Heart like icon clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Addcommandtextbox_xpath"))).click();
		test3.log(LogStatus.PASS, "Add command text clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("command_textbox_xpath")))
				.sendKeys(Valueprop.getProperty("commandtext"));
		test3.log(LogStatus.PASS, "Command entered successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Commandsend_button_xpath"))).click();
		test3.log(LogStatus.PASS, "Send icon clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Command_backbutton_xpath"))).click();
		test3.log(LogStatus.PASS, "Back arrow icon clicked successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Share_icon_xpath"))).click();
		test3.log(LogStatus.PASS, "Post Share icon clicked successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("ShareSerch_textbox_xpath")))
				.sendKeys(Valueprop.getProperty("shareserchname"));
		test3.log(LogStatus.PASS, "In the Search textbox the Appropriate shered person name entered successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Radio_button_xpath"))).click();
		test3.log(LogStatus.PASS, "Radio button clicked successfully");
		report.endTest(test3);
		report.flush();

	}

}
