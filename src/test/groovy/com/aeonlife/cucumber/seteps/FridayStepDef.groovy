package com.aeonlife.cucumber.seteps

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import static org.junit.Assert.assertEquals

class FridayStepDef {

    private String today;
    private String actualAnswer;

    @Given('^today is Sunday$')
    void today_is_Sunday() {
        today = 'Sunday'
        System.out.println('run run run')
    }

    @When('^I ask whether it\'s Friday yet$')
    void i_ask_whether_is_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today)
    }

    @Then('^I should be told \"([^\"]*)\"$')
    void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer)
    }

}

class IsItFriday {
    static String isItFriday(String today) {
        return "Nope"
    }
}
