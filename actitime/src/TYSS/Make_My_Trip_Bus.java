package TYSS;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class Make_My_Trip_Bus {
	private static final String wait = null;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Actions act = new Actions (driver);
		act.moveByOffset(10, 10).perform();
		act.doubleClick().perform(); 
		//wait.util(ExpectedCondition.elementToBeClickable(driver.findElement(By.xpath(wait))))
		driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/bus-tickets/']")).click();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune,Maharashtra");
		driver.findElement(By.xpath("(//span[@class='sr_city blackText'])[4]")).click();

		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Kolkata");
		driver.findElement(By.xpath("(//span[@class='sr_city blackText'])[6]")).click();

		Date d = new Date ();
		 String[] sa = d.toString().split(" ");
		String day=sa[0];
		 String month =sa[1];
		 String date = sa[2];
		 String year =sa[5];
		 
	//	String todat=day+" "+month+" "+daa.out.println(todat);
		 for(;;) {
			 
				 try
				 {
				Thread.sleep(500);
		// driver.findElement(By.xpath("//div[@aria-label='"+todat+"']")).click();
			 break;
				 }
				catch(Exception e)
				 {
					Thread.sleep(300);
					 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click(); 
				 }
			 }
			 //catch(Exception e) {
				//driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click(); 
			 }
		 
	
		 
		 
		 
		 
		 
		 
		 

	}
