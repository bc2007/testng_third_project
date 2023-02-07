package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.CarvanaBasePage;
import page.CarvanaSearchResultPage;
import util.ConfigReader;
import util.Driver;

public class CarvanaBase {

    WebDriver driver;
    CarvanaBasePage carvanaBasePage;
    CarvanaSearchResultPage carvanaSearchResultPage;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("appURL"));
        carvanaBasePage = new CarvanaBasePage();
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }

}
