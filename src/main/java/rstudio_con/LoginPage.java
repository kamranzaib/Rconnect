package rstudio_con;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"currentUser\"]/div/div[1]/div/a[1]")
    WebElement login;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement Pass;

    @FindBy(xpath = "/html/body/div/div/div/form[1]/button")
    WebElement button;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void login(String logemail, String passlog){
        login.click();
        email.sendKeys(logemail);
        Pass.sendKeys(passlog);
        button.click();

    }




}
