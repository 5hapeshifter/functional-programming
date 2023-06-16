package test;

import com.google.common.util.concurrent.Uninterruptibles;
import functionalInterface.supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class CheckboxSelectionTest {

    private WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("firefox") String browser) {
        this.driver = DriverFactory.getDriver(browser);

    }

    @Test(dataProvider = "gender")
    public void googleTest(String gender) {
        this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
        this.driver.findElements(By.tagName("tr")) // rows
                .stream()
                .skip(1)
                .map(tr -> tr.findElements(By.tagName("td"))) // td List
                .filter(tdList -> tdList.get(1).getText().equalsIgnoreCase(gender))// gender
                .map(tdList -> tdList.get(3)) // td containing checkbox
                .map(td -> td.findElement(By.tagName("input")))
                .forEach(WebElement::click);

        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
    }

    @DataProvider(name = "gender")
    public Object[] testdata() {
        return new Object[]{
                "male",
                "female"
        };
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }
}
