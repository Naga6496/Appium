package com.similrz;

import java.awt.event.KeyEvent;

public class ProfileEdit extends Baseclass{

	public void EditProfile() throws Exception{
	Thread.sleep(3000);
	ClickFunctionality("Profile_Icon", "Xpath");
	
//	Thread.sleep(3000);
//	ClickFunctionality("Chat_Popup", "Xpath");
	
//	Thread.sleep(3000);
//	ClickFunctionality("Profile_Allow_Popup_xpath", "Xpath");
//	
//	Thread.sleep(3000);
//	ClickFunctionality("AppAllow_buttonid", "Id");
	
	Thread.sleep(3000);
	ClickFunctionality("Profile_Edit_Icon", "Xpath");
	
	Thread.sleep(3000);
	ClickFunctionality("Profile_Edit", "Xpath");
	
	Thread.sleep(5000);
	FillTextbox("Profile_Edit", "Edit_Textname", "Xpath");
	
	Thread.sleep(3000);
	ScrollinToview("ScrollintoView_string", "ScrollIntoView", "Xpath", "Profile_Savebutton_xpath");
	}
}