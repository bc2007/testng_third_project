package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CarvanaSearchResultPage extends CarvanaBasePage{

    public CarvanaSearchResultPage(){
        super();
    }

    @FindBy(css = "div[data-qa='menu-flex']>button")
    public List<WebElement> filterOptions;

    @FindBy(css = "input[data-qa='search-bar-input']")
    public WebElement searchBarInputBox;

    @FindBy(css = "button[data-qa='go-button']")
    public WebElement goButton;

    @FindBy(css = "div[class='result-tile']")
    public List<WebElement> resultTiles;

    @FindBy(css = "div[class='result-tile']>a>div>div>picture")
    public List<WebElement> tilePictures;

    @FindBy(css = "svg[data-qa='favorite-icon']")
    public List<WebElement> favoriteButtons;

    @FindBy(css = "div[data-qa='base-inventory-type']")
    public List<WebElement> inventoryType;

    @FindBy(css = "div[data-qa='make-model']")
    public List<WebElement> yearMakeModel;

    @FindBy(css = "div[data-qa='trim-mileage']")
    public List<WebElement> trimMileage;

    @FindBy(css = "div[data-qa='price']")
    public List<WebElement> price;

    @FindBy(css = "div[data-qa='monthly-payment']")
    public List<WebElement> monthlyPayment;

    @FindBy(css = "div[class='down-payment']")
    public List<WebElement> downPayment;

    @FindBy(css = "div[class='tk-frame bottom-frame']")
    public List<WebElement> deliveryChip;

    @FindBy(css = "span[data-qa='pagination-text']")
    public WebElement paginationText;

    @FindBy(css = "li[data-qa='list-item']>button")
    public List<WebElement> pageNavigationButtons;


}
