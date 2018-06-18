import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CustomerTest {

	@Test
	public void createUser()
	{
		System.out.println("created user");
	}
	
	@Test
	public void modifyUser()
	{
		System.out.println("modify user");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("deleted user");
	}

	
	@Test
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http:facebook.com");
	}
}

