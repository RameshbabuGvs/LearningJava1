package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		   driver.navigate().to("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705384516477&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e");
		   
		Actions actions = new Actions(driver);
		//driver.findElement(By.xpath("//a[text()='Search Birth Records']")).click();
		// Enter the Current Address
        WebElement Firstname=driver.findElement(By.xpath("//input[@name='field-keywords']"));
        Firstname.sendKeys("Puma");
       actions.sendKeys(Keys.ARROW_DOWN);
      actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
       
		
        
        
        
		

	}

}
