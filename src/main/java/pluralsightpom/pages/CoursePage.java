package pluralsightpom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pluralsightpom.DriverFactory.getChromeDriver;
import static pluralsightpom.DriverFactory.getWebDriverWait;

public class CoursePage {

    private final WebDriver driver = getChromeDriver();
    private final WebDriverWait wait = getWebDriverWait();

    private CoursePage() {
    }

    public static CoursePage getCoursePage() {
        return new CoursePage();
    }


    public void verifyFreeTrialIsDisplayed() {
        driver.findElement(By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][1]"))
                .isDisplayed();
    }

    public CoursePage verifyCoursePreviewIsDisplayed() {
        driver.findElement(By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][2]"))
                .isDisplayed();
        return this;
    }
}
