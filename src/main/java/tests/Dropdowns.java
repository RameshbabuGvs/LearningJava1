package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		Thread.sleep(5);
		//Actions actions = new Actions(driver);
		

		driver.navigate().to("https://aprtacitizen.epragathi.org/#!/availableslots");
		 Thread.sleep(3);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		
		Select SelectType = new Select(driver.findElement(By.xpath("//select[@name='serviceType']")));
		
		SelectType.selectByVisibleText("LLR");
		
		//click
		//driver.findElement(By.xpath("(//label[@class='ng-binding'])[1]//following::input[@placeholder='DD-MM-YYYY']")).click();
		//clear
		
		//driver.findElement(By.xpath("(//label[@class='ng-binding'])[1]//following::input[@placeholder='DD-MM-YYYY']")).clear();
		//sent to data
		//driver.findElement(By.xpath("(//label[@class='ng-binding'])[1]//following::input[@placeholder='DD-MM-YYYY']")).sendKeys("01-12-2021");
		
		
		

	}

}
