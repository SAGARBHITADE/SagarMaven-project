package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login;
import utility.LonchBrowser;
@Listeners(utility.Listeners.class)
public class LoginTest extends LonchBrowser {
//	WebDriver ref;
	Login lp;
//llll
	//I have chang the code
	@BeforeClass
	public void initObject() {
		
		lp = new Login(ref);
		ref.get("https://www.facebook.com/login/");
	}

	@Test
	public void LoginCred() {
		lp.LoginCredintioal("xyz@gmail.com", "Sagar@");
		lp.button();
		Assert.assertFalse(false);

	}
	}


