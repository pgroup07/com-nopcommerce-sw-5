package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Sagar Goswami
 */
public class LoginPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement guestCheckout;

    /**
     * get Welcome Text
     *
     * @return
     */
    public String getWelcomeText() {
        Reporter.log("get Welcome Text " + welcomeText.toString());
        CustomListeners.test.log(Status.PASS,"get Welcome Text " + welcomeText);
        return getTextFromElement(welcomeText);
    }

    /**
     * click On Guest Checkout
     */
    public void clickOnGuestCheckout() {
        Reporter.log("click On Guest Checkout " + guestCheckout.toString());
        CustomListeners.test.log(Status.PASS,"click On Guest Checkout " + guestCheckout);
        clickOnElement(guestCheckout);
    }


}
