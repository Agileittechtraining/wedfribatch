package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingalerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Installations\\geckodriver.exe");
		FirefoxDriver c = new FirefoxDriver();
		c.get("https://echoecho.com/javascript4.htm");
		c.findElement(By.name("B3")).click();
		System.out.println(c.switchTo().alert().getText());
		c.switchTo().alert().sendKeys("Hello");
		c.switchTo().alert().dismiss();
	}

}
