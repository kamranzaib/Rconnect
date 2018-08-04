package rstudio_con;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectIDE {

    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div[2]/div/div/div[1]/div[1]/div/span/button/span")
    WebElement Projetbutton;

    @FindBy(xpath ="//*[@id=\"leftSide\"]/div[3]")
    WebElement IDE;

    // custom x path for top module of IDE for verification
    //but doesnt seem to work either
    @FindBy(xpath = "//*[@class='gwt-MenuBar gwt-MenuBar-horizontal GC1LDUECCR GC1LDUECFS'] ")
    WebElement IDE2;

    public ProjectIDE(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void createProject() {

        Actions actions = new Actions(driver);
        actions.moveToElement(Projetbutton).click().perform();


    }

    public void IDEverify(){

        String ide;

        ide = IDE.getText();
        System.out.println(ide);







    }

}


