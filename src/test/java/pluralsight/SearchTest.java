package pluralsight;

import org.testng.annotations.Test;
import pluralsightpom.CommonVerification;
import pluralsightpom.pages.HomePage;
import pluralsightpom.pages.SearchPage;
import pluralsightpom.pages.search.Role;
import pluralsightpom.pages.search.SkillLevel;
import pluralsightpom.pages.search.Tab;

import static pluralsightpom.CommonVerification.getCommonVerification;
import static pluralsightpom.pages.CoursePage.coursePreviewButton;
import static pluralsightpom.pages.CoursePage.freeTrialButton;
import static pluralsightpom.pages.HomePage.getHomePage;
import static pluralsightpom.pages.SearchPage.getSearchPage;

public class SearchTest extends BaseTest {


    HomePage homePage = getHomePage();
    SearchPage searchPage = getSearchPage();
    CommonVerification commonVerification = getCommonVerification();

    @Test
    public void basicFilterByTest() {
        homePage.search("Java");
        searchPage.filterBySkillLevel(SkillLevel.BEGINNER)
                .filterByRole(Role.SOFTWARE_DEVELOPMENT)
                .selectTabCourse(Tab.COURSES)
                .selectCourse("Java Fundamentals: The Java Language");
        commonVerification
                .verifyIsDisplayed(freeTrialButton())
                .verifyIsDisplayed(coursePreviewButton());
    }

}
