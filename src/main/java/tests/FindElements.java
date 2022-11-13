package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
        System.out.println("HI");
	}

}
