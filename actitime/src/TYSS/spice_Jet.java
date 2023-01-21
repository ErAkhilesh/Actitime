package TYSS;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spice_Jet {


	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sastasafar.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.findElement(By.id("returnDateRequiredYes")).click();

		String Fromcity = "New Delhi (DEL)";
		WebElement from = driver.findElement(By.id("origin"));
		from.sendKeys("New Delhi (DEL)");

		String Tocity = "Bangalore (BLR)";
		WebElement To = driver.findElement(By.id("destination"));
		To.sendKeys("Bangalore (BLR)");
		driver.findElement(By.xpath("//input[@name='trip_start_date']")).click();

		Date d = new Date();
		String[] date = d.toString().split(" ");
		
		date[2]="3";
		date[1]="Jan";
		date[5]="2023";
		
		
		//driver.findElement(By.xpath("(//div[@class='picker__box'])[1]//div[@aria-label='05/03/2023']")).click();
	
}
}


