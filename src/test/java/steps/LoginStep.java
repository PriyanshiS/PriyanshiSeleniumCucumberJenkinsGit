package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginStep extends BaseUtil{

    private  BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }


    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

        System.out.println("Navigate Login Page");
        //base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
		base.Driver.navigate().to("http://integration-tms.mobeewave-hive.com/#/login");
		Thread.sleep(2000);
		WebElement id = base.Driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form[1]/div[2]/input"));
		id.isDisplayed();
		Thread.sleep(4000);
		WebElement password = base.Driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form[1]/div[3]/input"));
		password.isDisplayed();
		Thread.sleep(4000);
		WebElement loginB = base.Driver.findElement(By.id("login"));
		loginB.isDisplayed();
		System.out.println("The Admin text box is there " + id.isDisplayed());
		System.out.println("The password text box is there " + password.isDisplayed());
		System.out.println("The Login Button is there " + loginB.isDisplayed());
		
		WebElement usernametext = base.Driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form[1]/div[2]/input"));
		usernametext.sendKeys("priyanshi.mobeewave@gmail.com");
		Thread.sleep(2000);
		WebElement passwordtext = base.Driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form[1]/div[3]/input"));
		passwordtext.sendKeys("test123test");
		Thread.sleep(2000);
		WebElement loginTab  = base.Driver.findElement(By.xpath("//*[@id=\"login\"]"));
		loginTab.click();
    }


}
