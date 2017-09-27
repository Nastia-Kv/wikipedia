package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import wikipages.DonationPage;
import wikipages.HomePage;
import wikipages.PaymentsPage;

public class GeneralTest extends BasePageTest {
    private HomePage homePage;
    private DonationPage donationPage;
    private PaymentsPage paymentsPage;

    @BeforeClass(alwaysRun = true)
    public void generalSetup() {
        homePage = new HomePage(driver);
        donationPage = new DonationPage(driver);
        donationPage = new DonationPage(driver);
        paymentsPage = new PaymentsPage(driver);
    }
    @Test
    public void checkValidationError() throws InterruptedException {
        homePage.loadWikiPage();
        homePage.clickDonateToWikiLink();
        Thread.sleep(2000);
        donationPage.pickDonationAmount();
        donationPage.clickDonateByCardBtn();
        Thread.sleep(5000);
        paymentsPage.populateBasicInfo();
        paymentsPage.selectVisaCard();
        Thread.sleep(4000);
        driver.switchTo().frame(paymentsPage.getFrame());
        paymentsPage.populateCardInfo();
        Thread.sleep(5000);
        paymentsPage.clickPayBtn();
        String validationError = paymentsPage.getValidationError().getText();
        Assert.assertEquals(validationError, "Card Number invalid or missing");
    }

}
