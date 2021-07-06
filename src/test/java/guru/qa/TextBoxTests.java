package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://www.demoqa.com";
        Configuration.startMaximized = true;

    }

    @Test
    void positiveFillTest() {
        open("/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("1IT@qa.ru");
        $("#currentAddress").setValue("Saratov");
        $("#permanentAddress").setValue("LA");
        $("#submit").click();

        $("#name").shouldHave(text ("Alex"));
        $("#email").shouldHave(text ("1IT@qa.ru"));
        $("#currentAddress", 1).shouldHave(text ("Saratov"));
        $("#permanentAddress", 1).shouldHave(text ("LA"));

    }
}
