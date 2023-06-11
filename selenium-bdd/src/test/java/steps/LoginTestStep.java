package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class LoginTestStep {
    @Given("Access the URL {string}")
    public void access_the_url(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Access the url "+string);
    }
    @When("Login with {string} and {string}")
    public void login_with_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login with "+string+" and "+string2);
    }
    @Then("Homepage should be displayed")
    public void homepage_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Homepage should be displayed");
    }

    @Given("2Access the URL {string}")
    public void access_the_url2(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Access the url "+string);
    }
    @When("2Login with {string} and {string}")
    public void login_with_and2(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login with "+string+" and "+string2);
    }
    @Then("2Homepage should be displayed")
    public void homepage_should_be_displayed2() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Homepage should be displayed");
    }


    @Given("3Access the URL")
    public void access_the_url3(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Access the url "+dataTable.asLists().get(0).get(0));
    }
    @When("3Login with credentials")
    public void login_with_credentials(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        List<List<String>> list = dataTable.asLists();
        System.out.println("Login with "+list.get(0).get(0)+" and "+list.get(0).get(1));
        System.out.println("Login with "+list.get(1).get(0)+" and "+list.get(1).get(1));

    }
    @Then("3Homepage should be displayed")
    public void homepage_should_be_displayed3() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Homepage should be displayed");
    }


    @Given("4Access the URL")
    public void access_the_url4(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Access the url "+dataTable.asLists().get(0).get(0));
    }
    @When("4Login with credentials")
    public void login_with_credentials4(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        List<Map<String, String>> list = dataTable.asMaps();
        System.out.println("Login with "+list.get(0).get("username")+" and "+list.get(0).get("password"));
        System.out.println("Login with "+list.get(1).get("username")+" and "+list.get(1).get("password"));

    }
    @Then("4Homepage should be displayed")
    public void homepage_should_be_displayed4() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Homepage should be displayed");
    }





}
