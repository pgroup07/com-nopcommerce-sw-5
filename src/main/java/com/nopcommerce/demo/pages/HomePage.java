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
public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTabOnTopMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsTabOnTopMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhone;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeStoreText;
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successfulText;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 register-button']")
    WebElement registerTab;


    /**
     * click On Computer Tab
     */
    public void clickOnComputerTab() {
        Reporter.log("click On Computer Tab " + computerTabOnTopMenu.toString());
        CustomListeners.test.log(Status.PASS,"click On Computer Tab " + computerTabOnTopMenu);
        clickOnElement(computerTabOnTopMenu);
    }

    /**
     * get Thank You Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getThankYouText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Thank You Text " + thankYouText.toString());
        CustomListeners.test.log(Status.PASS,"get Thank You Text " + thankYouText);
        return getTextFromElement(thankYouText);
    }

    /**
     * get Successful Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfulText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Successful Text " + successfulText.toString());
        CustomListeners.test.log(Status.PASS,"get Successful Text " + successfulText);
        return getTextFromElement(successfulText);
    }

    /**
     * click On Continue
     *
     * @throws InterruptedException
     */
    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click On Continue " + continueButton.toString());
        CustomListeners.test.log(Status.PASS,"click On Continue " + continueButton);
        clickOnElement(continueButton);
    }

    /**
     * get Welcome Store Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getWelcomeStoreText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Welcome Store Text " + welcomeStoreText.toString());
        CustomListeners.test.log(Status.PASS,"get Welcome Store Text " + welcomeStoreText);
        return getTextFromElement(welcomeStoreText);
    }

    /**
     * mouse Hover To Electronic Tab
     */
    public void mouseHoverToElectronicTab() {
        Reporter.log("mouse Hover To Electronic Tab " + electronicsTabOnTopMenu.toString());
        CustomListeners.test.log(Status.PASS,"mouse Hover To Electronic Tab " + electronicsTabOnTopMenu);
        mouseHoverToElement(electronicsTabOnTopMenu);
    }

    /**
     * +
     * mouseHover ToCell Phones And Click
     */
    public void mouseHoverToCellPhonesAndClick() {
        Reporter.log("mouseHover ToCell Phones And Click " + cellPhone.toString());
        CustomListeners.test.log(Status.PASS,"mouseHover ToCell Phones And Click " + cellPhone);
        mouseHoverToElementAndClick(cellPhone);
    }

    /**
     * click On Register Tab
     */
    public void clickOnRegisterTab() {
        Reporter.log("click On Register Tab " + registerTab.toString());
        CustomListeners.test.log(Status.PASS,"click On Register Tab " + registerTab);
        clickOnElement(registerTab);
    }

}
