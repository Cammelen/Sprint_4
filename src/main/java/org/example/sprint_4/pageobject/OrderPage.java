package org.example.sprint_4.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {

    public OrderPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;

    public By nameOrder = By.xpath("//input[@placeholder='* Имя']");
    public By lastNameOrder = By.xpath("//input[@placeholder='* Фамилия']");
    public By stationOrder = By.xpath("//input[@placeholder='* Станция метро']");
    public By numberPhoneOrder = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    public By nextStepOrderButton = By.xpath("//*[contains(text(), 'Далее')]");
    public By commentOrder = By.xpath("//input[@placeholder='Комментарий для курьера']");
    public By choiceDataOrder = By.xpath("//input[@placeholder='* Когда привезти самокат']");
    public By listDaysOrder = By.xpath("//*[@aria-haspopup='listbox']");
    public By amountDaysOrder = By.xpath("//*[contains(text(), 'сутки')]");
    public By colorOrder = By.xpath("//*[contains(text(), 'чёрный жемчуг')]");
    public By orderButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public By yesOrderButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and contains(text(), 'Да')]");
    public By foundTrack = By.xpath("//*[@class='Button_Button__ra12g Button_Middle__1CSJM' and contains(text(), " +
            "'Посмотреть статус')]");
}
