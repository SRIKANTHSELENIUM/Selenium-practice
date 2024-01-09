package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver =new ChromeDriver();
driver.get("https://seleniumbase.io/demo_page");
driver.findElement(By.xpath("//input[starts-with(@id,\"radioButton2\")]")).click();
	}

}
