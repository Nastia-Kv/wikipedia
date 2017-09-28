package wikipages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DonationPage extends BasePage {

    public DonationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='radiobuttons-cell input_amount_1']") WebElement donationAmount75;
    @FindBy(xpath = "//*[@id='frequency_monthly']/following-sibling::label") WebElement giveMonthlyBtn;
    @FindBy(css = ".radiobuttons-cell.input_amount_other") WebElement otherBtn;
    @FindBy(css = ".payment-method-button[value='Donate by credit/debit card']") WebElement donateByCardBtn;
    @FindBy(css = ".payment-method-div.paymentmethod-pp.paymentmethod-pp-usd") WebElement payPalBtn;

    public void pickDonationAmount() {
        click(donationAmount75);
    }

    public void populateOtherDonationAmount() {
        Actions actions = new Actions(driver);
        actions.moveToElement(otherBtn).click().sendKeys("500").build().perform();
    }

    public void clickDonateByCardBtn() {
        click(donateByCardBtn);
    }

    public void clickGiveMonthlyBtn() {
        Actions actions = new Actions(driver);
        actions.moveToElement(giveMonthlyBtn).click().build().perform();
    }

    public void clickPayPayBtn() {
        click(payPalBtn);
    }

    public WebElement getOtherBtn() {
        return otherBtn;
    }


}
