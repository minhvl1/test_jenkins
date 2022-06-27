package com.qa.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static WebElement getButtonRegiser(WebDriver driver){
        return driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
    }
    public static WebElement getMenuButton(WebDriver driver){
        return driver.findElement(By.xpath("//li[@class='navbar-right__item group']//div[@class='title']"));
    }
    public static WebElement getNotice(WebDriver driver){
        return driver.findElement(By.xpath("//button[@id='topcv-popover-allow-button']"));
    }
    public static WebElement getLogoutButton(WebDriver driver){
        return driver.findElement(By.cssSelector(".text-sm[href='javascript:void(0)']"));
    }
    public static WebElement getLoginButton(WebDriver driver){
        return driver.findElement(By.xpath("//i[@class='icon fa-light fa-left-to-line']"));
    }
    public static WebElement getMenuCV(WebDriver driver){
        return driver.findElement(By.xpath("//a[contains(text(),'Hồ sơ & CV')]"));
    }
    public static WebElement getManagementCV(WebDriver driver){
        return driver.findElement(By.xpath("//li[contains(@class,'navbar-left__item group')]//li[contains(@class,'active')]//a[1]"));
    }

}
