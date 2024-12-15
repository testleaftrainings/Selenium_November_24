package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/features/Login.feature",
glue="stepdefinition",publish=true , monochrome = true,
tags="@dilip and @smoke")



public class LoginWithTags extends ProjectSpecificMethod{

}
