package com.similrz;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class SimilrzLoginandSignup extends Baseclass{
	static AndroidDriver ad = (AndroidDriver) driver;
//	static AndroidDriver driver;
	static JavascriptExecutor je = (JavascriptExecutor) driver;
	@BeforeTest
	public void setup() throws Exception {
		FileInputStream();
		DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "RFCR90JBNJV");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\EICPL02-L308\\Downloads\\Similrz_22_2.apk");
        
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);       
	}
	
//	@Test (priority = -1)
//	public void SignUp() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.findElement(By.id(Attriputeprop.getProperty("AppAllow_buttonid"))).click();
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Signupbutton_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Username_textbox_xpath"))).sendKeys(Valueprop.getProperty("username"));
//		Thread.sleep(2000);
//		driver.findElement(By.id(Attriputeprop.getProperty("Countrycode_dropdown_xpath"))).click();
//		driver.findElement(By.id(Attriputeprop.getProperty("Countrycode_xpath"))).click();
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Mobilenumber_textbox_xpath"))).sendKeys(Valueprop.getProperty("mobilenumber"));
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Email_textbox_xpath"))).sendKeys(Valueprop.getProperty("email"));
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Password_textbox_xpath"))).sendKeys(Valueprop.getProperty("password"));
//		driver.findElement(By.xpath(Attriputeprop.getProperty("confirmpassword_textbox_xpath"))).sendKeys(Valueprop.getProperty("confirm_pssword"));
//	}

	//	
	@Test (priority = 0)
	public void Login() throws InterruptedException {
		//ImplicitlyWait();
		Thread.sleep(5000);
		driver.findElement(By.id(Attriputeprop.getProperty("AppAllow_buttonid"))).click();
		
		driver.findElement(By.xpath(Attriputeprop.getProperty("Login_button"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Email_txtbox"))).sendKeys(Valueprop.getProperty("validEmai"));
		driver.findElement(By.xpath(Attriputeprop.getProperty("Password_txtbox"))).sendKeys(Valueprop.getProperty("vlidpassword"));
		driver.findElement(By.xpath(Attriputeprop.getProperty("Loginbutton_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.id(Attriputeprop.getProperty("LoginAllow_buttonid"))).click();
	}
	
//	@Test (priority = 1)
//	public void Home_Mynetwork_Removeconnection() throws InterruptedException {
//		Thread.sleep(8000);
////		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Network']"));
////		System.out.println(element);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Mynetwork_icon_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Myconnection_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Myconnection_3dots_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Removeconnection_xpath"))).click();
//		Thread.sleep(7000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Myconnection_backarrow_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Home_icon_xpath"))).click();
//	}
//	 
//	@Test (priority = 1)
//	public void Home_Profilepage() throws InterruptedException {
//		Thread.sleep(8000);
//		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='Network']"));
//		System.out.println(element);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Home_ProfileIcon_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("RequestIcon_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("MessageTextbox_xpath"))).sendKeys(Valueprop.getProperty("message_textbox"));
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("MessageIcon_xpath"))).click();	
//		Thread.sleep(7000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Profilepage_bckicon_xpth"))).click();	
//	}
	
	@Test (priority = 1)
	public void Home_Notifictionpage() throws InterruptedException {
//		ImplicitlyWait();
		Thread.sleep(8000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Notificationiconbutton_xpath"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Notifiction_profile_xpath"))).click();
		driver.findElement(By.xpath(Attriputeprop.getProperty("Notifiction_profile_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("AddConnectionbutton_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Profile_backicon_xpath"))).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Notification_backicon_xpath"))).click();	
	}
	
	@Test (priority = 2)
	public void Chat() throws InterruptedException {
//		ImplicitlyWait();
		Thread.sleep(8000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Chat_icon_xpath"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Appropriat_Chat_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Chat_textbox_xpath"))).sendKeys(Valueprop.getProperty("message_textbox"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Send_icon_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Attachment_icon_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Gallery_icon_xpath"))).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("GalleryAllow_button_xpath"))).click();
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Select_downloads_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Choose_pic_xpath"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("chat_backarrow_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("chat_backarrow_xpath"))).click();
	}
	
	@Test (priority = 3)
	public void Post() throws InterruptedException {
//		ImplicitlyWait();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Posticon_xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Posttextbox_xpath"))).sendKeys(Valueprop.getProperty("text"));
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Imageicon_xpath"))).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("PostImageAllow_button_xpath"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("SelectAlbumtag_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Select_downlodes_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Selectimge_xpath"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Attriputeprop.getProperty("Post_button_xpath"))).click();
	}
	
//	@Test (priority = 1)
//	public void Event() throws InterruptedException {
////		ImplicitlyWait();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Eventicon_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Createvent_button_xpath"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Even_dropdown_xpath"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Select_event_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Okbutton_xpath"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Addphoto_xpath"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Fromphotos_xpath"))).click();
//		Thread.sleep(9000);
//		driver.findElement(By.id(Attriputeprop.getProperty("AppAllow_buttonid"))).click();
//		Thread.sleep(10000);
////		driver.findElement(By.id(Attriputeprop.getProperty("Downloadtaggle_xpath"))).click();
////		Thread.sleep(3000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Select_Eventimage_xpath"))).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Cancelbutton_xpath"))).click();
//		Thread.sleep(8000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("EventTitle_textbox_xpath"))).sendKeys(Valueprop.getProperty("EventTitle"));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Startdate_xpath"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Nextmonth_Arrow_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Select_Startdate_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Enddate_xpath"))).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Select_Enddate_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Staettime_xpath"))).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("SetStarttime_1_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("SetStarttime_2_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Set_AM_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Endtime_xpath"))).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("SetEndtime_1_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("SetEndtime_2_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Set_PM_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
////		Thread.sleep(5000);
////		driver.findElement(By.xpath(Attriputeprop.getProperty("Location_xpath"))).click();
////		Thread.sleep(8000);
////		driver.findElement(By.xpath(Attriputeprop.getProperty("Select_loction_xpath"))).sendKeys(Valueprop.getProperty("Loction"));
////		Thread.sleep(5000);
////		driver.findElement(By.xpath(Attriputeprop.getProperty("Choose_location_xpath"))).click();
////		Thread.sleep(3000);
////		driver.findElement(By.xpath(Attriputeprop.getProperty("Loction_savebutton_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("RSVP_Startdate_xpath"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Nextmonth_Arrow_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Startdate_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("RSVP_Enddate_xpath"))).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Enddate_xapth"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("RSVP_Starttime_xapth"))).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Starttime_1_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Starttime_2_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Set_AM_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("RSVP_Endtime_xpath"))).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Endtime_1_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("SetRSVP_Endtime_2_Xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Set_PM_xpath"))).click();
//		
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Setbutton_xpath"))).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(Attriputeprop.getProperty("Description_textbox_xpath"))).sendKeys(Valueprop.getProperty("Testtext"));
//		Thread.sleep(9000);
//		
//		String uiSelector = "new UiSelector().textMatches(\"" + text
//                + "\")";
//
//String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
//                + uiSelector + ");";
//
//driver.findElementByAndroidUIAutomator(command);
////		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains().instance(0))").click();
////		 je.executeScript("window.scrollBy(0,1000)");
//////		je.executeScript("arguments[0].scrollIntoView(true)", Attriputeprop.getProperty("EventScrolldown_xpath"));	
////		Thread.sleep(3000);
////		driver.findElement(By.xpath(Attriputeprop.getProperty("Specialinstruction_textbox_xpath"))).sendKeys(Valueprop.getProperty("Testtext"));
//		
//	}
	
}
