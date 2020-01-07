package tests;

import cucumber.api.java.en.When;

import static tests.PageProvider.getLoginPage;

public class LoginTest {

    @When("^I input email as (.*) and password as (.*)$")
    public void setUserInformation(String email, String password) throws InterruptedException {
        getLoginPage().setEmail(email);
        Thread.sleep(1000);
        getLoginPage().setPassword(password);
        Thread.sleep(1000);
    }

    @When("^I click submit$")
    public void clickLogin() {
        getLoginPage().clickLogin();
    }

}
