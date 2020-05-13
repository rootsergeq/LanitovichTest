package Steps;

import cucumber.api.java.ru.И;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();


    @И("Нажимаем на Sign in")
    public void нажимаемНаSignIn() {
        basicPage.clickButton();
    }

    @И("нажимаем на вход")
    public void нажимаемНаВход() {
        basicPage.clickVhod();
    }

    @И("проверяем что мы прошли регистрацию")
    public void проверяемЧтоМыПрошлиРегистрацию() {
        basicPage.proverkaVhoda();
    }

    @И("выбираем случайную тему")
    public void выбираемСлучайнуюТему() {
        basicPage.vibiraemRandomTemu();
    }
    @И("нажимаем на всплывающее окно подписаться")
    public void нажимаемНаВсплывающееОкноПодписаться() {
        basicPage.nazhimaemNaVipodausheeOknoPodpisku();
    }


    @И("нажимаем на подписки")
    public void нажимаемНаПодписки() {
        basicPage.vkladkaPodpiski();
    }

    @И("нажимаем на вкладку активные")
    public void нажимаемНаВкладкуАктивные() {
        basicPage.NazhimaemNaAktivVkladku();
    }

    @И("нажимаем на неактивные")
    public void нажимаемНаНеактивные() {
        basicPage.ubiraemIzAktivnih();
    }

    @И("проверяем значение ссылки")
    public void проверяемЗначениеСсылки() {
        basicPage.proverkaSsilki();
    }


    @И("нажимаем на вкладку все")
    public void нажимаемНаВкладкуВсе() {
        basicPage.nazhimaemNaVse();
    }
}
