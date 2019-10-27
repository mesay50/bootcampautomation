package homePage;

import base.CommonAPI;
import home.AccountPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountPageTest extends AccountPage {

   AccountPage accountPage;

   @BeforeMethod
public void setpagefactory(){
     accountPage = PageFactory.initElements(driver, AccountPage.class);
}
    @Test
    public void validateAccountPageTest() {
        accountPage.validateAccountPage();

    }

    @Test(enabled = false)
    public void validateUserFieldTypableTest() {
        accountPage.validateUserFieldTypable();
    }

    @Test(enabled = false)
    public void validateClickContinueTest() {
        accountPage.validateClickContinue();
    }

    @Test(enabled = false)
    public void validateErrorUserNameTest() {
        accountPage.validateErrorUserName();
    }
    @Test(enabled = false)
    public void validatePasswordFieldtest(){
        accountPage.validatePasswordField();

    }
    @Test(enabled = false)
    public void validateSignIN(){
        accountPage.validateSignIN();
    }
    @Test(enabled = false)
    public void validatekeepSignIn(){
        keeySignIn();
    }

}
