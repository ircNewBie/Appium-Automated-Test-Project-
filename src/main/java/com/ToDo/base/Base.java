package com.ToDo.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//=====================================================================================================================
public class Base {

    public Base() {
    //    Base Class Constructor for pages
        PageFactory.initElements(new AppiumFieldDecorator( driver ), this );

    }

    public static AppiumDriver <MobileElement> driver;
    public static DesiredCapabilities capability;

    @Parameters ({  "platform_name", "platform_version",
                    "device_name", })

    @BeforeMethod
    public void open_the_app(String platform_name,
                             String platform_version,
                             String device_name) throws IOException {

        File config_file = new File("src/main/resources/config.properties");
        FileInputStream settings_file_input_stream = new FileInputStream(config_file);
        Properties props = new Properties();
        props.load(settings_file_input_stream);

        URL appium_url = new URL(  props.getProperty("appium_url") );
        String path_of_ios_app = props.getProperty(("path_of_ios_app"));

        capability = new DesiredCapabilities();

        if (platform_name.equalsIgnoreCase("android")) {
            //                ANDROID Capabilities
            capability.setCapability(MobileCapabilityType.PLATFORM_NAME, platform_name);
            capability.setCapability(MobileCapabilityType.VERSION, platform_version);
            capability.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
            capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.todoqacart.MainActivity");
            capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.todoqacart");
            driver = new AndroidDriver<MobileElement>(appium_url, capability);
        } else  {
            //               iOS Capabilities
            capability.setCapability(MobileCapabilityType.PLATFORM_NAME, platform_name);
            capability.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
            capability.setCapability(MobileCapabilityType.APP, path_of_ios_app);
            capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            driver = new IOSDriver<MobileElement>(appium_url, capability);
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
