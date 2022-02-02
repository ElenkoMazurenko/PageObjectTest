package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class GaragePage extends BasePage {
    SelenideElement addCarBtn = $x("//*[text()='Add car']");
    SelenideElement brandInput = $("#addCarBrand");
    SelenideElement modelInput = $("#addCarModel");
    SelenideElement mileageInput = $("#addCarMileage");
    SelenideElement addBtn = $x("//*[text()='Add']");

//    SelenideElement loginBtn = $x("//*[text()='Login']");
    public void addCar(String brand, String model, double mileage){
        addCarBtn.click();
        brandInput.sendKeys(brand);
        modelInput.sendKeys(model);
        mileageInput.sendKeys(String.valueOf(mileage));
        addBtn.click();
    }
}
