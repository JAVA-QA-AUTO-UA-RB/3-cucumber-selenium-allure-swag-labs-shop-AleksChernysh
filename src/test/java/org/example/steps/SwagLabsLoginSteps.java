package org.example.steps;

import io.cucumber.java.en.*;

public class SwagLabsLoginSteps {

    // Це приклад файлу з визначенням степів, вам треба буде дописати кроки сюди, а також, якщо потрібно,
    // Створити подібні файли для інших сценаріїв
    // Загальна структура проєкту залишається на ваш розсуд, проте бажано, щоб вона була чистою і логічною
    // Перед початком роботи видаліть степдефінішни, які не є релевантними вашому проєкту, щоб вони не плуталися під ногами


    private String username;
    private String password;


    @When("the user enters the username {string} and the  password {string}")
    public void theUserEntersTheUsernameAndThePassword(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Username:" + username + ", Password:" + password);
    }

    @Given("the user is on the log in page")
    public void theUserIsOnTheLogInPage() {
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

    @When("the user enters valid username and password")
    public void theUserEntersValidUsernameAndPassword() {
    }

    @Given("the user is logged")
    public void theUserIsLogged() {
    }

    @And("the user is on the home page")
    public void theUserIsOnTheHomePage() {
    }

    @Then("the system logs out the user, clears the session data, and redirects the user to the login page")
    public void theSystemLogsOutTheUserClearsTheSessionDataAndRedirectsTheUserToTheLoginPage() {
    }

}
