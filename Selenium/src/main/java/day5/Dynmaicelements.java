package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynmaicelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://register.rediff.com/register/register.php?FormName=user_details");
		c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Hello hi");
	    
	}

}
