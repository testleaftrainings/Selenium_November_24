package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/features",
glue={"stepdefinition","hooks"},publish=true , monochrome = true)

//public - basic report of cucumber
//monochrome- it will remove the junk values

public class LoginPageHooks extends AbstractTestNGCucumberTests{

}

//io.cucumber.java.InvalidMethodException: You're not allowed to extend classes that define Step Definitions
//or hooks. class stepdefinition.LoginStep extends class hooks.HooksImplementation