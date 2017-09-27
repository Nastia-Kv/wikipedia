package wikipages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
        this.pageUrl = "https://en.wikipedia.org/wiki/Main_Page";
        this.pageTitle = "Wikipedia, the free encyclopedia";
    }

    @FindBy(css = "#n-sitesupport") WebElement donateToWikipediaLink;

    public void loadWikiPage(){
        loadPage();
    }

    public void clickDonateToWikiLink(){
        click(donateToWikipediaLink);
    }


}
