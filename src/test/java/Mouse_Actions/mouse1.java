package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse1 {
	public static void main(String[] args, Object WebElementmouse) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://www.mycontactform.com/");
		//1.click
        //2.double click
        //3.right click or context click
        //4.mouse hoverring
        //5.click hold and release
        //6.drag and drop
        //7.drag and drop by
        
        //create an object for action class
        //pass driver instance as input
		WebElement mouse=obj.findElement(By.className("highlighttab"));
		Actions click=new Actions(obj);
		click.click(mouse).build().perform();
		Thread.sleep(2000);
		click.release(mouse).build().perform();
		
	}

}
