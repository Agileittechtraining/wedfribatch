package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
System.setProperty("webdriver.gecko.driver",  "C:\\Selenium Installations\\geckodriver.exe");
System.setProperty("webdriver.edge.driver",  "C:\\Selenium Installations\\msedgedriver.exe");
ChromeDriver c  = new ChromeDriver();
c.get("https://www.facebook.com/");
WebDriver f = new FirefoxDriver();
f.get("https://www.facebook.com/");
EdgeDriver e = new EdgeDriver();
e.navigate().to("https://www.facebook.com/");
	
	}

}
