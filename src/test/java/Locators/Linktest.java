package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		
		
	//link Test
		//obj.findElement(By.linkText("Music")).click();
		
	//PartialLink Test
		//obj.findElement(By.partialLinkText("Imag")).click();
		
		//css path
		//obj.findElement(By.cssSelector("#header > nav > div > div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(1) > a")).click();
	
	//Xpath
		obj.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[7]/a")).click();
	
	}
}
