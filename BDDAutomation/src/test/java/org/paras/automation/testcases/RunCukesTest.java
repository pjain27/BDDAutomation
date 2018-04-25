package org.paras.automation.testcases;

import org.junit.runner.RunWith;

import cucumber.*;
import cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(features= "src.test.resources/org/paras/automation/testcases/LoginTestCases.feature", format = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"})

public class RunCukesTest{

}
