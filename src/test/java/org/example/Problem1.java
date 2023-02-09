package org.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
public class Problem1 {
public AndroidDriver driver;
@BeforeClass
public void configureAppium() throws MalformedURLException {
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("SaiPhone");
	options.setApp("C:\\Users\\SKASILAN\\eclipse\\java-2022-09\\eclipse\\AppiumStore\\src\\test\\java\\resources\\General-Store.apk");
	options.setPlatformName("Android");
//creating a object of android driver
 
driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test
public void Fillform() {
	 driver.findElement(By.id("android:id/text1")).click();
	 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
	 driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
	 driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ramya");
	 driver.hideKeyboard();
	 driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
	 driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
}

@AfterClass
public void tearDown() {
	driver.quit();
}
}