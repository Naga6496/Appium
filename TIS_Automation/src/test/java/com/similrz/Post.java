package com.similrz;

import com.relevantcodes.extentreports.LogStatus;

public class Post extends Baseclass {
	public void ImagePost() throws Exception {
		test4 = report.startTest("Post Functionality Automation Test Results");
		FileInputStream();

		Thread.sleep(3000);
		ClickFunctionality("Posticon_xpath", "Xpath");
		test4.log(LogStatus.PASS, "Post icon clicked successfully");
//		test4.log(LogStatus.FAIL, "Post icon not clicked");
		
		Thread.sleep(3000);
		FillTextbox("Posttextbox_xpath", "Xpath", "posttext");
		test4.log(LogStatus.PASS, "Post text message entered successfully");
//		test4.log(LogStatus.FAIL, "Post text message not entered");
		Thread.sleep(5000);
		ClickFunctionality("Imageicon_xpath", "Xpath");
		test4.log(LogStatus.PASS, "Image icon clicked successfully");
//		test4.log(LogStatus.FAIL, "Image icon not clicked");
		
		Thread.sleep(8000);
		ClickFunctionality("PostImageAllow_button_xpath", "Xpath");
		
/*		****************Select Album button**************** 
 		 *Thread.sleep(10000);
		 *driver.findElement(By.xpath(Attriputeprop.getProperty("SelectAlbumtag_xpath"))).click();	 	
 */
	
		Thread.sleep(5000);
		ClickFunctionality("Select_downlodes_xpath", "Xpath");
		test4.log(LogStatus.PASS, "downloads tag clicked successfully");
//		test4.log(LogStatus.FAIL, "downloads tag not clicked");
		
		Thread.sleep(5000);
		ClickFunctionality("Selectimge_xpath", "Xpath");
		test4.log(LogStatus.PASS, "Image clicked successfully");
//		test4.log(LogStatus.FAIL, "Image not clicked");
		
		Thread.sleep(5000);
		ClickFunctionality("Image_Done_xpth", "Xpath");
		
		Thread.sleep(5000);
		ClickFunctionality("Post_button_xpath", "Xpath");
		test4.log(LogStatus.PASS, "Post button clicked successfully");
//		test4.log(LogStatus.FAIL, "Post button is not clicked");
		
		report.endTest(test4);
		report.flush();
	}
}
