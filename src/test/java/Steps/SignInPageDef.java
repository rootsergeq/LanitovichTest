package Steps;

import config.UserConfig;
import cucumber.api.java.ru.И;
import pages.SignInPage;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();


    @И("Вводим Логин")
    public void вводимЛогин() {
        signInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @И("Вводим Пароль")
    public void вводимПароль() {
        signInPage.passwordLogin(UserConfig.PASSWORD_LOGIN);

    }
}
