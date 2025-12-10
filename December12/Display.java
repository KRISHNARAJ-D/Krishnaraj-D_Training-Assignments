package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Display {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Laptop",Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[8]"));
	  System.out.println(driver.getTitle());
	  driver.navigate().back();
	  driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("TV",Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[14]"));
	  System.out.println(driver.getTitle());
	  driver.navigate().back();
	  driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Smart Phone",Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]"));
	  System.out.println(driver.getTitle());
	  driver.navigate().back();
	

  }
}
