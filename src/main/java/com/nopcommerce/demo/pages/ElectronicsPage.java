package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Electronics']")
    WebElement electronicsTabText;

    /**
     * get Electronics HeaderText
     *
     * @return
     */
    public String getElectronicsHeaderText() {
        Reporter.log("get Electronics HeaderText " + electronicsTabText.toString());
        CustomListeners.test.log(Status.PASS, "get Electronics HeaderText " + electronicsTabText);
        return getTextFromElement(electronicsTabText);
    }

    /**
     * This method select menu on top menu
     *
     * @param menu
     */
    public void selectMenu(String menu) {
        Reporter.log("This method select menu on top menu ");
        CustomListeners.test.log(Status.PASS, "This method select menu on top menu ");
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']"));
    }

}
