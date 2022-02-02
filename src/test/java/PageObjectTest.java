import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GaragePage;
import pages.Header;
import pages.HomePage;
import pages.SideBar;

import static com.codeborne.selenide.Selenide.*;

public class PageObjectTest {
    @Test
    public void canLogin(){
        //Arrange
        HomePage homePage = new HomePage();

        //Act
        GaragePage garagePage = homePage.login("elenkomazurenko@gmail.com", "Qauto111");

        //Assert
        garagePage.notifications.shouldHaveText("You have been successfully logged in");
    }

    @Test
    public void canLogoutViaHeader(){

        //Arrange
        HomePage homePage = new HomePage();
        GaragePage garage = homePage.login("elenkomazurenko@gmail.com", "Qauto111");
        Header header = new Header();
        //Act
        header.logoutViaHeader();

        //Assert
        homePage.notifications.shouldHaveLoginButton("Sign In");
    }

    @Test
    public void canAddCar() {
        //Arrange
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("elenkomazurenko@gmail.com", "Qauto111");

        //Act
        garagePage.addCar("Fiat","Panda", 2.5);

        //Assert
       garagePage.notifications.shouldHaveAlert("Car added");

   }

    @Test
    public void canLogoutFromSideBar() {
        //Arrange
        HomePage homePage = new HomePage();
        GaragePage garagePage = homePage.login("elenkomazurenko@gmail.com", "Qauto111");
        SideBar sidebar = new SideBar();

        //Act
        sidebar.logoutViaSideMenu();
        //Assert
        homePage.notifications.shouldHaveLoginButton("Sign In");
    }
}
