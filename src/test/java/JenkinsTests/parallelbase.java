package JenkinsTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.AppConstants;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import java.net.URL;

public class parallelbase {
	protected WebDriver driver;

	protected String browser;

	@BeforeMethod
	public void setUp() throws Exception {

		browser = AppConstants.browserName;

		if (browser.equalsIgnoreCase("chrome")) {

			if (AppConstants.platform.equalsIgnoreCase("local")) {
			
				driver = new ChromeDriver();
				
			} else if (AppConstants.platform.equalsIgnoreCase("remote")) {

				URL gridUrl = new URL("http://localhost:4444/wd/hub");

				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setBrowserName("chrome");
				driver = new RemoteWebDriver(gridUrl, capabilities);
			}
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
