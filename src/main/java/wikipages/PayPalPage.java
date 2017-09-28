package wikipages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayPalPage extends BasePage {
    public PayPalPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//img[@alt='Payments By PayPal']")
    WebElement payPalLogo;

//    public boolean verifyIfOnPayPalPage() {
//        if (payPalLogo.getText().equals("Payments By PayPal")) {
//            System.out.println("You are on the PayPal page.");
//            return true;
//        }
//        System.out.println("You are not on a PayPal page");
//        String text = payPalLogo.getText();
//        System.out.println(text);
//        return false;
//    }
}
