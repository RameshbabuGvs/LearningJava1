package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Click Button to see alert ']//following::button[1]")).click();
		Thread.sleep(90);
		driver.switchTo().alert().accept();	
		Thread.sleep(90);
	
		driver.findElement(By.xpath("//span[text()='On button click, confirm box will appear']//following::button[1]")).click();
		Thread.sleep(150);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(60);
		driver.findElement(By.xpath("//span[text()='On button click, prompt box will appear']//following::button[1]")).click();
		Thread.sleep(60);
		
		Thread.sleep(60);
		driver.switchTo().alert().sendKeys("Ramesh");
		Thread.sleep(60);
		System.out.println(driver.switchTo().alert().getText());
		String str=driver.switchTo().alert().getText();
		System.out.println(str);
		Thread.sleep(60);
		
		
		
	}

}
