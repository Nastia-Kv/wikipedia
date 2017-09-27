package wikipages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PaymentsPage extends BasePage {
    public PaymentsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first_name") WebElement firstName;
    @FindBy(id = "last_name") WebElement lastName;
    @FindBy(id = "email") WebElement email;
    @FindBy(css = ".options-h.enabled.three-per-line > li | #submethod-visa") WebElement visa;

    public WebElement getFrame() {
        return frame;
    }

    @FindBy(id = "adyen-iframe") WebElement frame;
    @FindBy(css = ".fieldDiv > input") WebElement cardNumberField;
    @FindBy(xpath = "//*[@id='card.expiryMonth']") WebElement expiryMonthDropdown;
    @FindBy(xpath = "//*[@id='card.expiryYear']") WebElement expiryYearDropdown;
    @FindBy(xpath = "//*[@id='card.cvcCode']") WebElement cvcField;
    @FindBy(css = ".paySubmit.paySubmitcard") WebElement payBtn;
    @FindBy(xpath = "//*[@id='errorFrameValidationErrors']") WebElement validationError;

    public void populateBasicInfo() {
        setElementText(firstName, "test");
        setElementText(lastName, "test123");
        setElementText(email, "test12233344dgfsdfsd@gmail.com");
    }

    public void selectVisaCard() {
        click(visa);
    }

    public void populateCardInfo() {
        setElementText(cardNumberField, "123456789798768");

        Select monthDropDown = new Select(expiryMonthDropdown);
        monthDropDown.selectByVisibleText("01");
        //monthDropDown.selectByIndex(1;
        //monthDropDown.selectByValue("01");

        Select yearDropDown = new Select(expiryYearDropdown);
        yearDropDown.selectByValue("2022");

        setElementText(cvcField, "123");
    }

//        public void populateCardInfo() throws InterruptedException {
//            System.out.println("123");
//            Thread.sleep(5000);
//            Actions actions = new Actions(driver);
//            actions.moveToElement(cardNumberField).click().build().perform();
//            System.out.println("456");
//    }



    public void clickPayBtn(){
        click(payBtn);
    }

    public WebElement getValidationError() {
        return validationError;
    }




}
