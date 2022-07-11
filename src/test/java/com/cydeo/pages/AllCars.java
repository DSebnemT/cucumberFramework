package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllCars {
    public AllCars(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(className="oro-subtitle")
    public WebElement title;

    @FindBy(xpath="//a[contains(@title,'export')]")
    public WebElement exportGrid;

    @FindBy(xpath="//*[@title='CSV']")
    public WebElement csvOption;

    @FindBy(xpath="//*[@title='XLSX']")
    public WebElement xlsxOption;

    @FindBy(xpath="//*[@title='Refresh']")
    public WebElement refreshButton;

}
