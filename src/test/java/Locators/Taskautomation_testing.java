package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskautomation_testing {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		
		obj.manage().window().maximize();
		WebElement firstname=obj.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		firstname.sendKeys("vincy");
		obj.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("V");
		obj.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Marthandam,629165,kkdist");
		obj.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("vincymonishav@gmail.com");
		obj.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("978967619");
		
		obj.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		obj.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("Vincy&123");
		obj.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("Vincy&123");
		
	}

}
