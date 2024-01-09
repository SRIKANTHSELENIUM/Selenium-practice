package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReUsableCode {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		String USERNAME="srikanth_mutikiri97@yahoo.com";
//		String PASSWORD="polishetty";
		driver.findElement(By.cssSelector("input[class=\"a-input-text a-span12 auth-autofocus auth-required-field\"]")).sendKeys(USERNAME);
		driver.findElement(By.cssSelector("input[aria-labelledby=\"continue-announce\"]")).click();
		

	}

}
