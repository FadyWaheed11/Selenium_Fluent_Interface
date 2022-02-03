package pluralsightpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pluralsightpom.DriverFactory.getChromeDriver;

public class CommonVerification {

    private WebDriver driver = getChromeDriver();

    private CommonVerification(){

    }

    public static CommonVerification getCommonVerification(){
        return new CommonVerification();
    }

    public CommonVerification verifyIsDisplayed(By element) {
        driver.findElement(element).isDisplayed();
        return this;
    }
}
