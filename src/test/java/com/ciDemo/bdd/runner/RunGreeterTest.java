package com.ciDemo.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "com.ciDemo.bdd.steps",
        features = "classpath:cucumber/helloWorld.feature")

public class RunGreeterTest {

}
