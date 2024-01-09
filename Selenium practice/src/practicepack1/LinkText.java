package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.linkText("Forgotten account?")).click();
//		driver.navigate().to("https://www.facebook.com/login/");
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Sign up for Fac")).click();
//		driver.close();
		
		
		
	}

}
