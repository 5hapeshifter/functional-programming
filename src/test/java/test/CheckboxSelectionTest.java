package test;

import com.google.common.util.concurrent.Uninterruptibles;
import functionalInterface.supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import pages.TableDemoPage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

public class CheckboxSelectionTest {

    private WebDriver driver;
    private TableDemoPage tableDemoPage;

//    Predicate<List<WebElement>> allMale = (list) -> list.get(1).getText().equalsIgnoreCase("male");
//    Predicate<List<WebElement>> allFemale = (list) -> list.get(1).getText().equalsIgnoreCase("female");


    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("firefox") String browser) {
        this.driver = DriverFactory.getDriver(browser);
        this.tableDemoPage = new TableDemoPage(driver);
    }

//    @Test(dataProvider = "gender")
//    public void googleTest(String gender) {
//        this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
//        //this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table-1.html"); // whith empty tr - throw exception
//        this.driver.findElements(By.tagName("tr")) // rows
//                .stream()
//                .skip(1)
//                .map(tr -> tr.findElements(By.tagName("td"))) // td List
//                .filter(tdList -> tdList.size() == 4) // verifying content list is not empty
//                .filter(tdList -> tdList.get(1).getText().equalsIgnoreCase(gender))// gender
//                .map(tdList -> tdList.get(3)) // td containing checkbox
//                .map(td -> td.findElement(By.tagName("input")))
//                .forEach(WebElement::click);
//
//        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
//    }

    /*
       Outra forma de fazer o método acima
     */
    @Test(dataProvider = "criteriaProvider")
    public void tableRowTest(Predicate<List<WebElement>> searchCriteria) {
        tableDemoPage.goTo();
        tableDemoPage.selectRows(searchCriteria);
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
    }

    @DataProvider(name = "criteriaProvider")
    public Object[] testdata() {
        Predicate<List<WebElement>> allMale = (list) -> list.get(1).getText().equalsIgnoreCase("male");
        Predicate<List<WebElement>> allFemale = (list) -> list.get(1).getText().equalsIgnoreCase("female");
        Predicate<List<WebElement>> allGender = allFemale.or(allFemale);
        return new Object[]{
                allMale,
                allFemale,
                allGender
        };
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }
}
