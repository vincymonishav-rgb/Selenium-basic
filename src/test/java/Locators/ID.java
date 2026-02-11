package Locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://www.saucedemo.com/inventory.html");
		
		obj.manage().window().maximize();	
		obj.findElement(By.id("user-name")).sendKeys("standard_user");
		obj.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		obj.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		Alert pblm=obj.switchTo().alert();
		pblm.accept();
		obj.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	}
}
