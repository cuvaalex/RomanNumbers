package com.codingdojo.romannumbers.stories.steps;

import com.codingdojo.romannumbers.RomanUtil;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class NumberToRomanSteps {

    private RomanUtil converter = new RomanUtil();
    private int number = 0;

    @Given("I have a simple <number>")
    public void iHaveASimpleNumber(int number) {
        this.number = number;
    }

    @When("I press convert to Roman")
    public void iPressConvertToRoman() {

    }

    @Then("I get <roman>")
    public void iGetResult(String roman){
        assertThat(converter.toRoman(number), equalTo(roman));
    }

}
