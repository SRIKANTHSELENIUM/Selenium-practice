package Xpath_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ACTIONSSS {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(3000);
	WebElement ele=	driver.findElement(By.name("birthday_day"));
	Select s=new Select(ele);
	s.selectByValue("21");
	
		
	}

}
