package org.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	public static AndroidDriver driver;
	@BeforeClass
	public void configureAppium() throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("SaiPhone");
		options.setApp("C:\\Users\\SKASILAN\\eclipse\\java-2022-09\\eclipse\\AppiumStore\\src\\test\\java\\resources\\General-Store.apk");
		options.setPlatformName("Android");
		//creating a object of android driver
		 driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
}
