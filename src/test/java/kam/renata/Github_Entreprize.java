package kam.renata;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class Github_Entreprize extends TestBase {
    @Test
    void entreprizeTest() {
        //Открыть Github
        open("/");
        //выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        //Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best"
        $(".enterprise-hero").shouldHave(text("Build like the best"));
    }

}

