package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Cell phones']")
    WebElement cellPhone;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Nokia Lumia 1020']")
    WebElement ProductName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']//span[normalize-space()='$349.00']")
    WebElement PriceName;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement listView;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement updateQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']")
    WebElement successfullyText;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeNotificationBar;

    /**
     * get Cell Phone Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getCellPhoneText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Cell Phone Text " + cellPhone.toString());
        CustomListeners.test.log(Status.PASS,"get Cell Phone Text " + cellPhone);
        return getTextFromElement(cellPhone);
    }

    /**
     * click On List ViewIcon
     */
    public void clickOnListViewIcon() {
        Reporter.log("click On List ViewIcon " + cellPhone.toString());
        CustomListeners.test.log(Status.PASS,"click On List ViewIcon " + cellPhone);
        clickOnElement(listView);
    }

    /**
     * select Phone FromList
     *
     * @param phone
     * @throws InterruptedException
     */
    public void selectPhoneFromList(String phone) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select Phone FromList " );
        CustomListeners.test.log(Status.PASS,"select Phone FromList " );
        clickOnElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'" + phone + "')]"));
    }

    /**
     * get Product NameText
     *
     * @return
     * @throws InterruptedException
     */
    public String getProductNameText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Product NameText " + ProductName.toString());
        CustomListeners.test.log(Status.PASS,"get Product NameText " + ProductName);
        return getTextFromElement(ProductName);
    }

    /**
     * get PriceText
     *
     * @return
     * @throws InterruptedException
     */
    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get PriceText " + PriceName.toString());
        CustomListeners.test.log(Status.PASS,"get PriceText " + PriceName);
        return getTextFromElement(PriceName);
    }

    /**
     * update Quantity
     *
     * @param value
     * @throws InterruptedException
     */
    public void updateQuantity(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("update Quantity " + updateQuantity.toString());
        CustomListeners.test.log(Status.PASS,"update Quantity " + updateQuantity);
        sendTextToElement(updateQuantity, value);
    }

    /**
     * click On Add ToCart
     *
     * @throws InterruptedException
     */
    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click On Add ToCart " + addToCart.toString());
        CustomListeners.test.log(Status.PASS,"click On Add ToCart " + addToCart);
        clickOnElement(addToCart);
    }

    /**
     * get Successfull Added To CartText
     *
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfullAddedToCartText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Successfull Added To CartText " + successfullyText.toString());
        CustomListeners.test.log(Status.PASS,"get Successfull Added To CartText " + successfullyText);
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
        CustomListeners.test.log(Status.PASS,"close Notification Bar " + closeNotificationBar);
        clickOnElement(closeNotificationBar);
    }

}
