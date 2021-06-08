package com.ToDo.testCases;

import com.ToDo.base.Base;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class TestCase03_Can_add_new_task_after_login extends Base {

    @Test
    public void add_new_task_after_login() {

//     ----------------- LOGGING IN PROCESS (START) --------------------
        // Clicking Email Input box and type an email
        MobileElement log_in_email = (MobileElement) driver.findElementByAccessibilityId("loginEmail");
        log_in_email.sendKeys("bbungalan@gmail.com");

        // Clicking Email Input box and type the password
        MobileElement login_pwd = (MobileElement) driver.findElementByAccessibilityId("loginPassword");
        login_pwd.sendKeys("123456");

        // Click Login Button
        MobileElement login_button = (MobileElement) driver.findElementByAccessibilityId("loginButton");
        login_button.click();
        // ----------------- LOGGING IN PROCESS (END)  --------------------

        // ----------------- ADDING NEW TASK  (BEGIN)  --------------------
        // Clicking Add new Task Button @add new task screen
        MobileElement taskScreen_AddTaskButton = (MobileElement) driver.findElementByAccessibilityId("addNewTaskButton");
        taskScreen_AddTaskButton.click();

        // Input text to the "Enter a new task" input box
        MobileElement task_inputNewTaskText = (MobileElement) driver.findElementByAccessibilityId("inputNewTaskText");
        task_inputNewTaskText.sendKeys("Adding New Task 1");

        // Click Add New Task Button
        MobileElement task_addNewTaskButton = (MobileElement) driver.findElementByAccessibilityId("addNewTaskButton");
        task_addNewTaskButton.click();
        // ----------------- ADDING NEW TASK  (END)  --------------------

        // ----------------- ASSERTION SECTION (START) --------------------
//        //Expected Result - There message "Logout " must be present after clicking Login
//        MobileElement logout_button = (MobileElement) driver.findElementByAccessibilityId("logoutButton");
//        logout_button.click();
    }
}