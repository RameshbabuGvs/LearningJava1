package tests;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class WebtablesortingusingjavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdiver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();

		
		//First we design Algorithm how to solve this
		//Click on Coloumn
		
		driver.findElement(By.xpath("//tr//th[1]")).click();
		//Capture all Webelements into a list
		
		List<WebElement> elementsList=driver.findElements(By.xpath("//tr/td[1]"));
		System.out.println(elementsList);
		//Capture text of all webelements into a new(Original) list
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		System.out.println(originalList);
		//sort on the list of step3--->Sortedlist 
		
		List<String>sortedList=originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		//Compare Orginal list vs sorted list
		
        Assert.assertEquals(originalList,sortedList);
		
		
		

	}

}
