package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private SelenideElement loginInput = $(By.xpath("//input[@id='id_username']")); //sendKeys("rootsergeqq");
    private SelenideElement passwordInput = $(By.xpath("//input[@id='id_password']")); //sendKeys("123456789qq");

    public void inputLogin(String text){
        this.loginInput.val(text);
    }

    public void passwordLogin(String text){
        this.passwordInput.val(text);
    }
}
