package TYSS;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PoMPractic {
	WebDriver driver;
	public void Home (WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id= "username")
	private WebElement UsernameBtn;

	@FindBy(id= "password")
	private WebElement passwordBtn;

	@FindBy(xpath= "//input[@login='submit']")
	private WebElement submitBtn;

	

	


	public WebElement getUsername() {
		return UsernameBtn;
	}

	public WebElement getpassword() {
		return passwordBtn;
	}
	public WebElement  getsubmitBtn() {
		return submitBtn;
	}
	
	public void logout()
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(UsernameBtn).perform();
		
	//	signOutLink.click();
	}










}

