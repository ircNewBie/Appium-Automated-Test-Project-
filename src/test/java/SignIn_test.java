//Signin to _TODO test Case

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.temporal.ValueRange;
import java.util.concurrent.TimeUnit;



public class SignIn_test {

    @Test
    public void sign_in_to_the_app() throws MalformedURLException {

        DesiredCapabilities capability = new DesiredCapabilities();

        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capability.setCapability(MobileCapabilityType.VERSION, "8.1.0");
        capability.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.todoqacart.MainActivity");
        capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.todoqacart");

        String URL = "http://localhost:4723/wd/hub";

        AppiumDriver driver = new AppiumDriver(new URL(URL), capability);
//        AppiumDriver driver = new AppiumDriver(new URL(URL), capability);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       // Clicking Email Input box and type an email
       MobileElement log_in_email = (MobileElement) driver.findElementByAccessibilityId("loginEmail");
       log_in_email.click();
       log_in_email.sendKeys("bbungalan@gmail.com");

        // Clicking Email Input box and type the password
        MobileElement login_pwd = (MobileElement) driver.findElementByAccessibilityId("loginPassword");
        login_pwd.click();
        login_pwd.sendKeys("123456");

        // Click Login Button
        MobileElement login_button = (MobileElement) driver.findElementByAccessibilityId("loginButton");
        login_button.click();

        //Expected Result - There  "Logout " button must be Visible
        MobileElement logout_button = (MobileElement) driver.findElementByAccessibilityId("task_screenlogoutButton");
        boolean login_button_visible = logout_button.isDisplayed();

        Assert.assertTrue(login_button_visible);
        // Logout
        logout_button.click();
    }


}

