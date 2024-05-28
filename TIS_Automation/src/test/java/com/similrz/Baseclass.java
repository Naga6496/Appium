package com.similrz;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

@SuppressWarnings("deprecation")
public class Baseclass extends Genericmethod{

	static AndroidDriver driver;
	static Properties Valueprop = new Properties();
	static Properties Attriputeprop = new Properties();
	
	public static ExtentReports report = new ExtentReports(System.getProperty("user.dir")+"\\HTMLReport\\TestResult.html");
//			"C:\\Users\\eicpl02l308\\eclipse-workspace 1\\TIS_Automation\\HTMLReport\\Test.html");
	

	
	public static ExtentTest test1, test2, test3, test4, test5, test6, test7;
	
	public void FileInputStream() throws Exception {
		FileInputStream values = new FileInputStream(System.getProperty("user.dir") + "\\values.properties");
		Valueprop.load(values);
		FileInputStream attributes = new FileInputStream(System.getProperty("user.dir") + "\\attributes.properties");
		Attriputeprop.load(attributes);
	}

//	To setup the Ui Automator
	public void setup() throws Exception {
		test1 = report.startTest("Automation setup Functionality Test Results");
		
		FileInputStream();
		DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		test1.log(LogStatus.PASS, "Platform Name entered successfully setup");
//		test1.log(LogStatus.FAIL, "Image icon not clicked");
		
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "RFCR90JBNJV");
		test1.log(LogStatus.PASS, "Device Name entered successfully setup");
		
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
		test1.log(LogStatus.PASS, "Platform Version entered successfully setup");
		
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		test1.log(LogStatus.PASS, "Automation Name entered successfully setup");
		
		caps.setCapability(MobileCapabilityType.APP, "D:\\Documents\\TIS(Trust Index Score)\\Similrz_22_2.apk");
		test1.log(LogStatus.PASS, "App apk file enterend successfully setup");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		report.endTest(test1);
		report.flush();
	}
	
//	The fill text box method to fill the all textbox
	public static void FillTextbox(String textboxelement, String loctype, String Message) throws Exception {
		getwebelement(Attriputeprop.getProperty(textboxelement), loctype, driver).sendKeys(Valueprop.getProperty(Message));
	}
	
//	The click functionality method to click the all clicking function
	public static void ClickFunctionality(String buttonelement, String loctype) throws Exception {
		getwebelement(Attriputeprop.getProperty(buttonelement), loctype, driver).click();
	}
	
	// All the Robot class functions are used this method
		public static void RobotclassKeypress(int keyname) throws AWTException {			
			Robot r = new Robot();		
			r.keyPress(keyname);		
		}
		
		public void RobotclassKeyrelease(int keyname) throws AWTException {
			Robot r = new Robot();	
			r.keyRelease(keyname);
		}
	
	public static void ScrollinToview(String Message, String loctype, String element, String loctype1) throws Exception {
		while (true) {
//		    driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
			getwebelement(Attriputeprop.getProperty(Message), loctype, driver);
		    Thread.sleep(2000);

		    WebElement Button = null;
		    try {
//		    		 driver.findElement(By.xpath("//android.widget.Button[@text='Save']"));
		    		 Button = getwebelement(Attriputeprop.getProperty(element),loctype1, driver);
		    } catch (Exception e) {
		    	
		    }

		    if (Button != null) {
		        Button.click();
		        break;
		    }
		}
	}
	
	public static void ImplicitlyWait() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
