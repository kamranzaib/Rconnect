package rstudio_con;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.utilities.Assert;

public class Create_Space {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"navPanel\"]/div[1]/div[3]/div[1]/div[2]/div[2]")
    WebElement newSpace;

    @FindBy(id = "members")
    WebElement membrs;

    @FindBy(id = "projects")
    WebElement proj;

    @FindBy(id = "message")
    WebElement brief;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[4]/div/div/form/div[3]/button")
    WebElement requestbutton;


    public Create_Space(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createSpace() {
        newSpace.click();
        membrs.clear();
        membrs.sendKeys("30");
        proj.clear();
        proj.sendKeys("120");
        brief.sendKeys("this is a test");
        requestbutton.click();

    }

}