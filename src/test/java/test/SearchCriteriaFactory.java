package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SearchCriteriaFactory {

    private static Predicate<List<WebElement>> allMale = (list) -> list.get(1).getText().equalsIgnoreCase("male");
    private static Predicate<List<WebElement>> allFemale = (list) -> list.get(1).getText().equalsIgnoreCase("female");
    private static Predicate<List<WebElement>> allGender = allFemale.or(allFemale);
    private static Predicate<List<WebElement>> allAU = (list) -> list.get(2).getText().equalsIgnoreCase("AU");
    private static Predicate<List<WebElement>> allFemaleAU = allFemale.and(allAU);

    private static final Map<String, Predicate<List<WebElement>>> MAP = new HashMap<>();

    static {
        MAP.put("allMale", allMale);
        MAP.put("allFemale", allFemale);
        MAP.put("allGender", allGender);
        MAP.put("allAU", allAU);
        MAP.put("allFemaleAU", allFemaleAU);

    }

    public static Predicate<List<WebElement>> getCriteria(String criteriaName) {
        return MAP.get(criteriaName);
    }

}
