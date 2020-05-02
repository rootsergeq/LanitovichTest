package LanitovichTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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

        Configuration.timeout = 10000;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);

        open("https://dev.n7lanit.ru/");
        //шаг первый

        $(By.xpath("//button[@class='btn navbar-btn btn-default btn-sign-in']")).click();
        $(By.xpath("//input[@id='id_username']")).sendKeys("rootsergeqq");
        $(By.xpath("//input[@id='id_password']")).sendKeys("123456789qq");
        $(By.xpath("//button[@class =\"btn btn-primary btn-block\"]")).click();
        // Шаг второй
        Assert.assertTrue("логин не был выполнен", $(By.xpath("//a[@class='dropdown-toggle']//img[@class='user-avatar']")).isDisplayed());
        // Шаг третий
        //int a = (int) (Math.random() * (100 + 1)) - 98;
        //$(By.xpath("(//div[@class = 'row thread-row']//span[contains(text(),'ответ')])[" + a + "]"));
        //System.out.println(a);
        //$(By.xpath("(//li[@class='list-group-item thread-new' and not(descendant::span[contains(text(), 'Опрос')])])[2]//div//a//span[2]")).click();
    }
}
