package comm.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyLoggedIn implements Locatorss {
    public void verify(WebDriver driver) {
        driver.findElement(ContinueButton).click();
        String usernm = driver.findElement(UserName).getText();
        System.out.println("Logged in User: " + usernm);
    }
}
