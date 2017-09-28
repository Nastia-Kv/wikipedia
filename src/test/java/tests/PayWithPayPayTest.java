package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import wikipages.CurrencySelectionPage;
import wikipages.DonationPage;
import wikipages.HomePage;
import wikipages.PayPalPage;

public class PayWithPayPayTest extends BasePageTest {
    private HomePage homePage;
    private DonationPage donationPage;
    private CurrencySelectionPage currencySelectionPage;
    private PayPalPage payPalPage;

    @BeforeClass(alwaysRun = true)
    public void generalSetup() {
        homePage = new HomePage(driver);
        donationPage = new DonationPage(driver);
        donationPage = new DonationPage(driver);
        currencySelectionPage = new CurrencySelectionPage(driver);
        payPalPage = new PayPalPage(driver);
    }

    @Test
    public void checkValidationError() throws InterruptedException {
        homePage.loadWikiPage();
        homePage.clickDonateToWikiLink();
        Thread.sleep(2000);
        donationPage.clickGiveMonthlyBtn();
        donationPage.populateOtherDonationAmount();
        donationPage.clickPayPayBtn();
        currencySelectionPage.enterDonationAmountAndContinue();
        Thread.sleep(5000);
    }

    @Test
    public void verifyPageTitle() {
        Assert.assertEquals(driver.getTitle(), "Billing Information - PayPal");
        String title = driver.getTitle();
        System.out.println(title);
    }
}
