import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class menuAutomation {

	static AndroidDriver<WebElement> driver;

	 
	 public static void main(String[] args) throws Exception {

	//location of the app
	
	 
	 //To create an object of Desired Capabilities
	 DesiredCapabilities capability = new DesiredCapabilities();
	
	
	
	//To Setup the device name
	 capability.setCapability("deviceName","GR5");
	 capability.setCapability("platformName","Android");
	 capability.setCapability("uuid","84RDU17715000961");
	//set the package name of the app
	 capability.setCapability("appPackage", "com.shohoz.rides");
	 //set the Launcher activity name of the app
	 capability.setCapability("appActivity", "com.shohoz.rides.activities.splash.SplashActivity");
	//driver object with new Url and Capabilities
	 driver= new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capability);
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 
	 
	 try {
		 Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By
		         .id("com.android.packageinstaller:id/permission_allow_button")));
		 driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By
		         .id("com.android.packageinstaller:id/permission_allow_button")));
		 driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	} catch (Exception e1) {
		System.out.println("No need for allow");
	}
	 
	 
	 
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
	 
	 try {
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/ed_otp")));
	 driver.findElement(By.id("com.shohoz.rides:id/ed_otp")).sendKeys("987650");
	 driver.findElement(By.id("com.shohoz.rides:id/btnVarifyPhone")).click();
	 
	 
	 }catch(Exception e) {
		 
		 System.out.println("No need for OTP");
		 
		 
	 }
	 
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/imageView_food_switch")));
	 
	 driver.findElement(By.id("com.shohoz.rides:id/imageView_food_switch")).click();
	 	
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/textView_average_delivery_time")));
	 
	 driver.findElement(By.id("com.shohoz.rides:id/navMenu")).click();
	 
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/img_profile")));
	 
	 driver.findElement(By.id("com.shohoz.rides:id/img_profile")).click();
	 
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/img_profile")));
	 
	
     wait.until(ExpectedConditions.elementToBeClickable(By
	         .id("com.shohoz.rides:id/first_name")));
	 driver.findElement(By.id("com.shohoz.rides:id/first_name")).sendKeys("Test");
	 
	 
	driver.navigate().back();
	    
		 wait.until(ExpectedConditions.elementToBeClickable(By
		         .id("com.shohoz.rides:id/saveBTN")));
		 
		 driver.findElement(By.id("com.shohoz.rides:id/saveBTN")).click();
	    
	 
	
		 wait.until(ExpectedConditions.elementToBeClickable(By
		         .id("com.shohoz.rides:id/textView_average_delivery_time")));
		 
		 driver.findElement(By.id("com.shohoz.rides:id/navMenu")).click();
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By
		         .id("com.shohoz.rides:id/design_menu_item_text")));
		 driver.findElement(By.id("com.shohoz.rides:id/design_menu_item_text")).click();
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By
		         .id("com.shohoz.rides:id/linear_date_month")));
		 driver.findElement(By.xpath("//*[contains(@text,'Order ID - SF30286519')]")).click();
		 driver.navigate().back();
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By
		         .id("com.shohoz.rides:id/textView_average_delivery_time")));
		 
		 driver.findElement(By.id("com.shohoz.rides:id/navMenu")).click();
		 
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By
		         .id("com.shohoz.rides:id/design_menu_item_text")));
		 
		 driver.findElement(By.xpath("//*[contains(@text,'Coupons')]")).click();
		 
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By
		         .xpath("//*[@id='textview_apply_promo']")));
		 
		 driver.findElement(By.xpath("//*[@id='textview_apply_promo']")).click();
		 
		 
	 
	 }
	
}
