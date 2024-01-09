package practicepack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_class {

	public static void main(String[] args) throws Throwable  {
		System.setProperty("weddriver.edge.driver", "D:\\chromedriver-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		/*WebElement arg=driver.findElement(By.xpath("//select[@id=\"first\"]"));
		Select dropdown=new Select(arg);
		dropdown.selectByIndex(3);
		Thread.sleep(2000);
		dropdown.selectByValue("Microsoft");
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Google");
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Yahoo");
		Thread.sleep(2000);
		WebElement arg1=driver.findElement(By.xpath("//select[starts-with(@id,\"animals\")]"));
		Select dropdown1=new Select(arg1);
		dropdown1.selectByValue("babycat");*/
		
		WebElement arg2 =driver.findElement(By.xpath("//select[@id=\"second\"]"));
		Select dropdown2=new Select(arg2);
//		dropdown2.selectByIndex(3);
//		dropdown2.selectByVisibleText("burger");                                         //error
		Thread.sleep(2000);
		List<WebElement> ALL_LIST=dropdown2.getAllSelectedOptions();                      //all text names not showing in console tab
		for(WebElement REF:ALL_LIST) {
			System.out.println(REF.getText());
			
		}	

	}

}
