package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    public Dashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(className="oro-subtitle")
    public WebElement title;

    @FindBy(xpath="//span[text()='Vehicles']")
    public WebElement vehicle;

    @FindBy(xpath="//span[contains(text(),'Fleet') and contains(@class,'title')]/..")
    public WebElement fleet;
}
