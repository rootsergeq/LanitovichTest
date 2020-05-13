package pages;

import com.codeborne.selenide.Condition;
import config.Storage;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.*;

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

    public void vibiraemRandomTemu() {
        int b = (int) (Math.random() * (2)) + 2;
        if (b % 2 != 0) {
            b = b + 1;
        }
        $(By.xpath("(//span[(@class='btn-text') and (contains(text(), 'Неактивна'))])[" + b + "]")).click();
        String result = $(By.xpath("//div[(.//span[(@class='btn-text') and (contains(text(), 'Неактивна'))]) and contains(@class, \"media-body\")]//a")).getAttribute("href");
        config.Storage.add(result);
    }

    public void proverkaSsilki() {


        int k = (int) (Math.random() * (2)) + 2;
        if (k % 2 != 0) {
            k = k + 1;
        }
        String result2 = $(By.xpath("//div[@class = 'media-body']//a")).getAttribute("href");
        config.Storage.add(result2);
        System.out.println(result2);
    }



    public void nazhimaemNaVipodausheeOknoPodpisku() {
        $(By.xpath("//div[@class='btn-group open']//span[@class='material-icon'][contains(text(),'star_half')]")).click();
    }

    public void vkladkaPodpiski() {
        $(By.xpath("//a[@href=\"/subscribed/\"]")).click();
    }

    public void NazhimaemNaAktivVkladku() {

        $(By.xpath("(//div[@class= 'btn-group'])[2]")).click();
    }

    public void ubiraemIzAktivnih() {
        $$(By.xpath("//*[contains(@class, 'btn-link') and contains(.,'Отписаться ')]")).filter(Condition.visible).get(0).click();
    }
    public void nazhimaemNaVse() {
        $x("//div[@class = 'container']//a[contains(text(), 'Все')]").click();
    }

}


