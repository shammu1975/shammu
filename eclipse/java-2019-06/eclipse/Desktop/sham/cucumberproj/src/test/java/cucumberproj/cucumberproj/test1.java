package cucumberproj.cucumberproj;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test1 {
	public static WebDriver configurewebdriver(String browserName) {
		WebDriver driver= null;
		if(browserName.contentEquals("explorer")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\s.d.narasimhamurthy\\Downloads\\drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\s.d.narasimhamurthy\\Downloads\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("gecko")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\s.d.narasimhamurthy\\Downloads\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
	}
		return driver;
	}
}

