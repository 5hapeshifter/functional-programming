package test;

import functionalInterface.predicate.Rules;
import functionalInterface.supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;
import java.util.function.Predicate;

public class DriverTest {

    private WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("firefox") String browser) {
        this.driver = DriverFactory.getDriver(browser);

    }

//    @Test
//    public void googleTest() {
//        this.driver.get("https://google.com");
//        this.driver.findElements(By.tagName("a"))
//                .forEach(System.out::println);
//    }

    @Test
    public void googleTest() {
        this.driver.get("https://google.com");
        List<WebElement> elements = this.driver.findElements(By.tagName("a"));
//        Predicate<WebElement> isBlank = (e) -> e.getText().trim().length() == 0;
//        Predicate<WebElement> hasS = (e) -> e.getText().toLowerCase().contains("s");

        System.out.println("Before :: " + elements.size());
        //elements.removeIf(isBlank);

        //Aplicando uma lista de regras dos Predicates a uma lista de elementos.
//        Rules.get().forEach(rule -> elements.removeIf(rule));
        Rules.get().forEach(elements::removeIf);

        //chamada encadeada
//        elements.removeIf(isBlank.or(hasS));

        System.out.println("After :: " + elements.size());
        elements.forEach(e -> System.out.println(e.getText()));
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }

}
