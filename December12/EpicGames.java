package seleniumprogram;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EpicGames {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name (Chrome / Edge / Firefox): ");
        String browser = sc.nextLine();
        WebDriver driver = null;
        if(browser.equalsIgnoreCase("chrome"))
        {
        	driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("edge"))
        {
        	driver = new EdgeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
        	driver = new FirefoxDriver();
        }
        else
        {
        	System.out.println("Invalid Browser");
        }
        driver.manage().window().maximize();
        driver.get("https://store.epicgames.com/en-US");
        System.out.print("The title for the website is: "+driver.getTitle());
        driver.quit();
		

	}

}
