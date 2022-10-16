package utility;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class LonchBrowser {
	public  WebDriver ref;

	@BeforeSuite
	public void OpenChromeDriver() {

//			System.setProperty("webdriver.chrome.driver",
//					"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ref = new ChromeDriver();
		ref.manage().window().maximize();
		ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterSuite
	public void CloseChromeDrive() {

	//	ref.quit();
	}

}
