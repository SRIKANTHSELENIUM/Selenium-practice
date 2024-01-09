package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Amazon {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement apple=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		Select ALL_ELE=new Select(apple);
		ALL_ELE.getFirstSelectedOption();
		Thread.sleep(2000);
		ALL_ELE.selectByIndex(5);
		Thread.sleep(2000);
		ALL_ELE.selectByValue("search-alias=fashion");
		Thread.sleep(2000);
		ALL_ELE.selectByVisibleText("Amazon Pharmacy");
		driver.close();
		

	}

}
