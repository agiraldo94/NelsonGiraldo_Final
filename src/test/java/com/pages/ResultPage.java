package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.List;

public class ResultPage extends BasePage{
    public ResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS,using = ".uitk-spacing uitk-spacing-margin-blockend-twelve")
    public WebElement filterBy;

    @FindBys(@FindBy(css = "option[data-test-id='sortDropdown-option']"))
    public List<WebElement> optionsOrder;

}
