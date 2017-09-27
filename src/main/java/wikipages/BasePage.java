package wikipages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public String pageUrl;
    public String pageTitle;
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //basic methods
    public String getPageUrl() {
        return pageUrl;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void loadPage() {
        driver.get(getPageUrl());
    }

    public void click(WebElement element) {
        element.click();
    }

    public void setElementText(WebElement element, String text) {
        //element.clear();
        element.click();
        element.sendKeys(text);
    }


}
