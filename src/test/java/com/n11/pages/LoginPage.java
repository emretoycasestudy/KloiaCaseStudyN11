package com.n11.pages;

import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
   WebDriver driver;
    @FindBy(css = "div.facebook_large.medium")
    public WebElement fbLgnBtn;

    @FindBy(name = "__CONFIRM__")
    public WebElement confirmMsg;

    @FindBy(className = "inputtext _55r1 inputtext inputtext")
    public WebElement fbEmailBtn;

    @FindBy(id="pass")
    public WebElement fbPwBtn;

    @FindBy(name="login")
    public WebElement fbLoginBtn;

    String fbEmail= ConfigurationReader.get("fbemail");
    String fbPassword=ConfigurationReader.get("fbpassword");

    public void signIn(){
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        loginBtn.click();

    }

    public void loginVerify(){

     Assert.assertTrue(driver.findElement(By.partialLinkText("Emre")).isDisplayed());

    }



}
