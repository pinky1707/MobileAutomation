package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class AppiumTest {
	@Test
	public void appiumTestWithBrowser() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platrformVersion", "11");
		// capabilities.setPlatform(Platform.ANDROID);
		// capabilities.setVersion("11");
		capabilities.setBrowserName("Chrome");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, capabilities);
		driver.get("https://www.amazon.com/");
	}

}
