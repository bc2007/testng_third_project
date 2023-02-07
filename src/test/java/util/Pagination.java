package util;

import org.openqa.selenium.WebElement;

public class Pagination {

    public static Integer numberOfPages(WebElement paginationText){
        return Integer.parseInt(paginationText.getText().substring(paginationText.getText().lastIndexOf(" ") + 1));
    }

}
