package practicepack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_omoya {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("alert1")).click();
		
		
//		swith to alert popup
		
		Alert alert=driver.switchTo().alert();
		String alert_msg=alert.getText();
		alert.accept();
        System.out.println("The alert pop up msg is           "+alert_msg);       
		
		
	}

}
