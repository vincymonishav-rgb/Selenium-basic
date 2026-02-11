package ExecuteScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://www.leafground.com/dashboard.xhtml");
		
		obj.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		obj.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
	}

}
