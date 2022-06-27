package com.qa.stepdef;

import com.qa.PageObject.CVPage;
import com.qa.PageObject.HomePage;
import com.qa.PageObject.LoginPage;
import com.qa.PageObject.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class Login {
    WebDriver driver;
    TimeSt timeStamp = new TimeSt();
    String uuid = timeStamp.timeStamp().replaceAll("-","");

    public Login() {
        this.driver = Hooks.openAndQuitBrowser();
    }
    @Given("print uuid")
    public void printUuid() {
        System.out.println("Time Stamp: "+uuid);
    }
    @Given("go to topcv")
    public void goToTopcv() {
        driver.get("https://www.topcv.vn/");
    }

    @When("register")
    public void register() throws InterruptedException {
        HomePage.getButtonRegiser(driver).click();
        RegisterPage.getUserName(driver).sendKeys("Minh Vu");
        RegisterPage.getEmail(driver).sendKeys(uuid + "@gmail.com");
        Thread.sleep(3000);
        RegisterPage.getPassword(driver).click();
        RegisterPage.getPassword(driver).sendKeys(uuid.substring(10));
        RegisterPage.getConfirmPassword(driver).sendKeys(uuid.substring(10));
        RegisterPage.getSubmitRegister(driver).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.topcv.vn/viec-lam");
    }

    @And("logout")
    public void logout() throws InterruptedException {
        Thread.sleep(5000);
        HomePage.getNotice(driver).click();
        HomePage.getMenuButton(driver).click();
        Actions actions = new Actions(driver);
        actions.moveToElement(HomePage.getLogoutButton(driver));
        HomePage.getLogoutButton(driver).click();
    }
    @Then("Login")
    public void login() throws InterruptedException{
        LoginPage.getEmail(driver).sendKeys(uuid + "@gmail.com");
        LoginPage.getPassword(driver).sendKeys(uuid.substring(10));
        System.out.println("Email:"+uuid + "@gmail.com");
        System.out.println("Password:"+uuid.substring(10));
        LoginPage.getSubmitLogin(driver).click();
        Thread.sleep(5000);
    }

    @And("Create CV")
    public void createCV() {
        HomePage.getMenuCV(driver).click();
        CVPage.getClosePopup(driver).click();
        CVPage.getCreateCVButton(driver).click();
//        CVPage.getCloseSuggestionPopup(driver).click();
        CVPage.getCv(driver).click();
        CVPage.getChooseCvButton(driver).click();

    }

    @And("Input data to CV")
    public void inputDataToCV() throws InterruptedException {
        CVPage.getPhoneNumberCV(driver).sendKeys("0583476538");
        Thread.sleep(5000);
        CVPage.getEmailCV(driver).sendKeys(uuid + "@gmail.com");
        Thread.sleep(5000);
        CVPage.getSaveCvButton(driver).click();
        CVPage.getCvTitle(driver).sendKeys("Demo CV");
        CVPage.getCvSubmit(driver).click();
        CVPage.getSaveCvButton(driver).click();
        Thread.sleep(2000);
        CVPage.getShowCvButton(driver).click();
        Thread.sleep(5000);
    }

    @And("Show CV")
    public void showCV() {
    }
}
