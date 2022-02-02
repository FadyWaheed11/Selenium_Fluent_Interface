package pluralsight;

import org.testng.annotations.Test;
import pluralsightpom.pages.CoursePage;
import pluralsightpom.pages.HomePage;
import pluralsightpom.pages.SearchPage;
import pluralsightpom.pages.search.Role;
import pluralsightpom.pages.search.SkillLevel;
import pluralsightpom.pages.search.Tab;

public class SearchTest extends BaseTest {


    @Test
    public void basicFilterByTest() {
        HomePage.getHomePage().search("Java");
        SearchPage.getSearchPage().filterBySkillLevel(SkillLevel.BEGINNER)
                .filterByRole(Role.SOFTWARE_DEVELOPMENT)
                .selectTabCourse(Tab.COURSES)
                .selectCourse("Java Fundamentals: The Java Language");
        CoursePage.getCoursePage().verifyCoursePreviewIsDisplayed().verifyFreeTrialIsDisplayed();
    }

}
