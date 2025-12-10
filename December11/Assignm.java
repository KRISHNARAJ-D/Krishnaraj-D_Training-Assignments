package seleniumprogram;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Assignm {
	@Test
	public static void main(String[] args)
	{
		
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service",false);
		prefs.put("profile.password_manager_leak_detection",false);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.).click();
		driver.findElement(By.name("radioButton")).click();
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
		//driver.quit();
			
	}

}
