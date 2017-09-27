package wikipages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonationPage extends BasePage {

    public DonationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='radiobuttons-cell input_amount_1']") WebElement donationAmount75;
    @FindBy(css = ".payment-method-button[value='Donate by credit/debit card']") WebElement donateByCardBtn;

    public void pickDonationAmount(){
        click(donationAmount75);
    }

    public void clickDonateByCardBtn(){
        click(donateByCardBtn);
    }


}
