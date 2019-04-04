package com.aeonlife.cucumber

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber.class)
@CucumberOptions(plugin = ["pretty", "html:target/cucumber", "json:target/cucumber.json"])
class RunCucumberTest {

}
