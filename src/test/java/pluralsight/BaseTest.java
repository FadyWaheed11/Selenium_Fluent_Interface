package pluralsight;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import static pluralsightpom.DriverFactory.getChromeDriver;
import static pluralsightpom.DriverFactory.getWebDriverWait;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    @BeforeSuite
    public void setUp() {
        driver = getChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        wait = getWebDriverWait();
    }

    @BeforeMethod
    public void goHome() {
        driver.get("C:\\Users\\Fady Waheed\\Downloads\\website\\HomePage.html");
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        driver.close();
    }
}
