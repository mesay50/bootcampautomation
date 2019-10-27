package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AccountPage extends CommonAPI {
    @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")
    public static WebElement signInButton;

    @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")
    public static WebElement signIn;

    @FindBy(how = How.XPATH, using = "/html//input[@id='ap_email']")
    public static WebElement userField;

    @FindBy(how = How.LINK_TEXT, using = "//span[@id='continue']//input[@id='continue']")
    public static WebElement clickContinue;

    @FindBy(xpath = "/html//input[@id='ap_password']")
    public static WebElement passwordField;
    @FindBy(xpath = "/html//input[@id='signInSubmit']")
    public static WebElement signIN;
    @FindBy(xpath = "//div[@id='auth-error-message-box']//i[@class='a-icon a-icon-alert']")
    public static WebElement errorUserName;

    public void validateAccountPage() {
        signInButton.click();
    }
   //public void validateS

    public void validateUserFieldTypable() {
        userField.sendKeys("mesay@gmail.com");
        Assert.assertEquals(userField.isDisplayed(), true, "userField Isn't Displayed");
    }

    public void validateClickContinue() {
        clickContinue.click();
    }

    public void validatePasswordField() {
        passwordField.sendKeys("mesay50");
        Assert.assertEquals(passwordField.isDisplayed(), true, "password Field Isn't Displayed");
    }

    public void validateSignIN() {
        signIN.click();
    }

    public void validateErrorUserName() {
        errorUserName.getText();
    }

    public void keeySignIn() {
        isElementSelected("input[name='rememberMe']");
    }
}
