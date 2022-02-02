package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class Notifications {
    public void shouldHaveText(String text){
        $(".alert").shouldHave(Condition.text(text));

    }
    public void shouldHaveAlert(String text){

        $(".alert-list").shouldHave(Condition.text(text));
    }
    public void shouldHaveLoginButton(String text) {
        $(".header_inner").shouldHave(Condition.text(text));
    }

}
