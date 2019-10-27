package homePage;

import home.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    @Test(enabled = false)
    public void getTitleTest(){
        getTitle();
    }
    @Test(enabled = false)
    public void validSearchFieldTest() {
        typeSearchField();
    }

    @Test(enabled = false)
    public void clickBestSellerTest() {
        clickBestSeller();
    }

    @Test(enabled = false)
    public void clickCustomerServiceTest() {
        clickCustomerService();
    }

    @Test(enabled = false)
    public void clickTodaysDeal() {
        clickTodaysDeal();
    }

    @Test(enabled = false)
    public void clickNewRelease() {
        clickNewReleases();
    }

    @Test(enabled = false)
    public void clickFindAgiftTest() {
        clickFindAgift();
    }

    @Test(enabled = false)
    public void clickRigestryTest() {
        clickRegistry();
    }

    @Test(enabled = false)
    public void getAllDropDownTest() {
        getAllDropDown();
    }@Test(enabled = false)
    public void selectLanguadgeTest(){
        selectLanguage();
    }@Test(enabled = false)
    public void  scrollIncountryviewtest(){
        scrollInCountryView();
    }@Test(enabled = false)
    public void enterSearchButtontest(){
        enterSearchButton();
    }@Test
    public void validateFindAGift(){
        findAGift();
    }
}
