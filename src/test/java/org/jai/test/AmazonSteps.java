package org.jai.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSteps {
    @Given("User is on amazon site.")
    public void userIsOnAmazonSite() {
        System.out.println ("Amazon.com");
    }

    @When("User search for the product.")
    public void userSearchForTheProduct() {
        System.out.println ("searching for iPad air wi-fi");
    }

    @And("User select the product from search list.")
    public void userSelectTheProductFromSearchList() {
        System.out.println ("selecting ipad air roseGold color");
    }

    @And("User add that product to the cart.")
    public void userAddThatProductToTheCart() {
        System.out.println ("click on the add to cart button");
    }

    @Then("User verify the product in cart.")
    public void userVerifyTheProductInCart() {
        System.out.println ("click on view cart button and review the product ");
    }
}
