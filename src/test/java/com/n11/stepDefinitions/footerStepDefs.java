package com.n11.stepDefinitions;

import com.n11.pages.FooterPage;
import com.n11.utilities.BrowserUtils;
import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class footerStepDefs {
    FooterPage footerPage=new FooterPage();
    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.scrollToElement(footerPage.footer);
    }

    @When("the user write all the links to the text file")
    public void the_user_write_all_the_links_to_the_text_file() {


    }

    @When("the user click to Brands")
    public void the_user_click_to_Brands() {
        footerPage.footerList();
    }

    @Then("verify the links with the text file")
    public void verify_the_links_with_the_text_file() {
        Assert.assertTrue(footerPage.getActualTitle().contains("Markalar"));
    }

}
