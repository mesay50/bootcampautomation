package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {

    public void getTitle(){
        System.out.println(driver.getTitle());
    }
    public void clickBestSeller() {
        clickOnElementByXpath("//div[@id='nav-xshop']/a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']");
        //driver.navigate().back();
    }

    public void clickCustomerService() {
        clickOnElementBycss("div#nav-xshop > a:nth-of-type(2)");
        //driver.navigate().back();
    }

    public void clickTodaysDeal() {
        clickOnElementByXpath("//a[contains(text(),\"Today's Deals\")]");
        driver.navigate().back();
    }

    public void clickNewReleases() {
        clickOnElementByLinkText("New Releases");
        driver.navigate().back();
    }

    public void clickFindAgift() {
        clickOnElementByXpath("//*[@id=\"nav-xshop\"]/a[5]");
        driver.navigate().back();
    }

    public void clickRegistry() {
        clickOnElementByLinkText("Registry");
        driver.navigate().back();
    }

    public void typeSearchField() {
        typeOnElementByXpath("/html//input[@id='twotabsearchtextbox']", "Electronics");
        WebElement element = getElement("/html//input[@id='twotabsearchtextbox']");
        Assert.assertEquals(element.isDisplayed(), true, "is not displayed");
    }

    public void getAllDropDown() {
        List<WebElement> elementList = driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
        System.out.println(elementList.size());
        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i).getText());
        }
        List<String> stringList = new ArrayList<String>();
        for (int i = 0; i < elementList.size(); i++) {
            stringList.add(elementList.get(i).getText());
        }
    }

    public void selectLanguage() {
        WebElement element = getElementByxpath("//a[@id='icp-nav-flyout']/span[@class='icp-nav-link-inner']");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElementByXpath("//div[@id='nav-flyout-icp']//a[@href='#switch-lang=es_US']/span[@class='nav-text']");

    }

    public void scrollInCountryView() {
        WebElement element = getElement("//a[@id='icp-touch-link-country']/span[@class='icp-color-base']");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

    }
    public void enterSearchButton(){
        typeOnElementByXpath("/html//input[@id='twotabsearchtextbox']","Ethiopian Music");
        typeEnterByXpath("//div[@id='nav-search']/form[@role='search']//input[@value='Go']");
        WebElement element=getElementByxpath("/html//input[@id='twotabsearchtextbox']");
        Assert.assertEquals(element.isDisplayed(),true,"Elment isn't displayed");
        driver.navigate().back();
    }
    public void findAGift(){
        WebElement element = getElementByxpath("//a[@id='nav-link-accountList']/span[@class='nav-line-2 nav-long-width']");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElementBycss("div#nav-al-wishlist > a:nth-of-type(2) > .nav-text");
        typeOnElementByXpath("/html//input[@id='twotabsearchtextbox']", "Smart Watch");
        typeEnterByXpath("//div[@id='nav-search']/form[@role='search']//input[@value='Go']");
        WebElement element1=getElement("//div[@id='search']/span[@class='rush-component']/h1//span[.='1-16 of over 60,000 results for']");
        Assert.assertEquals(element1.isDisplayed(),true,"Element isn't displayed");

    }

}
