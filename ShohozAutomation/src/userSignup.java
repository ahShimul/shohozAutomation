import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;


public class userSignup {

	static AndroidDriver driver;

	 
	 public static void main(String[] args) throws Exception {

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
	 driver.findElement(By.id("com.shohoz.rides:id/mobile_no")).sendKeys("01991919194");
	 driver.findElement(By.id("com.shohoz.rides:id/button_next")).click();
	 
	
	 
	 try {
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/ed_otp")));
	 driver.findElement(By.id("com.shohoz.rides:id/ed_otp")).sendKeys("987650");
	 driver.findElement(By.id("com.shohoz.rides:id/button_verify_phone_number")).click();
	 
	 
	 }catch(Exception e) {
		 
		 System.out.println("No need for OTP");
		 
		 
	 }
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/phone")));
	 driver.findElement(By.id("com.shohoz.rides:id/phone")).sendKeys("qwertyabcd@gmail.com");
	 driver.findElement(By.id("com.shohoz.rides:id/first_name")).sendKeys("Gal");
	 driver.findElement(By.id("com.shohoz.rides:id/last_name")).sendKeys("Gadut");
	 driver.findElement(By.id("com.shohoz.rides:id/radioButton_female")).click();
	 driver.findElement(By.id("com.shohoz.rides:id/password")).sendKeys("123456");
	 
	 
	 WebElement abc = driver.findElement(By.id("com.shohoz.rides:id/action_bar_root"));

	

	    Dimension size = driver.manage().window().getSize();
		  System.out.println(size);
		  int starty = (int) (size.height * 0.50);
		  int endy = (int) (size.height * 0.20);
		  int startx = size.width / 2;
		  System.out.println("Start swipe operation");
		  driver.swipe(startx, starty, startx, endy, 1000);
	    
	    driver.findElement(By.id("com.shohoz.rides:id/confirmPassword")).sendKeys("123456");
	    
	    

	 driver.findElement(By.id("com.shohoz.rides:id/spinner_city")).click();
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("android:id/text1")));
	 
	 MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"android:id/text1\")).scrollIntoView("
				+ "new UiSelector().textContains(\"Dhaka\"))"));
		 
     element.click();
	 driver.findElement(By.id("com.shohoz.rides:id/button_next")).click();	
	
	 }

	 
}