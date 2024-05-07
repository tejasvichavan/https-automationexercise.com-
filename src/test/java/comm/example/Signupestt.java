package comm.example;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Signupestt implements Locatorss {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @DataProvider(name = "userData")
    public Object[][] userDataProvider() throws BiffException, IOException {
        String filePath = "C:\\Users\\ABHIJEET\\Desktop\\Data.xls";
        File file = new File(filePath);
        Workbook workbook = Workbook.getWorkbook(file);
        Sheet sheet = workbook.getSheet(0);
        int rows = sheet.getRows();
        Object[][] data = new Object[rows - 1][2];

        for (int i = 1; i < rows; i++) {
            data[i - 1][0] = sheet.getCell(0, i).getContents(); // Username
            data[i - 1][1] = sheet.getCell(1, i).getContents(); // Email
        }
        workbook.close();
        return data;
    }

    @Test(priority = 1)
    public void launchBrowserAndNavigateToURL() {
        driver.get(base_url);
        driver.manage().window().maximize();
    }

    @Test(priority = 2, dataProvider = "userData")
    public void signUp(String username, String email) throws InterruptedException {
        driver.findElement(signupLoginButton).click();
        Thread.sleep(2000);
        driver.findElement(NameForSignup).sendKeys(username);
        driver.findElement(EmailForSignup).sendKeys(email);
        driver.findElement(ClickSignup).click();
        Thread.sleep(2000);

        // Check for email already used error message
        List<WebElement> errorMessages = driver.findElements(By.id("error")); // Update ID as needed
        if (!errorMessages.isEmpty() && errorMessages.get(0).isDisplayed()) {
            System.out.println("Email ID already present: " + email);
            driver.findElement(EmailForSignup).clear(); // Clear and prepare for next input
        } else {
        	FillAccountInfo fillAccountInfo = new FillAccountInfo();
            fillAccountInfo.fill(driver);
            
            VerifyLoggedIn verifyLoggedIn = new VerifyLoggedIn();
            verifyLoggedIn.verify(driver);
            
            System.out.println("Account is got created");
            
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
            
            System.out.println("Loggedout");
        }
    }
    
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
