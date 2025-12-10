package seleniumprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class OnlineGdb {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.onlinegdb.com/");
	  List<WebElement> anchor = driver.findElements(By.tagName("a"));
	  System.out.println("Total no of Anchors: "+anchor.size());
	  for(WebElement link: anchor)
	  {
		  String url =link.getAttribute("href");
		  System.out.println(url);
	  }
	  
  }
}
