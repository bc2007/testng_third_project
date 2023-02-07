package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.CarvanaBasePage;
import util.Waiter;

public class CarvanaBaseTest extends CarvanaBase{



    @BeforeMethod
    public void setPage(){
        carvanaBasePage = new CarvanaBasePage();
    }


    @Test(priority = 1, description = "Validate Carvana home page title and URL")
    public void validateTitleAndURL(){
        Assert.assertEquals(driver.getTitle(), "Carvana | Buy & Finance Used Cars Online | At Home Delivery");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/");
    }


    @Test(priority = 2, description = "Validate the Carvana logo")
    public void validateCarvanaLogo(){
        driver.navigate().refresh();
        Assert.assertTrue(carvanaBasePage.logo.isDisplayed());
    }


    @Test(priority = 3, description = "Validate the main navigation section items")
    public void validateMainNavigationItems(){
        String[] expectedMainNavigationItems = {"HOW IT WORKS", "ABOUT CARVANA", "SUPPORT & CONTACT"};
        for (int i = 0; i < carvanaBasePage.mainNavigationItems.size(); i++) {
            Assert.assertEquals(carvanaBasePage.mainNavigationItems.get(i).getText(), expectedMainNavigationItems[i]);
        }
    }


    @Test(priority = 4, description = "Validate the sign in error message")
    public void validateSignInErrorMessage(){
        Waiter.waitForElementTobeClickable(carvanaBasePage.signInButton, 5);
        carvanaBasePage.signInButton.click();
        carvanaBasePage.emailInputBox.sendKeys("johndoe@gmail.com");
        carvanaBasePage.continueButton.click();
        carvanaBasePage.passwordInputBox.sendKeys("abcd1234");
        carvanaBasePage.singInSubmit.click();
        Assert.assertEquals(carvanaBasePage.errorMessage.getText(), "Email address and/or password combination is incorrect.");
    }



}
