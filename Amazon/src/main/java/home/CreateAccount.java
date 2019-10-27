package home;

import base.CommonAPI;
import org.testng.Assert;

public class CreateAccount extends CommonAPI {
    public void signInBar(){
        clickOnElementByXpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner']");
    }
    public void createAmazonAccount(){
        clickOnElementByLinkText("Create your Amazon account");
    }
    public void typeNameField(){
        typeOnElementByXpath("/html//input[@id='ap_customer_name']","Fiker Legesse ");

    }
    public void typeEmailField(){
        typeOnElementByXpath("/html//input[@id='ap_email']","fiker@amacon.com");
    }
    public void typeOnPasswordField(){
        typeOnElementByXpath("/html//input[@id='ap_password']","fiker@386603");
    }
    public void typeOnPasswordReentered(){
        typeOnElementByXpath("/html//input[@id='ap_password_check']","fiker@386603");
    }
    public void createAmazonAccountContinue(){
        clickOnElementByXpath("/html//input[@id='continue']");
    }
}
