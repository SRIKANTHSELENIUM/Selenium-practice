package Xpath_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_contains {

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement ele=driver.findElement(By.name("birthday_day"));
		Select date=new Select(ele);
		Thread.sleep(3000);
		date.selectByValue("2");         
//		Thread.sleep(2000);
		//date.selectByValue("23");
//		Thread.sleep(2000);
		//date.selectByVisibleText("19");
		
		
		

	}

}
