package test;

import functionalInterface.supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class DriverTest {

    private WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("firefox") String browser) {
        this.driver = DriverFactory.getDriver(browser);

    }

    @Test
    public void googleTest() {
        this.driver.get("https://google.com");
        this.driver.findElements(By.tagName("a"))
                .forEach(System.out::println);
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }

}
