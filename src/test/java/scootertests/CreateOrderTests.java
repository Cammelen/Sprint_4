package scootertests;

import org.example.sprint_4.pageobject.MainPage;
import org.example.sprint_4.pageobject.OrderPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class CreateOrderTests extends TestBase {

    public final String name;
    public final String lastName;
    public final String station;
    public final String numberPhone;
    public final String comment;
    public final String choiceData;

    public CreateOrderTests(String name, String lastName, String station, String numberPhone,
                            String comment, String choiceData) {
        this.name = name;
        this.lastName = lastName;
        this.station = station;
        this.numberPhone = numberPhone;
        this.comment = comment;
        this.choiceData = choiceData;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Орландо", "Брутович", "Черкизовская", "+7111111111", "Хочу самокат", "30.12.2022"},
                {"Князь", "Фандорин", "Лубянка", "+7881211111", "Хочу в будущее", "30.06.2024"},
        };
    }

    @Test
    public void checkHeaderOrder() {

        new MainPage(driver)
                .open()
                .clickHeaderOrderButton();

        OrderPage headerButton = new OrderPage(driver);
        driver.findElement(headerButton.nameOrder).sendKeys(name);
        driver.findElement(headerButton.lastNameOrder).sendKeys(lastName);
        driver.findElement(headerButton.stationOrder).sendKeys(Keys.DOWN, station, Keys.RETURN);
        driver.findElement(headerButton.numberPhoneOrder).sendKeys(numberPhone);
        driver.findElement(headerButton.nextStepOrderButton).click();
        driver.findElement(headerButton.commentOrder).sendKeys(comment);
        driver.findElement(headerButton.choiceDataOrder).sendKeys(choiceData, Keys.ENTER);
        driver.findElement(headerButton.listDaysOrder).click();
        driver.findElement(headerButton.amountDaysOrder).click();
        driver.findElement(headerButton.colorOrder).click();
        driver.findElement(headerButton.orderButton).click();
        driver.findElement(headerButton.yesOrderButton).click();

        boolean isDisplayedOrder = driver.findElement(headerButton.foundTrack).isDisplayed();
        assertTrue(isDisplayedOrder);
    }

    @Test
    public void checkFooterOrder() {

        new MainPage(driver)
                .open()
                .scrollMainPage()
                .clickFooterOrderButton();

        OrderPage headerButton = new OrderPage(driver);
        driver.findElement(headerButton.nameOrder).sendKeys(name);
        driver.findElement(headerButton.lastNameOrder).sendKeys(lastName);
        driver.findElement(headerButton.stationOrder).sendKeys(Keys.DOWN, station, Keys.RETURN);
        driver.findElement(headerButton.numberPhoneOrder).sendKeys(numberPhone);
        driver.findElement(headerButton.nextStepOrderButton).click();
        driver.findElement(headerButton.commentOrder).sendKeys(comment);
        driver.findElement(headerButton.choiceDataOrder).sendKeys(choiceData, Keys.ENTER);
        driver.findElement(headerButton.listDaysOrder).click();
        driver.findElement(headerButton.amountDaysOrder).click();
        driver.findElement(headerButton.colorOrder).click();
        driver.findElement(headerButton.orderButton).click();
        driver.findElement(headerButton.yesOrderButton).click();

        boolean isDisplayedOrder = driver.findElement(headerButton.foundTrack).isDisplayed();
        assertTrue(isDisplayedOrder);
    }
}

