package Navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		
		obj.manage().window().maximize();
		obj.executeScript("window open('https://www.letskodeit.com/practice')");

}
}