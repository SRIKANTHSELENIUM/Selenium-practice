package practicepack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//Find out number of rows from table
		int Rows=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
        System.out.println("No of Rows are::       "+Rows);
        //Find out No of columns from the Table
        int Columns=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
        System.out.println("No of columns are::     "+Columns);
        //Read specific row and column
        String data=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[6]//td[2]")).getText();
        System.out.println("AVailable data from third column::"    +data);
        //Read data from all the rows and columns
        System.out.println("BookName"+"      "+"Author"+"         "+"Subject"+"       "+"Price");
        
        
        for(int i=2;i<=Rows;i++) {
        	for(int j=1;j<=Columns;j++) {
        		String all_data=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td["+j+"]")).getText();
        		System.out.print(all_data+          "\t");
        		
        		
        	}
        	System.out.println();
        	
        }
        //print bookname whose author is mukesh
        for(int k=2;k<=Rows;k++) {
        	String Author=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+k+"]//td[2]")).getText();
        	if(Author.equals("Mukesh"))
        	{
        		String bookname=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+k+"]//td[1]")).getText();
        		System.out.println(bookname+        "   "     +Author);
        	}
        	
        }
        //Print sum of book price 
        int sum=0;
        for(int l=2;l<=Rows;l++) {
        	String addition=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+l+"]//td[4]")).getText();
        	sum=sum+Integer.parseInt(addition);
        	
        }
        
        System.out.println(sum);
        
        
        
        
        
	}

}
