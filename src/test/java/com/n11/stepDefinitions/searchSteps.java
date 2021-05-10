package com.n11.stepDefinitions;

import com.n11.pages.NavigationPage;
import com.n11.pages.PerfumePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {
   NavigationPage navigationPage=new NavigationPage();
   PerfumePage perfumePage=new PerfumePage();

    @When("the user navigate to Kozmetik & Kisisel Bakim and Parfum & Deodorant")
    public void the_user_navigate_to_Kozmetik_Kisisel_Bakim_and_Parfum_Deodorant() {
        navigationPage.navigateCategory();

    }

    @When("the user enter the brand filter Lacoste and select")
    public void the_user_enter_the_brand_filter_Lacoste_and_select() {
       perfumePage.searchProduct();
    }
    @When("select seventh product on the search result page")
    public void select_seventh_product_on_the_search_result_page() {

   perfumePage.selectProduct();

    }

    @When("add product to favorites")
    public void add_product_to_favorites() {

        perfumePage.addFavorite();
    }

    @When("navigate to favorites")
    public void navigate_to_favorites() {

   perfumePage.navigateToFavorite();
    }

    @Then("product title is the same as with the product details page")
    public void product_title_is_the_same_as_with_the_product_details_page() {
        perfumePage.verifyTitle();
    }

}
