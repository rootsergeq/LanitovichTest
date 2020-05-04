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

    @И("Поиск случайной темы и нажимаем на неё")
    public void поискСлучайнойТемыИНажимаемНаНеё() {
        basicPage.poiskRandomnoyTemi();
    }

    @И("Нажимаем на ответить")
    public void нажимаемНаОтветить() {
        basicPage.nazimaemNaOtvetit();
    }

    @И("Вводим интересный текст \"(.+)\"")
    public void вводимИнтересныйТекст(String text) {
        basicPage.vvodimInteresniText(text);
    }

    @И("нажимаем отправить ответ")
    public void нажимаемОтправитьОтвет() {
        basicPage.NazhimaemOtpravitOtvet();
    }

    @И("проверяем отображение сообщения в теме \"(.+)\"")
    public void проверяемОтображениеСообщенияВТеме(String text) {
        basicPage.proverkaOtobrazheniaSoobxhenia(text);
    }

    @И("переходим на вкладку Темы")
    public void переходимНаВкладкуТемы() {
        basicPage.perehodNaVkladkuTemi();
    }
}
