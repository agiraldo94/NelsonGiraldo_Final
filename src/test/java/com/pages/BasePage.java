package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        driver.get("https://www.travelocity.com/");
    }

    @FindBy(how = How.CSS,using = "a[aria-controls='wizard-flight-pwa'")
    public WebElement flightOption;

}
