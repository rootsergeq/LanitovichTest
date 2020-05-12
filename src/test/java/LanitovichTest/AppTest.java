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

        Configuration.timeout = 20000;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);

    }
}
