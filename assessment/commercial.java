package compre.assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class commercial {







	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindtreedec243\\Desktop\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.get("https://www.nobroker.in/");
			
				WebDriverWait wait = new WebDriverWait(driver,30);
				 driver.findElement(By.xpath("(//div[@class='nb__17yFj'])[2]")).click();
				//here we are selecting the major city
				
				 driver.findElement(By.xpath("//div[@id='searchCity']")).click();
				 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 Actions a=new Actions(driver);
				 for(;;) {
					 a.sendKeys(Keys.ENTER).perform();
					 String name1=driver.findElement(By.xpath("//div[@class='css-dvua67-singleValue nb-select__single-value']")).getText();
					//System.out.println(name1);
					if(name1.equals("Bangalore"))
					{
						break;
					}
					 driver.findElement(By.xpath("//div[@id='searchCity']")).click();
					 a.sendKeys(Keys.DOWN).perform();
				 }
				
				 driver.findElement(By.xpath("//div[@controlid='listPageSearchLocality']")).click();
				 driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys("kormangla");
				  Thread.sleep(3000);
				 driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys(Keys.ARROW_DOWN);
				 driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys(Keys.ENTER);
				 
				 driver.findElement(By.xpath("//label[@for='COMMERCIAL_RENT']")).click();
					
				 
				 driver.findElement(By.xpath("(//div[@id='searchCity'])[2]")).click();
				 a.sendKeys(Keys.DOWN).perform();
				 a.sendKeys(Keys.ENTER).perform();
				 a.sendKeys(Keys.DOWN).perform();
				 a.sendKeys(Keys.ENTER).perform();
				 driver.findElement(By.xpath("(//div[@id='searchCity'])[2]")).click();
				 
				 driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();
				 //driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();
				 driver.findElement(By.xpath("//div[@class='p-1.5p pl-0 flex tp:p-0 tp:h-auto nb__MCj8k']")).click();
	
	}

}