package LanitovichTest;

import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        open("https://dev.n7lanit.ru/");
        //шаг первый

        $(By.xpath("//button[@class='btn navbar-btn btn-default btn-sign-in']")).click();
        $(By.xpath("//input[@id='id_username']")).sendKeys("rootsergeq");
        $(By.xpath("//input[@id='id_password']")).sendKeys("2662645q");
        $(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
        // Шаг второй
        Assert.assertTrue("логин не был выполнен", $(By.xpath("//a[@class='dropdown-toggle']//img[@class='user-avatar']")).isDisplayed());
        // Шаг третий
        Double m = Math.random();
        //$(By.xpath("(//div[@class = 'row thread-row']//span[contains(text(),'ответ')])[" + m + "]"));

        System.out.println(m);
    }
}
