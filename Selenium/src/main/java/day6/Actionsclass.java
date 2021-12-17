package day6;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.snapdeal.com/");
		c.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement computer = c.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[4]/a/span[2]"));
	    Actions a = new Actions(c);
	    a.moveToElement(computer).build().perform();
	    WebElement computeraccessories = c.findElement(By.xpath("//*[@id=\"category4Data\"]/div[2]/div/div/p[9]/a/span"));
	    a.moveToElement(computeraccessories).click().build().perform();
	    WebElement leftslider = c.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[1]"));
	    WebDriverWait wait = new WebDriverWait(c,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(leftslider));
	    a.dragAndDropBy(leftslider, 100, 0).build().perform();
	    
	    
	}

}
