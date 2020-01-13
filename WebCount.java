import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCount {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "c:/Users/admin/downloads//chromedriver_win32//chromedriver.exe"); 
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("https://demo.opencart.com/index.php?route=product/category&amp;path=33");
		System.out.println("camera");
		List<WebElement> links = ObjDriver.findElements(By.tagName("a"));
		System.out.println("Number of camera"+ links.size());
		for(WebElement ele : links)
		{
			System.out.println(ele.getAttribute("href"));
		}
		ObjDriver.close();
	}
	
}