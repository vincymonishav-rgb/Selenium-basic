package Mouse_Actions;

import org.openqa.selenium.chrome.ChromeDriver;

public class mouse1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vincy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver obj= new ChromeDriver();
		obj.get("https://www.leafground.com/dashboard.xhtml");
		//1.click
        //2.double click
        //3.right click or context click
        //4.mouse hoverring
        //5.click hold and release
        //6.drag and drop
        //7.drag and drop by
        
        //create an object for action class
        //pass driver instance as input
	}

}
