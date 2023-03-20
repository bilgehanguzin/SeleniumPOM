import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.trive.HomePage;
import org.trive.OnlineSubeLoginPage;
import org.trive.TrPlatformLoginPage;

import java.util.ArrayList;

public class TrPlatformLoginTest {

    @Test
    public void loginTest() throws InterruptedException {
        String url = "https://www.trive.com.tr/";

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get(url);

        Faker faker = new Faker();

        String userName = faker.phoneNumber().subscriberNumber();

        String password = faker.witcher().character();

        //Creating object of home page
        HomePage home = new HomePage(driver);

        //Creating object of Login page
        TrPlatformLoginPage login = new TrPlatformLoginPage(driver);


        //Click on Login button
        home.clickTrPlatformLogin();

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
        //Check invalid user
        driver.findElement(By.xpath("//*[text()='Hatalı Kullanıcı Adı ya da Şifreniz']")).isDisplayed();

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
