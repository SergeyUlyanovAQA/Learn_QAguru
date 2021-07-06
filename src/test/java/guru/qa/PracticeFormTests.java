package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTests {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://www.demoqa.com";
        Configuration.startMaximized = true;

    }

    @Test
    void positiveFillTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Ulyanov");
        $("#lastName").setValue("Sergey");
        $("#userEmail").setValue("1IT@qa.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirth").setValue("17 Feb 1990");
        $("#subjectsContainer").setValue("Computer Science");
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").click();

        $("#currentAddress").setValue("Saratov");
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();



    }
}
