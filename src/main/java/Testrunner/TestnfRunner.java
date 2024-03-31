package Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\Featurefiles",glue="Stepdefinitions",monochrome=true)
public class TestnfRunner extends AbstractTestNGCucumberTests  {

}
