package common;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiBrowser {

	public WebDriver driver;

	@Test

	// Here this parameters we will take from testng.xml
	@Parameters("Browser")
	public void test1(String browser) {

		if (browser.equalsIgnoreCase("FF")) {

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver", "./IEDriverServer/IEDriverServer.exe");

			driver = new InternetExplorerDriver();

		} else if (browser.equalsIgnoreCase("CH")) {

			System.setProperty("webdriver.ie.driver", "./CHDriver/chromedriver.exe");

			driver = new ChromeDriver();

		}
	}

}
