package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingtableassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.xpath("//table[@id='product']/tbody"));
		int rowcount = table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();//it helps to find out entire rows count
		System.out.println(rowcount);
		int colcount=table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		System.out.println(colcount);
		for(int i =0;i<rowcount;i++){
			System.out.println(table.findElements(By.xpath("//table[@id='product']/tbody/tr")).get(i).getText());
		}
		
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

       System.out.println(secondrow.get(0).getText());
       System.out.println(secondrow.get(1).getText());

	   System.out.println(secondrow.get(2).getText());
		

	}

}
