package pages;

import java.sql.Ref;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(id = "loginbutton")
	private WebElement Login;

	public Login(WebDriver ref) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(ref, this);
	}

	public void LoginCredintioal(String em, String pass) {
		email.sendKeys(em);
		password.sendKeys(pass);
	}

	public void button() {

		Login.click();
	}

}
