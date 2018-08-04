import Web.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import rstudio_con.LoginPage;

public class LoginPageTest {

    WebDriver driver = BrowserFactory.RunBrowser("Chrome");
    LoginPage signup = PageFactory.initElements(driver, LoginPage.class);


    @Test
    public void Sign_in(){
        driver.get("https://rstudio.cloud/");
        WebDriverWait wait= new WebDriverWait(driver, 10);
        signup.login("", " ");
    }


}
