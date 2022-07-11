package com.cydeo.step_definitions;

import com.cydeo.pages.AllCars;
import com.cydeo.pages.Dashboard;
import com.cydeo.pages.Login;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Utilities;

public class vehicles {
    String url = ConfigurationReader.getProperty("url");
    String username = ConfigurationReader.getProperty("username");
    String password = ConfigurationReader.getProperty("password");

    Dashboard dashboard =new Dashboard();
    Login login =new Login();
    AllCars allCars =new AllCars();
    WebDriver driver= Driver.getDriver();
    @Given("the user is on the Dashboard page")
    public void the_user_is_on_the_dashboard_page() {

        driver.get(url);
        login.userName.sendKeys(username);
        login.password.sendKeys(password);
        login.logIn.click();
        boolean titleIsDisplayed=dashboard.title.isDisplayed();
        assert titleIsDisplayed;
    }
    @When("the user is on the All Cars page")
    public void the_user_is_on_the_all_cars_page() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(dashboard.fleet).perform();
        dashboard.vehicle.click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Cars')]")));
    }
    @Then("the Export Grid dropdown is displayed")
    public void the_export_grid_dropdown_is_displayed() throws InterruptedException {
        assert allCars.exportGrid.isDisplayed();
    }

    @When("the user clicks on Export Grid dropdown")
    public void the_user_clicks_on_export_grid_dropdown() {
        allCars.exportGrid.click();
    }
    @Then("CSV option is displayed")
    public void csv_option_is_displayed() {
        boolean isDisplayed=allCars.csvOption.isDisplayed();
        assert isDisplayed;
    }
    @Then("XLSX option is displayed")
    public void xlsx_option_is_displayed() {
        boolean isDisplayed=allCars.xlsxOption.isDisplayed();
        assert isDisplayed;
    }
    @Then("the Refresh button is displayed")
    public void the_refresh_button_is_displayed() {
        assert allCars.refreshButton.isDisplayed();
    }



}