package actions.commons;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LocatorTest {
    BasePage basePage = new BasePage();
    @Test
    public void testGetByLocatorWithId() {

        String locatorType = "xpath=//input[@id='FirstName']";
        By by = basePage.getByLocator(locatorType);
        Assert.assertEquals(By.xpath("//input[@id='FirstName']"), by);
    }

    @Test
    public void testGetByLocatorWithName() {
        String locatorType = "name=example";
        By by = basePage.getByLocator(locatorType);
        Assert.assertEquals(By.name("example"), by);
    }
}
