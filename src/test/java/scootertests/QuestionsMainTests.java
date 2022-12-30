package scootertests;

import org.example.sprint_4.pageobject.MainPage;
import org.example.sprint_4.pageobject.QuestionsMainPage;
import org.junit.Test;

public class QuestionsMainTests extends TestBase {

    @Test
    public void checkListQuestions() {

        new MainPage(driver)
                .open()
                .scrollMainPage();

        new QuestionsMainPage(driver)
                .getQuestionsByCycle();
    }
}


