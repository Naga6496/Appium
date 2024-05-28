package com.similrz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumBy;
public class signUp extends Baseclass{
	public void SignUpPage() throws Exception {
		test2 = report.startTest("Sign up Functionality Automation Test Results");
		FileInputStream();
		Thread.sleep(5000);
		driver.findElement(By.id(Attriputeprop.getProperty("AppAllow_buttonid"))).click();
		test1.log(LogStatus.PASS, "Application Allow button clicked successfully");
		driver.findElement(By.xpath(Attriputeprop.getProperty("Signupbutton_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Username_textbox_xpath"))).sendKeys(Valueprop.getProperty("username"));
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Countrycode_dropdown_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Countrycode_xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Mobilenumber_textbox_xpath"))).sendKeys(Valueprop.getProperty("mobilenumber"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Email_textbox_xpath"))).sendKeys(Valueprop.getProperty("email"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Password_textbox_xpath"))).sendKeys(Valueprop.getProperty("password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("confirmpassword_textbox_xpath"))).sendKeys(Valueprop.getProperty("password"));
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Signup\"))")).getText();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("termsandcondition_checkbox_xpth"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("signupbtn_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Password_text_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Outside_page_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("ConfirmPassword_text_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Outside_page_xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("signupbtn_xpath"))).click();
	}
}