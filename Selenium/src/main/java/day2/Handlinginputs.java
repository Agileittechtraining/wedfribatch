package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinginputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium Installations\\chromedriver.exe");
ChromeDriver c = new ChromeDriver();
c.get("https://www.facebook.com/");
c.findElement(By.name("email")).sendKeys("12345");
c.findElement(By.id("pass")).sendKeys("p@ssword");
//c.close();
	}

}
