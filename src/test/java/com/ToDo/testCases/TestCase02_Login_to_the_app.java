package com.ToDo.testCases;

import com.ToDo.base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;

public class TestCase02_Login_to_the_app extends Base {

    @Test
    public void login_to_the_app(){

        // Clicking Email Input box and type an email
//        FindsByAccessibilityId <MobileElement> driver;
        MobileElement log_in_email = (MobileElement) driver.findElementByAccessibilityId("loginEmail");
        log_in_email.sendKeys("bbungalan@gmail.com");

        // Clicking Email Input box and type the password
        MobileElement login_pwd = (MobileElement) driver.findElementByAccessibilityId("loginPassword");
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
