package com.cg.firstdemobdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"},
features = "src/test/resources/Login"
,glue={"src/test/java/com/cg/firstdemobdd/stepdefs"}
)

public class Test_Runner {

}
