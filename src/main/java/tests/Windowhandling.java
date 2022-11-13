package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		System.out.println("Before switching");
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		//iterrator helps the iterates the windows count
		Iterator<String> it = ids.iterator();
		//Parent id
		String parentid = it.next();
// I want to move the child window 
		String childid = it.next();
		
		//now i am sucessfully move parent to child
		driver.switchTo().window(childid);
		Thread.sleep(20);
		System.out.println(driver.getTitle());
		
		String Subchildid=it.next();
		Thread.sleep(30);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.switchTo().window(Subchildid);
		System.out.println("Sucessfully switched 3rdwindow");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		
		
	}

}
