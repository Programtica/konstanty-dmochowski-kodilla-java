package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_WAIT_FOR = "//select[3]";
    public final static String XPATH_SELECT_DAY = "//div[contains(@class, \"5k_5\")]/span/span/select[1]";
    public final static String XPATH_SELECT_MONTH = "//div[contains(@class, \"5k_5\")]/span/span/select[2]";
    public final static String XPATH_SELECT_YEAR = "//div[contains(@class, \"5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectComboOfTheDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoardOfTheDay = new Select(selectComboOfTheDay);
        selectBoardOfTheDay.selectByIndex(25);

        WebElement selectComboOfTheMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoardOfTheMonth = new Select(selectComboOfTheMonth);
        selectBoardOfTheMonth.selectByIndex(2);

        WebElement selectComboOfTheYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoardOfTheYear = new Select(selectComboOfTheYear);
        selectBoardOfTheYear.selectByValue("1997");
    }
}
