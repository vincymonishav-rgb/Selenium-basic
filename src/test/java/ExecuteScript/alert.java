package ExecuteScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://www.leafground.com/dashboard.xhtml");
		
		obj.executeScript("alert('time out')");
		Thread.sleep(4000);
		Alert pblm=obj.switchTo().alert();
		pblm.accept();
		//pblm.dismiss();
		Thread.sleep(4000);
		obj.close();
		
	}

}
