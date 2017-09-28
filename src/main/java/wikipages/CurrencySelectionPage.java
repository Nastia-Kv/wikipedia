package wikipages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CurrencySelectionPage extends BasePage {
    public CurrencySelectionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#amount") WebElement amountField;
    @FindBy(css = "#currency") WebElement currencyDropdown;
    @FindBy(css = "#paymentContinueBtn") WebElement continueBtn;

    public void enterDonationAmountAndContinue() {
        amountField.clear();
        setElementText(amountField, "500");
        Select currencyDropDown = new Select(currencyDropdown);
        currencyDropDown.selectByValue("MXN");
        click(continueBtn);
    }

}
