import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneWeb {

	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.chrome.driver", "c:/Users/admin/downloads//chromedriver_win32//chromedriver.exe"); 
	   WebDriver ObjDriver = new ChromeDriver();
	   ObjDriver.get("http://demo.opencart.com");
	   System.out.println("Open cart page loaded");
	   String var1 = ObjDriver.getTitle();
	   System.out.println("Title of the Page"+var1);
	   WebElement Obj1 = ObjDriver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=account/account']"));
	   Obj1.click();
	   WebElement Obj2 = ObjDriver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a"));
	   Obj2.click();
	   WebElement Obj3 = ObjDriver.findElement(By.xpath("//*[@id='input-email']"));
	   Obj3.sendKeys("Obama@trump.com");
	   WebElement Obj4 = ObjDriver.findElement(By.xpath("//*[@id='input-password']"));
	   Obj4.sendKeys("obama@123");
	   WebElement Obj5 = ObjDriver.findElement(By.xpath("//html/body/footer/div/div/div[4]/ul/li[a]"));
	   Obj5.click();
	}

}
