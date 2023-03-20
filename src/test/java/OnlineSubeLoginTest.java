import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterTest;
import org.trive.HomePage;
import org.trive.OnlineSubeLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class OnlineSubeLoginTest {

    @Test
    public void loginTest() throws InterruptedException {
        String url = "https://www.trive.com.tr/";

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get(url);

        Faker faker = new Faker();

        String userName = faker.name().username();

        String password = faker.witcher().character();

        //Creating object of home page
        HomePage home = new HomePage(driver);

        //Creating object of Login page
        OnlineSubeLoginPage login = new OnlineSubeLoginPage(driver);


        //Click on Login button
        home.clickOnlineSubeLogin();

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(2000);

        //Enter username & password
        login.enterUsername(userName);
        Thread.sleep(2000);
        login.enterPassword(password+"_9813");

        //Click on login button
        login.clickLogin();
        Thread.sleep(3000);

        driver.quit();


    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Starting Test On Chrome Browser");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Finished Test On Chrome Browser");

    }

}
