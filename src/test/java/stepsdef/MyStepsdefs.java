package stepsdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.messages.Messages;
import processes.Hooks;

import java.io.IOException;

import static processes.Process.*;

public class MyStepsdefs {


    @Given("I access the endpoint {string} {string}")
    public void iAccessTheEndpoint(String endpoint, String endpointtype)  {
        Hooks.storeendpoint(endpoint,endpointtype);
    }


    @Given("I access the url {string}")
    public void iAccessTheUrl(String endpoint)  {
        Hooks.gotourl(endpoint);
    }




    @And("headers are {string} {string}")
    public void headersAre(String endpoint, String endpointtype) {
        Hooks.storeheader(endpoint,endpointtype);
    }

    @When("I send the request {string} {string}")
    public void iSendTheRequest(String body, String endpointtype) throws IOException {
        Hooks.storebody(body,endpointtype);
    }
    @Then("I should be able to get status code of {int} {string}")
    public void iShouldBeAbleToGetStatusCodeOf(int statuscode, String endpointtype) {
        sendotp(statuscode,endpointtype);
    }

    @And("my body should have the right response body")
    public void myBodyShouldHaveTheRightResponseBody() {
    }

    @And("my validateotp body should have the right response body")
    public void myValidateotpBodyShouldHaveTheRightResponseBody() {
    }


    @Then("I should be able to get status code of {int} {string} on validateotp")
    public void iShouldBeAbleToGetStatusCodeOfOnValidateotp(int endpoint, String endpointtype) {
        validateotp(endpoint,endpointtype);
    }

    @And("parameters are {string} {string}")
    public void parametersAre(String parameters, String endpointtype) {
        Hooks.storeparameters(parameters,endpointtype);
    }

    @Then("I should be able to get status code of {int} {string} on authorize")
    public void iShouldBeAbleToGetStatusCodeOfOnAuthorize(int statuscode, String endpointtype) {
        authorizeotp(statuscode,endpointtype);
    }

    @Then("I should be able to get status code of {int} {string} on getfaq")
    public void iShouldBeAbleToGetStatusCodeOfOnGetfaq(int statuscode, String endpointtype) {
        getfaq(statuscode,endpointtype);
    }

    @When("I send the get request")
    public void iSendTheGetRequest() {
    }


    @Given("I access the website {string}")
    public void iAccessTheWebsite(String url) {
        Hooks.gotourl(url);
    }

    @And("I Navigates to personal-banking menu on the home page")
    public void iNavigatesToPersonalBankingMenuOnTheHomePage() {

        Hooks.accessheaders();
    }

    @When("I Click the Cards Sub-menu")
    public void iClickTheCardsSubMenu() {


    }

    @And("scroll down to the bottom of the Cards page.")
    public void scrollDownToTheBottomOfTheCardsPage() {
    }

    @And("I Click Tell Me More button on Platinum Card")
    public void iClickTellMeMoreButtonOnPlatinumCard() {
    }

    @And("I Identify the form requesting user information and fill in all the necessary information in the form fields.")
    public void iIdentifyTheFormRequestingUserInformationAndFillInAllTheNecessaryInformationInTheFormFields() {
    }

    @And("I Check the CAPTCHA")
    public void iCheckTheCAPTCHA() {
    }

    @Then("I should be able to get all texts")
    public void iShouldBeAbleToGetAllTexts() {
    }
//    getrequestforStatusCode


}

