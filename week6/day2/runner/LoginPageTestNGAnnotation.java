package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/features/Login.feature",
glue={"stepdefinition"},publish=true , monochrome = true)

//public - basic report of cucumber
//monochrome- it will remove the junk values

public class LoginPageTestNGAnnotation extends ProjectSpecificMethod{

}
