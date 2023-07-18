package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']//span")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement microsoftOfficeSoftwareOption;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommanderSoftwareOption;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']")
    WebElement successfullyText;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeNotificationBar;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shopingCart;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement goToCart;

    /**
     * get Build Your Own Computer Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getBuildYourOwnComputerText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Build Your Own Computer Text " + buildYourOwnComputerText.toString());
        CustomListeners.test.log(Status.PASS, "get Build Your Own Computer Text " + buildYourOwnComputerText);
        return getTextFromElement(buildYourOwnComputerText);
    }

    /**
     * select Processor
     *
     * @param name
     * @throws InterruptedException
     */
    public void selectProcessor(String name) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select Processor " + selectProcessor.toString());
        CustomListeners.test.log(Status.PASS, "select Processor");
        selectByVisibleTextFromDropDown(selectProcessor, name);
    }

    /**
     * select Ram
     *
     * @param name
     * @throws InterruptedException
     */
    public void selectRam(String name) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select Ram " + selectRam.toString());
        CustomListeners.test.log(Status.PASS, "select Ram " + selectRam);
        selectByVisibleTextFromDropDown(selectRam, name);
    }

    /**
     * select HDD
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectHDD(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select HDD ");
        CustomListeners.test.log(Status.PASS, "select HDD ");
        clickOnElement(By.xpath("//label[normalize-space()='" + value + "']"));
    }

    /**
     * select Os
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectOs(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select Os ");
        CustomListeners.test.log(Status.PASS, "select Os ");
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + value + "')]"));
    }

    /**
     * select Microsoft Office SoftwareOption
     *
     * @throws InterruptedException
     */
    public void selectMicrosoftOfficeSoftwareOption() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log(" select Microsoft Office SoftwareOption " + microsoftOfficeSoftwareOption.toString());
        CustomListeners.test.log(Status.PASS, " select Microsoft Office SoftwareOption " + microsoftOfficeSoftwareOption);
        selectCheckBox(microsoftOfficeSoftwareOption);
    }

    /**
     * select Total Commander Software Option
     *
     * @throws InterruptedException
     */
    public void selectTotalCommanderSoftwareOption() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log(" select Total Commander Software Option " + totalCommanderSoftwareOption.toString());
        CustomListeners.test.log(Status.PASS, " select Total Commander Software Option " + totalCommanderSoftwareOption);
        clickOnElement(totalCommanderSoftwareOption);
    }

    /**
     * get Total Price Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getTotalPriceText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Total Price Text " + totalPrice.toString());
        CustomListeners.test.log(Status.PASS, "get Total Price Text " + totalPrice);
        return getTextFromElement(totalPrice);
    }

    /**
     * click On Add to Cart
     *
     * @throws InterruptedException
     */
    public void clickOnAddtoCart() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click On Add to Cart " + addToCart.toString());
        CustomListeners.test.log(Status.PASS, "click On Add to Cart " + addToCart);
        clickOnElement(addToCart);
    }

    /**
     * get Successfully Added To CartText
     *
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfullAddedToCartText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Successfully Added To CartText " + successfullyText.toString());
        CustomListeners.test.log(Status.PASS, "get Successfully Added To CartText " + successfullyText);
        return getTextFromElement(successfullyText);
    }

    /**
     * close Notification Bar
     *
     * @throws InterruptedException
     */
    public void closeNotificationBar() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("close Notification Bar " + closeNotificationBar.toString());
        CustomListeners.test.log(Status.PASS, "close Notification Bar " + closeNotificationBar);
        clickOnElement(closeNotificationBar);
    }

    /**
     * mouse Hover To ShoppingCart And ClickOnCart
     *
     * @throws InterruptedException
     */
    public void mouseHoverToShoppingCartAndClickOnCart() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("mouse Hover To ShoppingCart " + shopingCart.toString());
        CustomListeners.test.log(Status.PASS, "mouse Hover To ShoppingCart " + shopingCart);
        mouseHoverToElement(shopingCart);
        Reporter.log("mouse Hover To ShoppingCart And ClickOnCart " + goToCart.toString());
        CustomListeners.test.log(Status.PASS, "mouse Hover To ShoppingCart And ClickOnCart " + goToCart);
        mouseHoverToElementAndClick(goToCart);
    }


}
