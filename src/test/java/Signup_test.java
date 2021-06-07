////Signup To _TODO test Case
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.remote.AndroidMobileCapabilityType;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//public class Signup_test {
////    @Test
////    public void signup_to_the_app() throws MalformedURLException {
////
////        DesiredCapabilities capability = new DesiredCapabilities();
////
////        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
////        capability.setCapability(MobileCapabilityType.VERSION, "8.1.0");
////        capability.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
////        capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.todoqacart.MainActivity");
////        capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.todoqacart");
////
////        String URL = "http://localhost:4723/wd/hub";
////
////        AppiumDriver driver = new AppiumDriver(new URL(URL), capability);
////
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        // ------------------- Signing Up Process -------------
//        // Click Signup Button
//        MobileElement signupButton = (MobileElement) driver.findElementByAccessibilityId("signupButton");
//        signupButton.click();
//
//        // Filling up the Full name
//        MobileElement fullNameInput = (MobileElement) driver.findElementByAccessibilityId("signupFullName");
//        fullNameInput.click();
//        fullNameInput.sendKeys("ABCD EFGHIJ");
//
//        // Clicking Email Input box and type an email
//        MobileElement signup_email = (MobileElement) driver.findElementByAccessibilityId("signupEmailAddress");
//        signup_email.click();
//        signup_email.sendKeys("abcdefg3@efghij.com");
//
//        // Clicking password Input box and type the password
//        MobileElement desiredPwd = (MobileElement) driver.findElementByAccessibilityId("signupPassword");
//        desiredPwd.click();
//        desiredPwd.sendKeys("abcdefghij");
//
//        // Click Signup Button @signup screen
//        MobileElement signup_signupButton = (MobileElement) driver.findElementByAccessibilityId("signup_signupButton");
//        signup_signupButton.click();
//        signup_signupButton.click();
//
////        //Expected Result - There message "Logout " must be present after clicking Login
////        MobileElement logout_button = (MobileElement) driver.findElementByAccessibilityId("logoutButton");
////        logout_button.click();
//
//
//
//    }
//}
