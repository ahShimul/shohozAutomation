import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.net.URL;
import java.util.List;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class UserAutomation {
	AndroidDriver driver;

	 @Test
	 public void setUp() throws Exception {

	//location of the app
	
	 
	 //To create an object of Desired Capabilities
	 DesiredCapabilities capability = new DesiredCapabilities();
	
	
	
	//To Setup the device name
	 capability.setCapability("deviceName","Mi5");
	 capability.setCapability("platformName","Android");
	 capability.setCapability("uuid","640bee1a");
	//set the package name of the app
	 capability.setCapability("appPackage", "com.shohoz.rides");
	 //set the Launcher activity name of the app
	 capability.setCapability("appActivity", "com.shohoz.rides.activities.splash.SplashActivity");
	//driver object with new Url and Capabilities
	 driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capability);
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.android.packageinstaller:id/permission_allow_button")));
	 driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.android.packageinstaller:id/permission_allow_button")));
	 driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/button_english")));
	 driver.findElement(By.id("com.shohoz.rides:id/button_english")).click();
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/mobile_no")));
	 driver.findElement(By.id("com.shohoz.rides:id/mobile_no")).sendKeys("01700088800");
	 driver.findElement(By.id("com.shohoz.rides:id/button_next")).click();
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/password")));
	 driver.findElement(By.id("com.shohoz.rides:id/password")).sendKeys("123456");
	 driver.findElement(By.id("com.shohoz.rides:id/button_next")).click();
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/imageView_food_switch")));
	 
	 driver.findElement(By.id("com.shohoz.rides:id/imageView_food_switch")).click();
	 
	// if(driver.findElement(By.id("com.shohoz.rides:id/navMenu"))==null)
	//	 driver.findElement(By.id("com.shohoz.rides:id/imageView_food_switch")).click();
	 
	// wait.until(ExpectedConditions.elementToBeClickable(By
	 //        .id("com.shohoz.rides:id/swipe_layout")));
	 
	// driver.findElement(By.id("com.shohoz.rides:id/navMenu")).click();
	 
	 
	// wait.until(ExpectedConditions.elementToBeClickable(By
	 //        .id("com.shohoz.rides:id/img_profile")));
	 
	// driver.findElement(By.id("com.shohoz.rides:id/img_profile")).click();
	 
	// Thread.sleep(2000);
	// driver.navigate().back();
	// driver.navigate().back();
	// driver.navigate().back();
	 
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/textView_delivery_address")));
	 
	 driver.findElement(By.id("com.shohoz.rides:id/textView_delivery_address")).click();
	 
	 Thread.sleep(5000);
	 //wait.until(ExpectedConditions.elementToBeClickable(By.className("android.view.View")));
	 	 
	 TouchAction ta = new TouchAction(driver);
     ta.press(PointOption.point(360, 640)).moveTo(PointOption.point(380,700)).release().perform();
     
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/button_set_location")));
     driver.findElement(By.id("com.shohoz.rides:id/button_set_location")).click();
     
     Thread.sleep(5000);
     
     //TouchAction t = new TouchAction(driver);
     //t.press(PointOption.point(360, 1200)).moveTo(PointOption.point(360,600)).release().perform();
     MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.shohoz.rides:id/swipe_layout\")).scrollIntoView("
				+ "new UiSelector().textContains(\"Rice\"))"));
  		 
     element.click();		
     
    
	  
  
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='com.shohoz.rides:id/textView_categoryName' and contains(@text,'Tehari')]")));
    
	 driver.quit();
	 }

}