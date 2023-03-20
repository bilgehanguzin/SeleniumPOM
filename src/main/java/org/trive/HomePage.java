package org.trive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Locator for login button
    By loginPageNavigatorBtn = By.xpath("//*[@class='login']");

    //Locator for Online Sube button

    By onlineSubeNavigatorBtn = By.xpath("//*[text()='Online Şube']");

    //Locator for Online Sube button

    By trPlatformNavigatorBtn = By.xpath("//*[text()='TR Platform']");

    //Method to click online sube button
    public void clickOnlineSubeLogin() {
        driver.findElement(loginPageNavigatorBtn).click();
        driver.findElement(onlineSubeNavigatorBtn).click();



    }
    //Method to click online sube button
    public void clickTrPlatformLogin() {
        driver.findElement(loginPageNavigatorBtn).click();
        driver.findElement(trPlatformNavigatorBtn).click();
}
}
