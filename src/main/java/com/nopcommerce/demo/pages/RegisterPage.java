package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmpassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompleted;

    /**
     * enter Firstname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterFirstname(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Firstname " + firstName.toString());
        CustomListeners.test.log(Status.PASS,"enter Firstname " + firstName);
        sendTextToElement(firstName, value);
    }

    /**
     * enter Lastname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterLastname(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Lastname " + lastName.toString());
        CustomListeners.test.log(Status.PASS,"enter Lastname " + lastName);
        sendTextToElement(lastName, value);
    }

    /**
     * enter Email
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Email " + email.toString());
        CustomListeners.test.log(Status.PASS,"enter Email " + email);
        sendTextToElement(email, value);
    }

    /**
     * enter Password
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Password " + password.toString());
        CustomListeners.test.log(Status.PASS,"enter Password " + password);
        sendTextToElement(password, value);
    }

    /**
     * enter Confirm Password
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterConfirmPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Confirm Password " + confirmpassword.toString());
        CustomListeners.test.log(Status.PASS,"enter Confirm Password " + confirmpassword);
        sendTextToElement(confirmpassword, value);
    }

    /**
     * click On Register Button
     *
     * @throws InterruptedException
     */
    public void clickOnRegisterButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click On Register Button " + registerButton.toString());
        CustomListeners.test.log(Status.PASS,"click On Register Button " + registerButton);
        clickOnElement(registerButton);
    }

    /**
     * get Registration Completed Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getRegistrationCompletedText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Registration Completed Text " + registrationCompleted.toString());
        CustomListeners.test.log(Status.PASS,"get Registration Completed Text " + registrationCompleted);
        return getTextFromElement(registrationCompleted);
    }
}
