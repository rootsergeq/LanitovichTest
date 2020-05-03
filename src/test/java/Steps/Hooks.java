package Steps;

import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void openUr() {
        open("https://dev.n7lanit.ru/");
    }

}
