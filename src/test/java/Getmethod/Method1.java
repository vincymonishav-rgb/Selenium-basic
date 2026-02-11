package Getmethod;



import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://www.leafground.com/dashboard.xhtml");
		Thread.sleep(3000);
		Point pt=new Point(100,1700);
		obj.manage().window().setPosition(pt);

}
}