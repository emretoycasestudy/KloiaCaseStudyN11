package com.n11.stepDefinitions;

import com.n11.pages.LoginPage;
import com.n11.utilities.BrowserUtils;
import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.Set;

public class loginStepDefs {
    LoginPage loginPage=new LoginPage();
    String currentWindowHandle = Driver.get().getWindowHandle();

    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
    loginPage.signIn();
    }

    @When("log in with facebook credentials")
    public void log_in_with_facebook_credentials(){
        String fbEmail= ConfigurationReader.get("fbemail");
        String fbPassword=ConfigurationReader.get("fbpassword");
        loginPage.fbLgnBtn.click();
        BrowserUtils.waitFor(4);

        Set<String> windowHandles = Driver.get().getWindowHandles();
        for (String handle : windowHandles) {
            if(!handle.equals(currentWindowHandle)){
                Driver.get().switchTo().window(handle);
            }
        }
        BrowserUtils.waitFor(4);
        Driver.get().findElement(By.id("email")).sendKeys(fbEmail);
        Driver.get().findElement(By.id("pass")).sendKeys(fbPassword, Keys.ENTER);
        BrowserUtils.waitFor(3);
        Driver.get().switchTo().window(currentWindowHandle);


    }

    @Then("verify the user should be able to login")
    public void verify_the_user_should_be_able_to_login() {

        loginPage.loginVerify();
    }
}
