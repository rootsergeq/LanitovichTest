package pages;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {
    public void clickButton() {
        $(By.xpath("//button[@class='btn navbar-btn btn-default btn-sign-in']")).click();

    }

    public void clickVhod() {
        $(By.xpath("//button[@class =\"btn btn-primary btn-block\"]")).click();
    }

    public void proverkaVhoda() {
        $(By.xpath("//div[@id='user-menu-mount']//li[@class='dropdown']/a/img")).shouldBe(Condition.visible);
    }
    // //*[(@class="mebia-body"] and [/span[(@class='btn-text') and (contains(text(), 'Активна'))])]]


    /*дшые

    public void poiskRandomnoyTemi() {
        int a = (int) (Math.random() * (1 + 1)) + 1;
        $(By.xpath("(//li[@class='list-group-item thread-new' and not(descendant::span[contains(text(), 'Опрос')])])[" + a + "]//div//a//span[2]")).click();
    }

    public void nazimaemNaOtvetit() {
        $(By.xpath("(//button[@class = 'btn btn-primary btn-block btn-outline'])[2]")).click();
    }

    public void vvodimInteresniText(String text) {
//        String text = "заданная последовательность стоп (обычно от четырёх до одиннадцати) называлась стихом";
        $(By.xpath("//textarea")).sendKeys(text);
    }

    public void NazhimaemOtpravitOtvet() {
        $(By.xpath("//div[@class='editor-footer']//button[@class='btn btn-primary btn-sm pull-right']")).click();
    }

    public void proverkaOtobrazheniaSoobxhenia(String text) {
//        String text = "заданная последовательность стоп (обычно от четырёх до одиннадцати) называлась стихом";
        Assert.assertEquals($(By.xpath("(//article[@class = 'misago-markup']//p[contains(text(), '" + text + "')])[1]")).getText(), text);
    }

    public void perehodNaVkladkuTemi() {
        $(By.xpath("//div[@class = 'container navbar-full navbar-desktop-nav']//a[contains(text(), 'Темы')]")).click();
    }

     */
    public void vibiraemRandomTemu() {
        int b = (int) (Math.random() * (2)) + 2;
        if (b % 2 != 0) {
            b = b + 1;
        }
        $(By.xpath("(//span[(@class='btn-text') and (contains(text(), 'Неактивна'))])[" + b + "]")).click();
    }

    public void nazhimaemNaVipodausheeOknoPodpisku() {
        $(By.xpath("//div[@class='btn-group open']//span[@class='material-icon'][contains(text(),'star_half')]")).click();
    }

    public void vkladkaPodpiski() {
        $(By.xpath("//a[@href=\"/subscribed/\"]")).click();
    }
}

