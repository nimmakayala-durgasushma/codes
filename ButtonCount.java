import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonCount 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "c:/Users/admin/downloads//chromedriver_win32//chromedriver.exe"); 
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("http://demo.automationtesting.in/Register.html");
		WebElement check_buttons= ObjDriver.findElement(By.xpath("//*[@id='checkbox2']"));
		check_buttons.click();
		boolean status = check_buttons.isDisplayed();
		System.out.println("check button is displayed"+status);
		boolean enabled_status = check_buttons.isEnabled();
		System.out.println("check button is enabled"+enabled_status);
		/*boolean selected_status = check_buttons.isSelected();
		System.out.println("check button is selected"+selected_status);
		check_buttons.click();
		boolean selected_status_new = check_buttons.isSelected();
		System.out.println("check button is selected"+selected_status_new);
		boolean selected_status_new1 = check_buttons.isSelected();
		System.out.println("check button is selected"+selected_status_new1);
		boolean selected_status_new2 = check_buttons.isSelected();
		System.out.println("check button is selected"+selected_status_new2);*/
	}
}
