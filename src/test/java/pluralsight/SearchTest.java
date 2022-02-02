package pluralsight;

import org.testng.annotations.Test;
import pluralsightpom.pages.CoursePage;
import pluralsightpom.pages.HomePage;
import pluralsightpom.pages.SearchPage;

public class SearchTest extends BaseTest {

    HomePage home = new HomePage();
    SearchPage searchPage = new SearchPage();
    CoursePage coursePage = new CoursePage();

    @Test
    public void basicFilterByTest() {
        home.search("Java");
        searchPage.filterBySkillLevel("Beginner")
                .filterByRole("Software Development")
                .selectTabCourse()
                .selectCourse("Java Fundamentals: The Java Language");
        coursePage.verifyCoursePreviewIsDisplayed().verifyFreeTrialIsDisplayed();
    }

}
