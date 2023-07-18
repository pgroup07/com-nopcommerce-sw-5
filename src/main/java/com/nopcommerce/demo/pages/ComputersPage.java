package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputersPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktop;


    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement shortingFilterOption;

    /**
     * click On Desktop
     */
    public void clickOnDesktop() {
        Reporter.log("click On Desktop " + desktop.toString());
        CustomListeners.test.log(Status.PASS, "click On Desktop " + desktop);
        clickOnElement(desktop);
    }

    /**
     * select Value From Shorting DropDown
     *
     * @param text
     * @throws InterruptedException
     */
    public void selectValueFromShortingDropDown(String text) throws InterruptedException {
        Thread.sleep(1000);
//        WebElement dropDown = driver.findElement(shortingFilterOption);
//        Select select = new Select(dropDown);
//        // Select by visible text
//        select.selectByVisibleText(text);
        Reporter.log("select Value From Shorting DropDown " + shortingFilterOption.toString());
        CustomListeners.test.log(Status.PASS, "select Value From Shorting DropDown " + shortingFilterOption);
        selectByVisibleTextFromDropDown(shortingFilterOption, text);
        Thread.sleep(1000);
    }

    /**
     * click Add to Cart By ProductName
     *
     * @param productName
     * @throws InterruptedException
     */
    public void clickAddtoCartByProductName(String productName) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click Add to Cart By ProductName " );
        CustomListeners.test.log(Status.PASS, "click Add to Cart By ProductName " );
        clickOnElement(By.xpath("(//h2//a[normalize-space()='" + productName + "']//following::button)[1]"));
    }

    /**
     * @return
     * @throws InterruptedException
     */
    public List<String> sortDesktopByPositionZtoA() throws InterruptedException {
        //    waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"),5);
        Thread.sleep(2000);
        List<WebElement> beforeShortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> beforeShortDesktopValue = new ArrayList<>();
        for (WebElement value : beforeShortValue) {
            beforeShortDesktopValue.add(value.getText());
        }
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: Z to A");
        Thread.sleep(2000);
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"), 5);

        // After shorting value
        List<WebElement> afterShortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> afterShortDesktopValue = new ArrayList<>();

        for (WebElement value1 : afterShortValue) {
            afterShortDesktopValue.add(value1.getText());
        }

        Collections.sort(beforeShortDesktopValue);// Ascending order

        Collections.reverse(beforeShortDesktopValue);// reverse

        return beforeShortDesktopValue;
    }

    /**
     * @return
     * @throws InterruptedException
     */
    public List<String> getAllProductNamesAfterShorting() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Get all product name after shorting " );
        CustomListeners.test.log(Status.PASS, "Get all product name after shorting " );
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"), 5);
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: Z to A");
        Thread.sleep(2000);
        waitUntilVisibilityOfElementLocated(By.xpath("//div[@class='picture']//img"), 5);

        // After shorting value
        List<WebElement> afterShortValue = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        List<String> afterShortDesktopValue = new ArrayList<>();

        for (WebElement value1 : afterShortValue) {
            afterShortDesktopValue.add(value1.getText());
        }
        return afterShortDesktopValue;
    }
}
