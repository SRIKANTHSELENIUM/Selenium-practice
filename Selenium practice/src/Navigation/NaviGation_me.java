package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NaviGation_me {

	public static void main(String[] args) throws Throwable {
		/*System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);*/
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.canva.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.cricbuzz.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
//		driver.close();
//		driver.quit();

	}

}
