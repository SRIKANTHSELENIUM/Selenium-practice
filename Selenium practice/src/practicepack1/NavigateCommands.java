package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#email")).sendKeys("srikanth.selenium91@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Facebook1234@");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button#loginbutton")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}
