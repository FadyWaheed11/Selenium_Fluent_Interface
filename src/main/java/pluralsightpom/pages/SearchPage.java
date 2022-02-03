package pluralsightpom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pluralsightpom.pages.search.Role;
import pluralsightpom.pages.search.SkillLevel;
import pluralsightpom.pages.search.Tab;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;
import static pluralsightpom.DriverFactory.getChromeDriver;
import static pluralsightpom.DriverFactory.getWebDriverWait;
import static pluralsightpom.utils.TestUtils.explicitWait;

public class SearchPage {


    private SearchPage() {

    }

    public static SearchPage getSearchPage() {
        return new SearchPage();
    }

    private final WebDriver driver = getChromeDriver();
    private final WebDriverWait wait = getWebDriverWait();

    public SearchPage filterBySkillLevel(SkillLevel value) {

        driver.findElement(By.xpath("//div[contains(@class, 'search-filter-header') and contains(.,'Skill Levels')]"))
                .click();

        By skillFilter = By.xpath("//span[contains(@class, 'search-filter-option-text') and contains(.,'" + value + "')]");
        wait.until(visibilityOfAllElementsLocatedBy(skillFilter));
        driver.findElement(skillFilter)
                .click();

        explicitWait();
        return this;
    }

    public SearchPage filterByRole(Role value) {
        driver.findElement(By.xpath("//div[contains(@class, 'search-filter-header') and contains(.,'Roles')]"))
                .click();

        By roleFilter = By.xpath("//span[contains(@class, 'search-filter-option-text') and contains(.,'" + value + "')]");
        wait.until(visibilityOfAllElementsLocatedBy(roleFilter));
        driver.findElement(roleFilter)
                .click();

        explicitWait();
        return this;
    }

    public SearchPage selectTabCourse(Tab value) {
        driver.findElement(By.xpath("//a[contains(@class, 'tab') and contains(., '" + value + "')]"))
                .click();
        return this;
    }

    public void selectCourse(String courseName) {
        driver.findElement(By.xpath("//div[@id='search-results-category-target']" +
                        "//div[@class='search-result columns' and contains(., '" + courseName + "')]" +
                        "//div[@class='search-result__title']/a"))
                .click();
    }
}
