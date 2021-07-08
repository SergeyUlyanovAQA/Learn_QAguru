package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $("[value='1']").click();
        $(".react-datepicker__year-select").click();
        $("[value='1990']").click();
        $(".react-datepicker__day--017").click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $(".form-file-label").click();



        $("#uploadPicture").click();
        $("#uploadPicture").click();
        $("#uploadPicture").click();

        $("#currentAddress").setValue("Saratov");
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();



    }
}
