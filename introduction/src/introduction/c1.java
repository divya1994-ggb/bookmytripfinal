package introduction;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\Test\\chromeDriver.exe" );
		WebDriver dr=new ChromeDriver();
		dr.get("https://in.bookmyshow.com/pune/movies");
		Thread.sleep(3000);
		
		dr.manage().window().maximize();
		Thread.sleep(4000);
		//dr.manage().timeouts().ImplicitlyWait(timeSpan.FromSeconds(5));
		//Alert al = dr.switchTo().alert();
		//al.accept();
		dr.findElement(By.xpath("//*[@id=\"wzrk-confirm\"]")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("/html/body/div[5]/header/nav/div[3]/div/div[1]/ul/li[1]/a")).click();
		
		//JavascriptExecutor js = (JavascriptExecutor) dr;
	    //Find element by link text and store in variable "Element"  
		Thread.sleep(1000);
        dr.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/div/section[1]/div/div/div[2]/div/div/div[1]/div[1]/a/div/div[1]/img[1]")).click();
        //This will scroll the page till the element is found		
        //js.executeScript("arguments[0].scrollIntoView();", Element);
        dr.findElement(By.xpath("/html/body/div[5]/div[3]/div[1]/div[11]/div/div[1]/div/a")).click();
        Thread.sleep(2000);
        dr.findElement(By.xpath(" /html/body/section[1]/div[2]/div/ul/li[1]/div[2]/div[2]/div[2]/a")).click();
        Thread.sleep(1000);
        dr.findElement(By.xpath(" //*[@id=\"btnPopupAccept\"]")).click();
       
        
        //dr.findElement(By.xpath("//*[@id=\"pop_2\"]")).click();
        
      
        
        
      
        
	}

}
