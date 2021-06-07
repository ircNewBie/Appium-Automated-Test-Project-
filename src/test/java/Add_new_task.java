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
//public class Add_new_task {
//
//    //    @BeforeTest
////    public void Do_SignUp_to_The_App() throws MalformedURLException {
////        // Click the Sign-up
////        MobileElement el1 = (MobileElement) driver.findElementByXPath(
////                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
////        el1.click();
////    }
////    @AfterTest
////
//    @Test
//    public void sign_in_to_the_app() throws MalformedURLException {
//
//        DesiredCapabilities capability = new DesiredCapabilities();
//
//        capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        capability.setCapability(MobileCapabilityType.VERSION, "8.1.0");
//        capability.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//        capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.todoqacart.MainActivity");
//        capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.todoqacart");
//
//        String URL = "http://localhost:4723/wd/hub";
//
//        AppiumDriver driver = new AppiumDriver(new URL(URL), capability);
//
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        // ----------------- LOGGING IN PROCESS (START) --------------------
//        //
//        // Clicking Email Input box and type an email
//        MobileElement log_in_email = (MobileElement) driver.findElementByAccessibilityId("loginEmail");
//        log_in_email.click();
//        log_in_email.sendKeys("bbungalan@gmail.com");
//
//        // Clicking Email Input box and type the password
//        MobileElement login_pwd = (MobileElement) driver.findElementByAccessibilityId("loginPassword");
//        login_pwd.click();
//        login_pwd.sendKeys("123456");
//
//        // Click Login Button
//        MobileElement login_button = (MobileElement) driver.findElementByAccessibilityId("loginButton");
//        login_button.click();
//        // ----------------- LOGGING IN PROCESS (END)  --------------------
//
//        // ----------------- ADDING NEW TASK  (BEGIN)  --------------------
//        // Clicking Add new Task Button @add new task screen
//        MobileElement taskScreen_AddTaskButton = (MobileElement) driver.findElementByAccessibilityId("addNewTaskButton");
//        taskScreen_AddTaskButton.click();
//
//        // Input text to the "Enter a new task" input box
//        MobileElement task_inputNewTaskText = (MobileElement) driver.findElementByAccessibilityId("inputNewTaskText");
//        task_inputNewTaskText.click();
//        task_inputNewTaskText.sendKeys("Adding New Task 1");
//
//        // Click Add New Task Button
//        MobileElement task_addNewTaskButton = (MobileElement) driver.findElementByAccessibilityId("addNewTaskButton");
//        task_addNewTaskButton.click();
//        // ----------------- ADDING NEW TASK  (END)  --------------------
//
//        // ----------------- ASSERTION SECTION (START) --------------------
////        //Expected Result - There message "Logout " must be present after clicking Login
////        MobileElement logout_button = (MobileElement) driver.findElementByAccessibilityId("logoutButton");
////        logout_button.click();
//
//
//    }
//
//
//}
//
