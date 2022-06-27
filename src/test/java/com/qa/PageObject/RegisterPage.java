package com.qa.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    public static WebElement getUserName(WebDriver driver){
        return driver.findElement(By.xpath("//input[@name='fullname']"));
    }
    public static WebElement getEmail(WebDriver driver){
        return driver.findElement(By.xpath("//input[@name='email']"));
    }
    public static WebElement getPassword(WebDriver driver){
        return driver.findElement(By.xpath("//input[@name='password']"));
    }
    public static WebElement getConfirmPassword(WebDriver driver){
        return driver.findElement(By.xpath("//input[@name='password_confirmation']"));
    }
    public static WebElement getSubmitRegister(WebDriver driver){
        return driver.findElement(By.cssSelector("button[type='submit']"));
    }
}
