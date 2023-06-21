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
        $(".js-wiki-more-pages-link").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        //Открыть страницу SoftAssertions, проверить, что внутри есть пример кода для JUnit5
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {"));
    }

}
