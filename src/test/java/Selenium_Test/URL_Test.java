package Selenium_Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://www.leafground.com/dashboard.xhtml");
		obj.manage().window().maximize();
		int i=3;
		for(i=0;i<4;i++) {
		obj.navigate().refresh();
		}
		Thread.sleep(2000);
		//obj.close();
		
	
	}

}
