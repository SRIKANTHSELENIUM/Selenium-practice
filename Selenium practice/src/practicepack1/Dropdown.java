package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.tagName("select"));
		Select values=new Select(dropdown);
		values.getFirstSelectedOption();
		Thread.sleep(2000);
		values.selectByIndex(3);
		Thread.sleep(2000);
		values.selectByValue("ATA");
		Thread.sleep(2000);
		values.selectByVisibleText("Antigua and Barbuda");
		

	}

}
