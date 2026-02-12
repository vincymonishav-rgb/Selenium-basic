package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://demo.automationtesting.in/Register.html");
		
		obj.manage().window().maximize();
		obj.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
		obj.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(4000);
		obj.navigate().back();
		Thread.sleep(4000);
		obj.navigate().forward();
		Thread.sleep(4000);
		obj.close();
		}
}
