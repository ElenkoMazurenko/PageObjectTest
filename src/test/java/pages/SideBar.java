package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SideBar extends GaragePage{

    SelenideElement logoutSideBarBtn = $x("//*[text()=' Log out ']");

    public void logoutViaSideMenu(){
        logoutSideBarBtn.click();
    }
}
