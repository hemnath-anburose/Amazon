package configClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GLobalLibrary {
	
	public static WebDriver driver;
	public  void Browser(String brownerName, String url) {
		if(brownerName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (brownerName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Now we can automate only on FireFox and Chrome, so please choose the browser from the both");
		}
		driver.get(url);
	}
	
	public void maxWindow() {
		driver.manage().window().maximize();
	}
	public void ImpWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public void switchWindow() {
		Set<String> winIdsRaw = new HashSet<String>();
		winIdsRaw = driver.getWindowHandles();
		ArrayList<String> WinKeys = new ArrayList<String>(winIdsRaw);
		driver.switchTo().window(WinKeys.get(1));
	}
		
	public static void selectDD(WebElement element, String text) {
		Select dd = new Select(element);
		dd.selectByValue(text);
	}
	
}
