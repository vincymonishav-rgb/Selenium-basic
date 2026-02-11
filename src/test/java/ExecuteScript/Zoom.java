package ExecuteScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class Zoom {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://www.leafground.com/dashboard.xhtml");
		
		obj.executeScript("document.body.style.zoom='150%'");
		Thread.sleep(3000);
		obj.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(3000);
		obj.executeScript("document.body.style.zoom='50%'");
		
		Thread.sleep(4000);
		obj.close();
	}

}
