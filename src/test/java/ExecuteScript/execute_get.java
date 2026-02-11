package ExecuteScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class execute_get {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://www.leafground.com/dashboard.xhtml");
		
		System.out.println(obj.executeScript("return document.title"));
		System.out.println(obj.executeScript("return document.URL"));
	}

}
