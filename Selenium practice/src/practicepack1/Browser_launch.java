package practicepack1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Browser_launch {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.driver.edge", "C:\\Users\\SRIKANTH\\Downloads\\edgedriver_win64.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\SRIKANTH\\Downloads\\chromedriver-win64 (1) 1177\\chromedriver-win64.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();*/
		System.setProperty("webdriver.driver.firefox", "D:\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		


	}

}
