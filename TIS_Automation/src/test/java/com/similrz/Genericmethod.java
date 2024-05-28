package com.similrz;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class Genericmethod {
	//To get the web element in property file use this method will created it will call in baseclass 
		@SuppressWarnings("deprecation")
		public static WebElement getwebelement(String locatorType , String type , AndroidDriver driver) throws IOException {
			WebElement webElement = null;
			try {
				switch(type) {
				case "Id":
					webElement = driver.findElement(By.id(locatorType));
					break;
				case "Name":
					webElement = driver.findElement(By.name(locatorType));
					break;
				case "Classname":
					webElement = driver.findElement(By.className(locatorType));
					break;
				case "Xpath":
					webElement = driver.findElement(By.xpath(locatorType)); 
					break;
				case "CssSelector":
					webElement = driver.findElement(By.cssSelector(locatorType));
					break;
				case "ScrollIntoView":
					webElement = driver.findElement(MobileBy.AndroidUIAutomator(locatorType));
					break;	
				default:
					break;			
				}
			}catch(NoSuchElementException e){

				e.printStackTrace();
				Assert.fail(locatorType + " Element not found");

				}
			return webElement;
	}

}
