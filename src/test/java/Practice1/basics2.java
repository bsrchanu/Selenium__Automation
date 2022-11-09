package Practice1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics2 {
	
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		//implicit wait - 2 seconds time out
       
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003MWK744\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://google.com");
		 driver.manage().window().maximize();
		 //sendKeys("doctors near me");
 WebElement m=driver.findElement(By.xpath("//input[@title='Search']"));
 m.sendKeys("doctors near me");
 m.sendKeys(Keys.ENTER);
 List<WebElement> options=driver.findElements(By.tagName("h3"));
 System.out.println(options.size());
 int a=options.size();
 int b = (int) (Math.random() * a); 
 System.out.println("random"+b);
 
 for(int i=0;i<=options.size();i++) {
	System.out.println(options.get(i).getText()+" " + i);
	 if(i==b) {
		 System.out.println(options.get(i).getText()+ " success");
			JavascriptExecutor j = (JavascriptExecutor)driver;
	     	j.executeScript("window.scrollBy(0,1000)");
		 driver.findElements(By.tagName("h3")).get(i).click();
	 }
 }
 
 
		//driver.get("doctors near me");
		
		Thread.sleep(3000);
		

/*		 driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		driver.findElement(By.name("inputPassword")).sendKeys("hello123");

		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);//

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
  
  */
		driver.quit();
		}



}
