package googlesearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// To open the chrome browser
		WebDriver driver  = new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		
		// To enter into the url and wait
		driver.get("https://www.google.com/");
		
		// To wait till all element should load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// To fetch the title of current page
		String title = driver.getTitle();
		
		
		if(title.equals("Google")) {
		
		//To find the search text field
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("search value");
		
		//To click search button
		WebElement search = driver.findElement(By.name("btnK"));
		search.click();
		
		System.out.println("Pass: Google search");
		
		} else {
			
			System.out.println("Fail: Google page");
		}
		
		//To close the browser
		driver.close();

	}

}
