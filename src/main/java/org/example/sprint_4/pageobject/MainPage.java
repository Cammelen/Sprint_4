package org.example.sprint_4.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private final WebDriver webDriver;

    private By headerOrderButton = By.className("Button_Button__ra12g");
    private By footerOrderButton = By.className("Home_FinishButton__1_cWm");

    public MainPage clickHeaderOrderButton() {
        webDriver.findElement(headerOrderButton).click();
        return this;
    }

    public MainPage clickFooterOrderButton() {
        webDriver.findElement(footerOrderButton).click();
        return this;
    }

    public MainPage open() {
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
        return this;
    }

    public MainPage scrollMainPage() {
        WebElement importantQuestions = webDriver.findElement(By.className("accordion"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", importantQuestions);
        return this;
    }
}
