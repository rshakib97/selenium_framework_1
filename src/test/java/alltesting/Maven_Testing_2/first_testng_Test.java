package alltesting.Maven_Testing_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class first_testng_Test {

	
	
	@Test
	public void day1() {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\13472\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com");
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
	}
}
