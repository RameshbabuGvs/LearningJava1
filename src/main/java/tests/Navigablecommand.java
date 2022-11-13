package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigablecommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.google.com/");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		Thread.sleep(90);
		
		driver.navigate().back();
		Thread.sleep(90);
		driver.navigate().forward();
		
		Thread.sleep(200);
	}

}
