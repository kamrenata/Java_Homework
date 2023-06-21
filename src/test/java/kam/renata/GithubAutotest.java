package kam.renata;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class GithubAutotest extends TestBase {
    @Test
    void jUnit5Check(){
        //Открыть страницу Selenide в Github
        open("/");
        $("[placeholder='Search GitHub']").setValue("Selenide").pressEnter();
        $(byText("selenide/")).click();
        //Перейти в раздел Wiki проекта
        $("#wiki-tab").click();
        //Убедиться, что в списке страниц (Pages) есть страница SoftAssertions
        $(".markdown-body").shouldHave(text("Soft assertions"));
        //Открыть страницу SoftAssertions, проверить, что внутри есть пример кода для JUnit5
        $(".markdown-body").$(byText("Soft assertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));
    }

}
