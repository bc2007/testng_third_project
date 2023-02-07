package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.CarvanaBasePage;
import page.CarvanaSearchResultPage;
import util.Waiter;

public class CarvanaSearchResultTest extends CarvanaBase{

    @BeforeMethod
    public void setPage(){
        carvanaBasePage = new CarvanaBasePage();
        carvanaSearchResultPage = new CarvanaSearchResultPage();
        Waiter.waitForElementTobeClickable(carvanaBasePage.headerItems.get(0), 5);
        carvanaBasePage.headerItems.get(0).click();
    }

    @Test(priority = 5, description = "Validate the search filter options and search button")
    public void validateSearchButtonAndSearchFilterOptions(){
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.carvana.com/cars");
        String[] expectedFilterOptions = {"PAYMENT & PRICE", "MAKE & MODEL", "BODY TYPE", "YEAR & MILEAGE", "FEATURES", "MORE FILTERS"};
        for (int i = 0; i < carvanaSearchResultPage.filterOptions.size(); i++) {
            Assert.assertEquals(carvanaSearchResultPage.filterOptions.get(i).getText(), expectedFilterOptions[i]);
        }
    }

    @Test(priority = 6, description = "Validate the search result tiles")
    public void validateSearchResultTiles(){
        carvanaSearchResultPage.searchBarInputBox.click();
        carvanaSearchResultPage.searchBarInputBox.sendKeys("mercedes-benz");
        carvanaSearchResultPage.goButton.click();
        Waiter.waitUntilURLContains("mercedes-benz", 10);
        Assert.assertTrue(driver.getCurrentUrl().contains("mercedes-benz"));

            for (int i = 0; i < carvanaSearchResultPage.resultTiles.size(); i++) {
                Assert.assertTrue(carvanaSearchResultPage.tilePictures.get(i).isDisplayed());
                Assert.assertTrue(carvanaSearchResultPage.favoriteButtons.get(i).isDisplayed());
                Assert.assertTrue(carvanaSearchResultPage.inventoryType.get(i).isDisplayed());
                Assert.assertFalse(carvanaSearchResultPage.inventoryType.get(i).getText().isEmpty());
                Assert.assertTrue(carvanaSearchResultPage.yearMakeModel.get(i).isDisplayed());
                Assert.assertFalse(carvanaSearchResultPage.yearMakeModel.get(i).getText().isEmpty());
                Assert.assertTrue(carvanaSearchResultPage.trimMileage.get(i).isDisplayed());
                Assert.assertFalse(carvanaSearchResultPage.trimMileage.get(i).getText().isEmpty());
                Assert.assertTrue(carvanaSearchResultPage.price.get(i).isDisplayed());
                Assert.assertFalse(carvanaSearchResultPage.price.get(i).getText().isEmpty());
                Assert.assertTrue(carvanaSearchResultPage.monthlyPayment.get(i).isDisplayed());
                Assert.assertFalse(carvanaSearchResultPage.monthlyPayment.get(i).getText().isEmpty());
                Assert.assertTrue(carvanaSearchResultPage.downPayment.get(i).isDisplayed());
                Assert.assertFalse(carvanaSearchResultPage.downPayment.get(i).getText().isEmpty());
                Assert.assertTrue(carvanaSearchResultPage.deliveryChip.get(i).isDisplayed());
                Assert.assertFalse(carvanaSearchResultPage.deliveryChip.get(i).getText().isEmpty());
            }

    }



}
