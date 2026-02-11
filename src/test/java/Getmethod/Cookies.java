package Getmethod;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://www.leafground.com/dashboard.xhtml");
		
		Set<Cookie> S=obj.manage().getCookies();
		System.out.println("No of Cookies:"+S.size());
		obj.manage().deleteAllCookies();
		Set<Cookie> S1=obj.manage().getCookies();
		System.out.println("After deleted cookies:"+S1.size());
		
	}
}
