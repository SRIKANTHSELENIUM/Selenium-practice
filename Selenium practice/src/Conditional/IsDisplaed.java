package Conditional;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplaed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/?isCorporate=true&isProfile=b2b");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement email=driver.findElement(By.cssSelector("input[placeholder=\"Enter your work email id\"]"));//cssselector
		if(email.isDisplayed() && email.isEnabled())
		{
			email.sendKeys("srikanth.selenium91@gmail.com");
		}
		driver.findElement(By.xpath("//span[text()=\"CONTINUE\"]")).click();
		
//	System.out.println(driver.findElement(By.xpath("//span[text()=\"CONTINUE\"]")).isSelected());	//telling that true or false
		System.out.println(driver.findElement(By.xpath("//span[@class=\"checkBox appendRight10\"]")).isSelected());

	}

}
