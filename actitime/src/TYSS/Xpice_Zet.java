package TYSS;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.sdk.metrics.data.Data;

public class Xpice_Zet {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.moveByOffset(10, 10).click().perform();

		String fromcity ="Mumbai";
		WebElement from=driver.findElement(By.id("fromCity"));
		from.sendKeys(fromcity);
		driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();

		String tocity="New Delhi";
		WebElement to = driver.findElement(By.id("toCity"));
		to.sendKeys(tocity);
		driver.findElement(By.xpath("//p[.='New Delhi, India']")).click();

	
		
			Date d =new Date();

			System.out.println(d);
			String d2[] =d.toString().split(" ");
			String  day =d2[0] ;
			String month = d2[1];
			String date5 = d2[2];
			String time =d2[3];
			String year = d2[5];
			String traveld = day+" "+month+" "+date5+" "+time+" "+year;
			//driver.findElement(null)
		
		
		
		
	} 
}