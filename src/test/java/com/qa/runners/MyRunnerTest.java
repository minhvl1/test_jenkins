package com.qa.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber","summary"}
        ,features = {"src/test/resources"}
        ,glue = {"com.qa.stepdef"}
//        ,tags= "@scenario1"
        ,snippets = CAMELCASE
)
public class MyRunnerTest {

}
