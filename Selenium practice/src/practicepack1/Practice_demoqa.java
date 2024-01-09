package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_demoqa {

	public static void main(String[] args) throws Throwable {
        
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("srikanth");
        driver.findElement(By.id("lastName")).sendKeys("selenium");
        driver.findElement(By.id("userEmail")).sendKeys("srikanth.selenium91@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"gender-radio-1\"]")).click();
//        driver.findElement(By.xpath("//input[starts-with(@id,\"gender-radio-2\")]")).click();
//        driver.findElement(By.xpath("//input[starts-with(@id,\"gender-radio-3\")]")).click();
        
        
        
        
	}

}
