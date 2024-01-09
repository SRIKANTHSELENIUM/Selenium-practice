package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		// 1) Find total number of rows 
		
				int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //7  preferred
				//int rows=driver.findElements(By.tagName("tr")).size(); //8   prefered only if you have one single table
				System.out.println("Number of rows:"+ rows); //7
				
				
				//2) Find total number of columns
				
				int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
				//int cols=driver.findElements(By.tagName("th")).size(); // dont prefer if you have multiple tables
				
				System.out.println("Number of columns:"+ cols); //4
				
				
				//3) Read specific row & column data
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
				System.out.println(value); //Master In JS
		//4) Read data from all the rows & columns
				
				System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");
				
				
				for(int r=2;r<=rows;r++)
				{
					for(int c=1;c<=cols;c++)
					{
						String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
						System.out.print(value1+"\t"); 
					}
					System.out.println();
				}
				
					
				
				//5) Print book names whose author is Amit
				
				for(int r=2;r<=rows;r++)
				{
					String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
					
					if(author.equals("Amit"))
					{
						String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
						System.out.println(author+"    "+bookname);
					}
					
				}
				//print java subject which price 
				
				for (int r=3;r<=rows;r++ ) {
					String subject=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[3]")).getText();
					if(subject.equals("Javascript"))
					{
						String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
						System.out.println("subject name::    "+subject+"    price::   "+price);
					}
				}
		//6)Find sum of prices for all the books
				
				int sum=0;
				for(int r=2;r<=rows;r++)
				{
					String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
					sum=sum+Integer.parseInt(price);//sum=0+300 =300+500=800
					
				}
				
				System.out.println("Total price of books:"+sum);
			}
		

			}

		


	

