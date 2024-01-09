package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("srikanth.selenium91@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("123456");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
        /*driver.findElement(By.name("firstname")).sendKeys("srikanth");
        driver.findElement(By.name("lastname")).sendKeys("selenium91");
        driver.findElement(By.name("reg_email__")).sendKeys("srikanth.selenium91@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("srikanth.senium91@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("sweety1234@12");
        driver.findElement(By.name("reg_passwd__")).click();
        driver.findElement(By.name("sex")).click();*/
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@id,'u_0_5_N5')]")).click();                             
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@id,'u_0_6_j')]")).click();
        
        
	}

}
