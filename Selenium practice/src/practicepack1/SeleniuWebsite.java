package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniuWebsite {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		driver.manage().window().maximize();
		String title=driver.findElement(By.tagName("h1")).getText();
//		System.out.println(driver.findElement(By.tagName("h1")).getText());
		System.out.println(title);
		driver.findElement(By.cssSelector("input#myTextInput")).sendKeys("mango");    //tagname & id
		driver.findElement(By.cssSelector("textarea[class=\"textareaClass area1\"]")).sendKeys("space"); //tagname & attribute
        driver.findElement(By.cssSelector("input[id=\"myTextInput2\"]")).sendKeys("Apple");
        driver.findElement(By.cssSelector("button[style=\"color: green;\"]")).click();
        driver.findElement(By.cssSelector("input[placeholder=\"Placeholder Text Field\"]")).sendKeys("vishal");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input.radioClass1[id=\"radioButton2\"]")).click();
        Thread.sleep(2000);
//        driver.findElement(By.linkText("seleniumbase.com")).click();
//        driver.findElement(By.linkText("SeleniumBase on GitHub")).click();
//        driver.findElement(By.linkText("seleniumbase.io")).click();
        driver.findElement(By.partialLinkText("ele")).click();
        
	}

}
