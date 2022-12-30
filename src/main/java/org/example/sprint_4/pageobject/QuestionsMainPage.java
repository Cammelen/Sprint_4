package org.example.sprint_4.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionsMainPage {

    public QuestionsMainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;

    public String[] questionsList = {
            "Сколько это стоит? И как оплатить?",
            "Хочу сразу несколько самокатов! Так можно?",
            "Как рассчитывается время аренды?",
            "Можно ли заказать самокат прямо на сегодня?",
            "Можно ли продлить заказ или вернуть самокат раньше?",
            "Вы привозите зарядку вместе с самокатом?",
            "Можно ли отменить заказ?",
            "Я жизу за МКАДом, привезёте?"};


    public String[] answersList = {
            "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
            "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, " +
                    "можете просто сделать несколько заказов — один за другим.",
            "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
                    "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
                    "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
            "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
            "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
            "Самокат приезжает к вам с полной зарядкой. " +
                    "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
            "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
            "Да, обязательно. Всем самокатов! И Москве, и Московской области."};

    public String question;
    public String answer;

    public QuestionsMainPage getQuestionsByCycle() {
        for (int i = 0; i < questionsList.length; i++) {
            question = webDriver.findElement((By.xpath("//*[contains (text(), '" + questionsList[i] + "')]"))).getText();

            webDriver.findElement(By.xpath("//*[contains (text(), '" + questionsList[i] + "')]")).click();
            new WebDriverWait(webDriver, 3)
                    .until(driver -> (driver.findElement(By.xpath("//*[contains (text(), '" + answer + "')]")).getText())).equals(question);

            answer = webDriver.findElement(By.xpath("//*[contains (text(), '" + answersList[i] + "')]")).getText();
            Assert.assertEquals(questionsList[i], question);
            System.out.println("Вопрос: " + questionsList[i]);
            Assert.assertEquals(answersList[i], answer);
            System.out.println("Ответ: " + answersList[i]);
        }
        return this;
    }
}
