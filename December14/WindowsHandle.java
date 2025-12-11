package testngnew;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandle {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  String ParentWindow = driver.getWindowHandle();
	  driver.findElement(By.id("openwindow")).click();
	  //newwindow
	  Set<String> allwindows = driver.getWindowHandles();
	  for(String src : allwindows)
	  {
		  if(!src.equals(ParentWindow))
		  {
			  driver.switchTo().window(src);
		  }
	  }
	  
	  
	  System.out.println(driver.findElement(By.xpath("//*[@id=\"header-part\"]/div[2]/div/div/div[2]/div/div[1]/div[2]/span")).getText());
	  driver.close();
	  driver.switchTo().window(ParentWindow);
	  
	  //newtab
	  driver.findElement(By.id("opentab")).click();
	  Set<String> allwindows1 = driver.getWindowHandles();
	  for(String src : allwindows1)
	  {
		  if(!src.equals(ParentWindow))
		  {
			  driver.switchTo().window(src);
		  }
	  }
	  System.out.println(driver.findElement(By.xpath("//a[text()='Access all our Courses']")).getText());
	  driver.quit();
	  
	  
	  
	  
  }
}
