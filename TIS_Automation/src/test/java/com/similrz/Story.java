package com.similrz;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Story extends Baseclass {
	Login l = new Login();

	public void AddStory() throws InterruptedException {

//*********************	Add Story***************************
		Thread.sleep(8000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("AddStory_xpath"))).click();
		Thread.sleep(20000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("GallaryIcon_xpath"))).click();
		driver.findElement(By.xpath("//android.widget.Image[@text='whiteimg']")).click();
		Thread.sleep(10000);
     	driver.findElement(By.id(Attriputeprop.getProperty("AppAllow_buttonid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("RecentPic_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Image_xpath1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Send_xpath"))).click();
		Thread.sleep(10000);
	
	}

	// ********************* View Story ***************************

	public void ViewStory() throws Exception {
		
		Thread.sleep(8000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("View_Story"))).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("MessageBox_xpath")))
				.sendKeys(Valueprop.getProperty("message_textbox"));
		Thread.sleep(10000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("SendButton_xpath"))).click();
		Thread.sleep(5000);
	}

	// ********************* Delete Story ***************************

	public void DeleteStory() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("CheckStrory_xpath"))).click();
		Thread.sleep(8000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Attriputeprop.getProperty("ThreeDotIcon_xpayh"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("DeleteSory_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("ConfirmationDeleteButton_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("DeleteSory_xpath"))).click();
		Thread.sleep(5000);

	} 
}
