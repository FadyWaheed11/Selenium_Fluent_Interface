package pluralsightpom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pluralsightpom.DriverFactory.getChromeDriver;

public class HomePage {
    private final WebDriver driver = getChromeDriver();
    private final By headerSearchPath = By.className("header_search--input");

    public void search(String value) {
        WebElement search = driver.findElement(headerSearchPath);
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
    }

}
