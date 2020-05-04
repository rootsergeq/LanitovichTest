package LanitovichTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {

        String text = "заданная последовательность стоп (обычно от четырёх до одиннадцати) называлась стихом";


        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        Configuration.startMaximized = true;

        Configuration.timeout = 10000;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
        /*
        open("https://dev.n7lanit.ru/");

        //шаг первый

        $(By.xpath("//button[@class='btn navbar-btn btn-default btn-sign-in']")).click();
        $(By.xpath("//input[@id='id_username']")).sendKeys("rootsergeqq");
        $(By.xpath("//input[@id='id_password']")).sendKeys("123456789qq");
        $(By.xpath("//button[@class =\"btn btn-primary btn-block\"]")).click();

        // Шаг второй
        $(By.xpath("//div[@id='user-menu-mount']//li[@class='dropdown']/a/img")).shouldBe(Condition.visible);

        // Шаг третий
        int a = (int) (Math.random() * (1 + 1)) + 1;
        $(By.xpath("(//li[@class='list-group-item thread-new' and not(descendant::span[contains(text(), 'Опрос')])])[" + a + "]//div//a//span[2]")).click();

        //Шаг четвертый
        $(By.xpath("(//button[@class = 'btn btn-primary btn-block btn-outline'])[2]")).click();

        //Шаг пятый
        $(By.xpath("//textarea")).sendKeys(text);
        $(By.xpath("//div[@class='editor-footer']//button[@class='btn btn-primary btn-sm pull-right']")).click();

        //Шаг шестой
        Assert.assertEquals($(By.xpath("(//article[@class = 'misago-markup']//p[contains(text(), '" + text + "')])[1]")).getText(), text);

        //Шаг седьмой

        $(By.xpath("//div[@class = 'container navbar-full navbar-desktop-nav']//a[contains(text(), 'Темы')]")).click();

        // Шаг восьмой
        int b = (int) (Math.random() * (1 + 1)) + 1;
        $(By.xpath("(//li[@class='list-group-item thread-new' and not(descendant::span[contains(text(), 'Опрос')])])[" + b + "]//div//a//span[2]")).click();

        //Шаг девятый
        $(By.xpath("(//button[@class = 'btn btn-primary btn-block btn-outline'])[2]")).click();

        //Шаг десятый
        $(By.xpath("//textarea")).sendKeys(text);
        $(By.xpath("//div[@class='editor-footer']//button[@class='btn btn-primary btn-sm pull-right']")).click();

        //Шаг одиннадцатый
        Assert.assertEquals($(By.xpath("(//article[@class = 'misago-markup']//p[contains(text(), '" + text + "')])[1]")).getText(), text);

        //Шаг двенадцатый

        $(By.xpath("//div[@class = 'container navbar-full navbar-desktop-nav']//a[contains(text(), 'Темы')]")).click();

         */
    }
}
