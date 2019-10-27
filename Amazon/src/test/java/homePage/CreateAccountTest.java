package homePage;

import home.CreateAccount;
import org.testng.annotations.Test;

public class CreateAccountTest extends CreateAccount {
   @Test
    public void validateNewAccount(){
       signInBar();
       createAmazonAccount();
       typeNameField();
       typeEmailField();
       typeOnPasswordField();
       typeOnPasswordReentered();
       createAmazonAccountContinue();
    }
}
