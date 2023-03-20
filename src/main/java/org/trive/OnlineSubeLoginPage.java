package org.trive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineSubeLoginPage {


    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public OnlineSubeLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locator for username field
    By uName = By.id("basic_username");

    //Locator for password field
    By pswd = By.xpath("//*[@id='basic_password']/span/input");

    //Locator for login button
    By loginBtn = By.xpath("//*[text()='GİRİŞ']");


    //Method to enter username
    public void enterUsername(String user) {
        driver.findElement(uName).sendKeys(user);
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
