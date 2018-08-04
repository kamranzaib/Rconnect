import Web.BrowserFactory;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import rstudio_con.Create_Space;
import rstudio_con.LoginPage;
import rstudio_con.ProjectIDE;

import java.util.concurrent.TimeUnit;

public class CreateSpaceTest {

    WebDriver driver = BrowserFactory.RunBrowser("Chrome");
    LoginPage signup = PageFactory.initElements(driver, LoginPage.class);
    Create_Space creating = PageFactory.initElements(driver, Create_Space.class);
    ProjectIDE pjtIDE = PageFactory.initElements(driver, ProjectIDE.class);


    @Test(priority = 1)
    public void space() throws InterruptedException {
        driver.get("https://rstudio.cloud/");
        signup.login("", "");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        creating.createSpace();
        Thread.sleep(5000);
        pjtIDE.createProject();
        Thread.sleep(20000);
        pjtIDE.IDEverify();


    }

}