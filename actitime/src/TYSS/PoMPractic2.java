package TYSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoMPractic2 {
	WebDriver driver;
	
	public PoMPractic2() {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "User_Name")
	private WebElement usernamebtn;


	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(xpath ="//tag[@Login='Submit']")
	private WebElement submit;

	public WebElement getusername() {
		return usernamebtn;
	}

	public WebElement getpassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void logOut()
	{
	//	Actions ac = Actions(driver);
	//	ac.moveToElement(password);
	}

}


















