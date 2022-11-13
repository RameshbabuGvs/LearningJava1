package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class ChromeArguments {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
 driver.navigate().to("https://www.browserstack.com/guide/maximize-chrome-window-in-selenium");
		
		
		
	}

}
