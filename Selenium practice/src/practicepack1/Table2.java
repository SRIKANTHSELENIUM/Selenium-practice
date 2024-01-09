package practicepack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		int rowcount=driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr")).size();
		System.out.println(rowcount);
		int cellcount=driver.findElements(By.xpath("//table[@id=\"productTable\"]//th")).size();
		System.out.println(cellcount);
//		 System.out.println("ID"+"      "+"Name"+"         "+"Price"+"       "+"Select");
	        
	        
	        /*for(int i=2;i<=rowcount;i++) {
	        	for(int j=1;j<=cellcount;j++) {
	        		
	        		String all_data=driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+i+"]//td["+j+"]")).getText();
	        		System.out.print(all_data+          "\t");
	        		
	        		
	        	}
	        	System.out.println();
	        	
	        }*/
//		Integer.parseInt(null)
//	       String name="srikanth";
//	       String name1=name.replace("s", "");
//	       System.out.println(name1);
		 for(int k=2;10>rowcount;k++) {
				String abovevalue=driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+k+"]//td[3]")).getText();
//				System.out.println(abovevalue);
				String name1=abovevalue.replace("$", "");
				 System.out.println(name1);
				int con=Integer.parseInt(name1);
				if(con>10){
					WebElement name2=driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+k+"]//td[4]"));
					String ele=name2.click();
					System.out.println(name2.click());
//					WebElement dollar=driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+k+"]//td[4]"));	
//					List<WebElement> click=dollar.click();
//					System.out.println(dollar);
				}
			}
		

	}

}
