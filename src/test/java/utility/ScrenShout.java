package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class ScrenShout extends LonchBrowser {

	public static void screnshot1(WebDriver ref, String name) throws IOException {

		TakesScreenshot tc = (TakesScreenshot) ref;
		File so = tc.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "\\ProjectScrenShot\\" + name + ".png");
		FileHandler.copy(so, file);

	}

}
