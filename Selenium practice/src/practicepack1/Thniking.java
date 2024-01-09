package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thniking {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
		/*driver.findElement(By.id("signup")).click();
		driver.findElement(By.id("firstName")).sendKeys("srikanth");
		driver.findElement(By.id("lastName")).sendKeys("selenium91");
		driver.findElement(By.id("email")).sendKeys("srikanth.selenium91@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Thinking1234@12");
		driver.findElement(By.id("submit")).click();*/
		driver.findElement(By.id("email")).sendKeys("srikanth.selenium91@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Thinking1234@12");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-contact")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("NAVEEN");
		driver.findElement(By.id("lastName")).sendKeys("POLISHETTY");
		driver.findElement(By.id("birthdate")).sendKeys("1989-12-27");
		driver.findElement(By.id("email")).sendKeys("navven@polishetty.com");
		driver.findElement(By.id("phone")).sendKeys("9032532575");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder=\"Address 1\"]")).sendKeys("TAJMAHAL");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder=\"Address 2\"]")).sendKeys("MA INTI PAKKANE");
		Thread.sleep(3000);
		driver.findElement(By.id("city")).sendKeys("JANGAL");
		driver.findElement(By.id("stateProvince")).sendKeys("MANGAL");
		driver.findElement(By.id("postalCode")).sendKeys("500077");
		driver.findElement(By.id("country")).sendKeys("MINDSPACE");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[onclick=\"location.href='/contactList'\"]")).click();
//		driver.findElement(By.id("submit")).click();
		
//		Thread.sleep(3000);
//		driver.findElement(By.id("logout")).click();
		

	}

}
