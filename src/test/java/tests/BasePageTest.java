package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BasePageTest {
    WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void baseSetup() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterSuite(alwaysRun = true)
    public void teardown(){
        driver.quit();
    }
}
