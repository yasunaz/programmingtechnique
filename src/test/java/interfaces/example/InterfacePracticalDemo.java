package interfaces.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.Location;

public class InterfacePracticalDemo {

	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new NijatDriver();
		driver.get("https://www.trello.com/");
		

	}

}
