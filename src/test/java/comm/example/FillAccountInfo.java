package comm.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FillAccountInfo implements Locatorss{
    public void fill(WebDriver driver) throws InterruptedException {
        driver.findElement(Password).sendKeys("Test123");
        new Select(driver.findElement(DOBDay)).selectByVisibleText("11");
        new Select(driver.findElement(DOBMonth)).selectByVisibleText("August");
        new Select(driver.findElement(DOBYear)).selectByVisibleText("2000");
        Thread.sleep(2000);
        driver.findElement(CheckNewsletter).click();
        driver.findElement(CheckSpecialOffers).click();
        Thread.sleep(2000);
        driver.findElement(EnterFirstName).sendKeys("MyFirst");
        driver.findElement(EnterLastName).sendKeys("MavenProgram");
        driver.findElement(CompanyName).sendKeys("TestNG");
        driver.findElement(Address).sendKeys("101, Noida");
        driver.findElement(Address2).sendKeys("202, Delhi");
        new Select(driver.findElement(SelectCountry)).selectByVisibleText("Canada");
        driver.findElement(EnterState).sendKeys("Maharashtra");
        driver.findElement(EnterCity).sendKeys("Nashik");
        driver.findElement(EnterZipCode).sendKeys("323211");
        driver.findElement(EnterMobileNo).sendKeys("1234567898");
        driver.findElement(CreateAccButton).click();
        Thread.sleep(2000);
    }
}
