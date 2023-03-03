package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitionCalculator {

    private int operator1;
    private int operator2;
    private int result;

    @Given("The two operators are of the value two")
    public void iCanEnterTwoOperators() {
        operator1 = 2;
        operator2 = 2;
    }

    @When("I enter for each operator a two")
    public void IEnterForEachOperatorATwo() {
        result = Calculator.addition(operator1, operator2);
    }

    @Then("I should get {string}")
    public void iShouldGetFour(String expectedResult) {
        assertEquals(Integer.parseInt(expectedResult), result);
    }

}
