package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.List;

public class CarvanaBasePage {

    public CarvanaBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "svg[class='Icons__IconWrapper-sc-1esr8nv-0 ktvEUu']")
    public WebElement logo;

    @FindBy(css = "div[data-qa='menu-wrapper']")
    public List<WebElement> mainNavigationItems;

    @FindBy(css = "div[data-qa='sign-in-wrapper']")
    public WebElement signInButton;

    @FindBy(id = "email")
    public WebElement emailInputBox;

    @FindBy(css = "button[data-qa='enter-email-submit']")
    public WebElement continueButton;

    @FindBy(id = "password")
    public WebElement passwordInputBox;

    @FindBy(id = "error-banner")
    public WebElement errorMessage;

    @FindBy(css = "button[data-qa='sign-in-submit']")
    public WebElement singInSubmit;

    @FindBy(css = "div[data-qa='header-items'] a")
    public List<WebElement> headerItems;

}
