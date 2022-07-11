package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public Login(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name="_username")
    public WebElement userName;

    @FindBy(name="_password")
    public WebElement password;

    @FindBy(name="_submit")
    public WebElement logIn;



}
