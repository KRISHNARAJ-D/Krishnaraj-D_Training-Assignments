package seleniumprogram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Rediff{
	@Test
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Money")).click();
		//driver.findElement(By.linkText("Mutual Funds")).click();
		driver.findElement(By.partialLinkText("Mutual")).click();
		driver.quit();
	}

}
