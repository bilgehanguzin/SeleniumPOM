package org.trive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrPlatformLoginPage {


    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public TrPlatformLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locator for client id field
    By clientId = By.xpath("//*[@name='username']");

    //Locator for password field
    By pswd = By.xpath("//*[@name='password']");

    //Locator for login button
    By loginBtn = By.xpath("//button[@type='submit']");


    //Method to enter username
    public void enterUsername(String user) {
        driver.findElement(clientId).sendKeys(user);
    }

    //Method to enter password
    public void enterPassword(String pass) {
        driver.findElement(pswd).sendKeys(pass);
    }

    //Method to click on Login button
    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
}
