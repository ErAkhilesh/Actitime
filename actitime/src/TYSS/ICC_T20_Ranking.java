package TYSS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;;

public class ICC_T20_Ranking {

	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> team = driver .findElements(By.xpath("//tbody/tr//td[2]/span[2]"));
		List<WebElement> point1 = driver.findElements(By.xpath("//tbody/tr//td[4]"));
		for(int i = 0;i<team.size();i++)
		{
			System.out.println(team.get(i).getText()+"  =    "+point1.get(i).getText());
		}


	}
}
