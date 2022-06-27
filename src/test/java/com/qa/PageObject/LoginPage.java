package com.qa.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public static WebElement getEmail(WebDriver driver){
        return driver.findElement(By.xpath("//input[@name='email']"));
    }
    public static WebElement getPassword(WebDriver driver){
        return driver.findElement(By.xpath("//input[@name='password']"));
    }
    public static WebElement getSubmitLogin(WebDriver driver){
        return driver.findElement(By.cssSelector("button[type='submit']"));
    }
}
