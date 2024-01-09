package practicepack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
driver.findElement(By.xpath("//a[text()=\"Dropdown\"]")).click();
		/*WebElement store=driver.findElement(By.tagName("select"));
		Select list=new Select(store);
		list.selectByVisibleText("Option 2");
		Thread.sleep(3000);
		list.selectByValue("1");
		List<WebElement> ALL_TEXT=list.getAllSelectedOptions();
		for(WebElement time :ALL_TEXT) {
			System.out.println(time.getText());
		}
		
		

	}

}
