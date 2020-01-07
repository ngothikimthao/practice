package tests;

import cucumber.api.java.en.Given;
import runner.TestRunner;

public class CommonTest {

    @Given("^Open website (.*)$")
    public static void user_already_on_home_page(String website) throws InterruptedException {
        TestRunner.driver.get(website);
        Thread.sleep(1000);
        TestRunner.driver.manage().window().maximize();
        Thread.sleep(1000);
    }

}
