package com.ToDo.testCases;

import com.ToDo.base.Base;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class TestCase01_Sign_up_to_the_app extends Base {

    @Test
    public void sign_up_to_App() {

        // ------------------- Signing Up Process -------------
        // Click Signup Button
        MobileElement signupButton = (MobileElement) driver.findElementByAccessibilityId("signupButton");
        signupButton.click();

        // Filling up the Full name
        MobileElement fullNameInput = (MobileElement) driver.findElementByAccessibilityId("signupFullName");
        fullNameInput.sendKeys("ABCD EFGHIJ");

        // Clicking Email Input box and type an email
        MobileElement signup_email = (MobileElement) driver.findElementByAccessibilityId("signupEmailAddress");
        signup_email.sendKeys("abcdefg3@efghij.com");

        // Clicking password Input box and type the password
        MobileElement desiredPwd = (MobileElement) driver.findElementByAccessibilityId("signupPassword");
        desiredPwd.sendKeys("abcdefghij");

        // Click Signup Button @signup screen
        MobileElement signup_signupButton = (MobileElement) driver.findElementByAccessibilityId("signup_signupButton");
        signup_signupButton.click();
        signup_signupButton.click();
    }
}
