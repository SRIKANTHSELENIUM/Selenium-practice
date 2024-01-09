package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOrangehrm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Om Namo");   //xpath
		driver.findElement(By.xpath("//input[@type=\"text\"][2]")).sendKeys("Narayanaya");       //xpath
		driver.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("9032532575");    //xpath //textarea[@id="textarea"]
		driver.findElement(By.xpath("//textarea[@id=\"textarea\"]")).sendKeys("Taj Banjara hotel"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"male\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"female\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"sunday\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"monday\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"tuesday\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"wednesday\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"thursday\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"friday\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"saturday\"]")).click();
		
		


	}

}
