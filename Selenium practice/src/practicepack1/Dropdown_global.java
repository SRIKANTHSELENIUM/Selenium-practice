package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_global {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement dropdowns_p=driver.findElement(By.xpath("//select[@id=\"first\"]"));
		Select sc=new Select(dropdowns_p);
		sc.selectByIndex(1);
	//	Thread.sleep(2000);
		sc.selectByValue("Apple");
	//	Thread.sleep(2000);
		sc.selectByVisibleText("Yahoo");

	}

}
