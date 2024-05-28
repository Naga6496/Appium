package com.similrz;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Execution extends Baseclass {

	@BeforeTest
	public void beforeTest() throws Exception {
		setup();
	}

	@Test(priority = 0)
	public void login() throws Exception {
		Login l = new Login();
		l.LoginPage();
	}
	
//	@Test(priority = 1)
//	public void mynetwork() throws Exception {
//		Mynetwork m = new Mynetwork();
//		m.Removeconnection();
//		m.Followers();
//		m.MatchingProfile();
//		m.SingleMatchingPersonalValues();
//	}
	
	@Test(priority = 1)
	public void post() throws Exception {
		Post p = new Post();
		p.ImagePost();
	}
	
	
	
	@Test(priority = 2)
	public void chat() throws Exception {
		Chat c = new Chat();
		c.chat();
		c.Chat_Creategroup();
		c.Chat_Add();
	}
	 
		@Test(priority = 3)
	public void profileEdit() throws Exception {
		ProfileEdit p = new ProfileEdit();
		p.EditProfile();
	}
	
}
	
	
	
	
	
	
	

//	@Test(priority = 1)
//	public void homePage() throws Exception {
//		Home_LikeCommentShare h = new Home_LikeCommentShare();
//		h.Deletepost();
//	}	
//	@Test(priority = 1)
//	public void Eventpage() throws Exception {
//		Event e = new Event();
//		e.YourEvent();
//		e.ShareEvent();
//	}	
//	@Test(priority = 1)
//	public void postFunctionlity() throws Exception {
//		Post p = new Post();
//		p.PostPage();
//	}
//	public static void main(String[] args) throws Exception {
//		AutomationSetup a = new AutomationSetup();
//		a.setup();
//		
//		Login l = new Login();
//		l.LoginPage();
//		
//		Home_LikeCommentShare h = new Home_LikeCommentShare();
//		h.LikeCommandShare();
//		ForgotPassword f = new ForgotPassword();
//		f.forgotPassword();
//		signUp s = new signUp();
//		s.SignUpPage();
//	}
//}