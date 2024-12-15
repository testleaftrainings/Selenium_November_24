Week6.day2

Todays Agenda: 
02:30 - 03:30 -> Parameterization 
03:30 - 03:50 -> Breakout 
03:50 - 04:00 -> Break
04:00 - 04:45 -> Hooks Implementation
04:45 - 05:10 -> Breakout+Break
05:10 - 05:40 -> Tags
05:40 - 05:50 -> Break
05:50 - 06:20 -> Explict Wait
06:20 - 06:40 -> Breakout



Parameterization:
Static -
We need Pass the value inside the single quotes = 'DemoSalesManager'
'crmsfa' in the feature file

When Enter the  UserName as 'DemoSalesManager'

Steps package:
@Given("Enter the Username as {string}")
Enter the Username(String uname){
Driver.findElement(by.name("username").sendKeys(uname);
}



How to pass multiple data using Scenario Outline and Examples :
1. To pass multiple data for a single scenario the Gherkins keyword used is Scenario Outline
2. In Scenario Outline identify the dynamic data and replace that with <>

When Enter the username as <username>
And Enter the password as <password>

And Enter the CompanyName as <comName>

3. Under Examples keyword create pipeline symbol and mention the column name
   ex: |username|passowrd|comName|
   Note: The name should exactly match
    -Pass the values in the second row of Examples
    ex: |'TestLeaf'|'Dilip'|'Hcl'| (1st set of data)
        |'Qeagle'|'Dilip'|   (2nd set of data)
                                                     
4.Go to the Step Definition and replace <companyName> with {string}-only string
5.Pass Input arguments to the method and replace the hardcoded value withe the argument   




Hooks Implementation: Before TestNG intro
   Cucumber Annotations - > Hooks in Ruby Language
   its run before the scenario and after scenario
   Hooks:
       @Before :
          -is to have common precondition for each scenario
        @After : 
           - is to have common postcondition for each scenario


Steps to implement Hooks:
*Create a package called hooks and create a class called HooksImplementation
*Create 2 methods preCondition() and postCondition() and annotate with @Before and @After
*The Hooks class should extends BaseClass or PSM
*Add code inside precondition and postcondition and command out line feature file
*In the Runner class inside glue attribute mention hooks package as well glue ={"steps","hooks"}


io.cucumber.java.InvalidMethodException: 
	You're not allowed to extend classes that define Step Definitions or hooks. 
  class stepDefinition.CreateLeadSD extends class stepDefinition.Hooks



BaseClass:
Step-1 Add TestNG Annotation BeforeMethod and AfterMethod
Step-2 And copy code and paste inside perCondition and postCondition
Step-3 Command the common line in the feature file and steps package(launch browser and load url)
Step-4 Extends -> Runnerclass to BaseClass
BaseClass extends AbstractTestNGCucumberTests
Step-5 And executed from the runnerclass


Tags:
It is used to categorize the scenarios

tags="@smoke" )// only smoke scenarios will be executed 
tags="not @smoke")// it will exclude asmoke scenario  from execution
tags="@smoke or @functional") // To run scenarios that have either of the tags
tags="@functional and @regression" ) //To run scenarios which has both the tags