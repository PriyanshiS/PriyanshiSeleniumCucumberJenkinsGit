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
    }


    




    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username= userName;
            password = passWord;
        }
    }

}
