package Getmethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://www.leafground.com/dashboard.xhtml");
		
		System.out.println(obj.getTitle());
		System.out.println(obj.getCurrentUrl());
		System.out.println(obj.manage().window().getSize());
		System.out.println(obj.manage().window().getPosition());
		
	}
}
