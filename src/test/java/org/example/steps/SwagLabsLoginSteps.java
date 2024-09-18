package org.example.steps;

import io.cucumber.java.en.*;

public class SwagLabsLoginSteps {

    // Це приклад файлу з визначенням степів, вам треба буде допис  ати кроки сюди, а також, якщо потрібно,
    // Створити подібні файли для інших сценаріїв
    // Загальна структура проєкту залишається на ваш розсуд, проте бажано, щоб вона була чистою і логічною

    // Перед початком роботи видаліть степдефінішни, які не є релевантними вашому проєкту, щоб вони не плуталися під ногами
    

    @Given("the user is on the log in page")
    public void theUserIsOnTheLogInPage() {
    }

    @When("the user enters valid username and password")
    public void theUserEntersValidUsernameAndPassword() {
    }

    @And("the user clicks the {string} button")
    public void theUserClicksTheButton(String arg0) {
    }

    @Then("the user should be redirected to the homepage")
    public void theUserShouldBeRedirectedToTheHomepage() {
    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
    }

    @When("the user enters a non-existent username and password")
    public void theUserEntersANonExistentUsernameAndPassword() {
    }

    @Then("there should appear the text {string} on the page")
    public void thereShouldAppearTheTextOnThePage(String arg0) {
    }

    @And("user is locked out")
    public void userIsLockedOut() {
    }

    @Given("the user is logged")
    public void theUserIsLogged() {
    }

    @And("the user is on the home page")
    public void theUserIsOnTheHomePage() {
    }

    @Then("the system displays a message {string}")
    public void theSystemDisplaysAMessage(String arg0) {
    }

    @Given("the user sees the confirmation message,")
    public void theUserSeesTheConfirmationMessage() {
    }

    @When("the user selects the {string} button,")
    public void theUserSelectsTheButton(String arg0) {
    }

    @Then("the system logs out the user, clears the session data, and redirects the user to the login page.")
    public void theSystemLogsOutTheUserClearsTheSessionDataAndRedirectsTheUserToTheLoginPage() {
    }

    @Then("the system closes the confirmation message, and the user remains on the homepage.")
    public void theSystemClosesTheConfirmationMessageAndTheUserRemainsOnTheHomepage() {
    }
}
