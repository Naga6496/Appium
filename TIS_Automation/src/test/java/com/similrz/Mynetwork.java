package com.similrz;

public class Mynetwork extends Baseclass {
	public void Removeconnection() throws Exception {
		Thread.sleep(8000);
		ClickFunctionality("Mynetwork_icon_xpath", "Xpath");

		Thread.sleep(4000);
		ClickFunctionality("Myconnection_xpath", "Xpath");

		Thread.sleep(4000);
		ClickFunctionality("Myconnection_3dots_xpath", "Xpath");

		Thread.sleep(4000);
		ClickFunctionality("Removeconnection_xpath", "Xpath");

		Thread.sleep(7000);
		ClickFunctionality("Myconnection_backarrow_xpath", "Xpath");

		Thread.sleep(5000);
		ClickFunctionality("Home_icon_xpath", "Xpath");
	}

// ********************* Following and Unfollowing Profiles ***************************

	public void Followers() throws Exception {

		Thread.sleep(5000);
		ClickFunctionality("Mynetwork_icon_xpath", "Xpath");

		Thread.sleep(5000);
		ClickFunctionality("Followers_xpath", "Xpath");

		Thread.sleep(6000);
		ClickFunctionality("Following_xpath", "Xpath");

		Thread.sleep(5000);
		FillTextbox("Following_Searchtextbox_xpath", "Xpath", "shareserchname");

		Thread.sleep(3000);
		ClickFunctionality("Unfollow_xpath", "Xpath");

		Thread.sleep(5000);
		ClickFunctionality("Followers_Button_xpath", "Xpath");

		Thread.sleep(5000);
		FillTextbox("Following_Searchtextbox_xpath", "Xpath", "shareserchname");
		Thread.sleep(8000);
		ClickFunctionality("Follow_xpath", "Xpath");

		Thread.sleep(4000);
		ClickFunctionality("Following_xpath", "Xpath");

		Thread.sleep(5000);
		ClickFunctionality("Myconnection_backarrow_xpath", "Xpath");

		Thread.sleep(3000);
		ClickFunctionality("Home_icon_xpath", "Xpath");
	}

//*********************	Matching personal values User Profiles ***************************

	public void MatchingProfile() throws Exception {

		Thread.sleep(5000);
		ClickFunctionality("Mynetwork_icon_xpath", "Xpath");

		Thread.sleep(6000);
		ClickFunctionality("MatchingProfile_xpath", "Xpath");

		Thread.sleep(8000);
		ClickFunctionality("Myconnection_xpath", "Xpath");

		Thread.sleep(5000);
		ClickFunctionality("Myconnection_backarrow_xpath", "Xpath");

		Thread.sleep(5000);
		ClickFunctionality("CheckFollowers_xpath", "Xpath");

		Thread.sleep(4000);
		ClickFunctionality("Myconnection_backarrow_xpath", "Xpath");

		Thread.sleep(5000);
		ClickFunctionality("RateAndReview_xpath", "Xpath");

		Thread.sleep(4000);
		ClickFunctionality("RatingAboveFive_xpath", "Xpath");

		Thread.sleep(4000);
		ClickFunctionality("SubmitButton_xpath", "Xpath");
		Thread.sleep(5000);

		ClickFunctionality("Myconnection_backarrow_xpath", "Xpath");
	}

// ********************* Single matching personal values ***************************

	public void SingleMatchingPersonalValues() throws Exception {

//		driver.findElement(By.xpath(Attriputeprop.getProperty("Mynetwork_icon_xpath"))).click();
		Thread.sleep(8000);

		ClickFunctionality("SingleMatching_xpath", "Xpath");
		Thread.sleep(8000);

		ClickFunctionality("Profile_xpath", "Xpath");
		Thread.sleep(5000);

		ClickFunctionality("MessageButton_xpath", "Xpath");
		Thread.sleep(5000);

		FillTextbox("MessageBox_xpath", "Xpath", "Testtext");
		Thread.sleep(5000);

		ClickFunctionality("SendButton_xpath", "Xpath");
		Thread.sleep(8000);

		ClickFunctionality("chat_backarrow_xpath", "Xpath");
		Thread.sleep(8000);

		ClickFunctionality("chat_backarrow_xpath", "Xpath");
		Thread.sleep(8000);

	}
}
