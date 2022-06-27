package com.qa.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CVPage {
    public static WebElement getClosePopup(WebDriver driver){
        return driver.findElement(By.xpath("//a[@class='btn-close text-gray']"));
    }
    public static WebElement getCreateCVButton(WebDriver driver){
        return driver.findElement(By.xpath("//a[@href='https://www.topcv.vn/mau-cv'][contains(text(),'Tạo mới')]"));
    }
    public static WebElement getCloseSuggestionPopup(WebDriver driver){
        return driver.findElement(By.xpath("//span[@class='fa fa-times']"));
    }
    public static WebElement getCv(WebDriver driver){
        return  driver.findElement(By.xpath("//body//div//div[@class='row']//div[@class='row']//div[1]//div[1]//div[1]//a[1]//div[1]"));
    }
    public static WebElement getChooseCvButton(WebDriver driver){
        return driver.findElement(By.cssSelector(".chosen-template.btn-topcv-primary.btn-use"));
    }
    public static WebElement getPhoneNumberCV(WebDriver driver){
        return driver.findElement(By.xpath("//span[@id='cvo-profile-phone']"));
    }
    public static WebElement getEmailCV(WebDriver driver){
        return driver.findElement(By.xpath("//span[@id='cvo-profile-email']"));
    }
    public static WebElement getSaveCvButton(WebDriver driver){
        return driver.findElement(By.xpath("//div[@id='btn-save-cv']"));
    }
    public static WebElement getCvTitle(WebDriver driver){
        return driver.findElement(By.xpath("(//div[@class='modal-body'])[3]//input"));
    }
    public static WebElement getCvSubmit(WebDriver driver){
        return driver.findElement(By.xpath("(//a[@class='btn btn-topcv-primary'])[2]"));
    }
    public static WebElement getShowCvButton(WebDriver driver){
        return driver.findElement(By.xpath("//a[@id='btn-view-cv']"));
    }
}
