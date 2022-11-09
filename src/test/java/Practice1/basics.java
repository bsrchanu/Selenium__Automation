package Practice1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics {
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003MWK744\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

	//	driver.get("https://rahulshettyacademy.com");

		//System.out.println(driver.getTitle());

		//System.out.println(driver.getCurrentUrl());

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		      driver.get("http://www.flipkart.com/");
		      driver.findElement(By.name("q")).sendKeys("mobile");
		      Thread.sleep(5000);
		      String xp="//ul/li//a[contains(text(),'mobile')]";
		      List<WebElement> allMobiles = driver.findElements(By.xpath(xp));
		      for(WebElement mobile:allMobiles)
		      {
		         System.out.println(mobile.getText());
		      }
		      driver.quit();
		   }
		

		


	
	
}
