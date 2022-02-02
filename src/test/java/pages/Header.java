package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Header extends BasePage {
    SelenideElement dropdownBtn = $("#userNavDropdown");
    SelenideElement logoutBtn = $x("//*[text()='Logout']");

    public void logoutViaHeader(){
        dropdownBtn.click();
        logoutBtn.click();
    }
}