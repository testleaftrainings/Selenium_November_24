 Hybrid Framework: 
===========================
	This framework is designed based on Page Object Model. 
	We used Selenium WebDriver to interact with Web application, 
	TestNg is used for test execution. 
	Apache POI to read the data from excel to support multiple data testing. 
	Cucumber is used to support the BDD approach and 
	Extent report is used to get a html automation summary report.


What are the components:
=====================
1. Browser and Element interfaces to design this framework
2. SeleniumBase is the library for the Wrapper methods (implemented the interfaces)
3. ProjectSpecificMethods as Base class having common methods specific to the project
4. pages package to have the classes for each page
5. Testcases package to have the classes for each test case
6. Utils package to have the classes related to external applications
	DataLibrary(to read data from excel)
	Reporter(Configuration for ExtentReport)
7.Feature	

Hirerarchy of Classes in the framework:
========================================
AbstractTestNGCucumberTests
	DriverInstance
		Reporter
		  	SeleniumBase
				ProjectSpecificMethods
					Pages & Testcases
Execution Flow:
===============
@BeforeSuite --> Reporter (startReport)
	@BeforeTest --> TestCase class (setValues)
		@BeforeClass --> Reporter (report)
			@DataProvider --> ProjectSpecificMethods
				@BeforeMethod --> ProjectSpecificMethods
					@Test --> TestCase class
				@AfterMethod --> ProjectSpecificMethods
		@AfterClass --> No Method
	@AfterTest --> No Method
@AfterSuite	--> Reporter(stopReport)



com.leafBot.pages
com.leafBot.selenium.api.base
com.leafBot.selenium.api.design
com.leafBot.TestCase
com.leafBot.testng.api.base
utils


*utils
*pages
*Testcases
*testngbase


Example framework 
OOPS:

Method OverLoading:
startApp(String url ,boolean headless)
startApp(String browser, String url , boolean headless)

locateElement(Locators data,String value)
locateElement(String value)


Abstraction:
Interface- Browser, Element
Abstract Class - Reporter
Execution Class -SeleniumBase

class SeleniumBase extends Reporter implements Browser, Element

Encapsulation:

ThreadLocal for Driver
getter and Setter 

Inheritance:

PSM extends SeleniumBase -simple 






Load the url
Enter the username
enter the password
click on login button
click on crmsfa
click on leads


Top  Challenges that I faced during automation [STAR Approach - Situation Task Action Result]:

1) Stale Element Reference Exception

Situation: While automating 400+ tests and running them using Selenium Grid, I noticed several tests failing with Stale Element Reference exception and this caused lot of rework in the test automation project. 

Task: Have to find the rootcause of this problem and fix it [Not having deeper understanding] !! 

Root Cause: When the element was looked for its presence by findElement, the element was there. But it got disappeared, when you were about to interact with the element - sendKeys, click, clear !! 

Action: 

Option 1) Either add sleep statement before find the element [How long?]
Best Option) Whenever there is stale element reference exception, find the element again !! 

Result:

This solved most of the common failures and the test automation results were helpful to speed up the testing efforts !! You are awarded 'STAR Award' !!



2) Xpath Challenges due to dynamic application changes

Situation: XPath keep breaking to dynamic element introduction or deletion in the given page or back of the screen

Task: Find a common approach that can solve changing DOM element causing failures

Action: Built an XPath based on unqiue screen or window name and from there -> traverse to the label denoting the element -> and then traverse to the exact element by its index helped to solve these dynamic changing problems / Used Chrome extensions like Ruto to assist on XPath auto generation

Result: Saved lot of time and saved the script from failing changing DOM elements



//input[@id='username'] - value is changing - Sibling xpath
//label[text()='Username']/following-sibling::input


//input[@id='username'] - tag name is changing  = use '*'
//*[@id='username']



3) Upload file using WD  

Situation: In my application, in multiple places - we had uploading files and unfortunately, the Selenium WebDriver does not support the windows or MAC elements (as it can only talk to browser), so we could not automate these well. 

Task: Find workaround or solution that can asist to automate such uploads !!

Action:

Solution 1: Using java.awt.Robot -> Keyboard or mouse action to interact with Windows (You cannot run in parallel)
Solution 2: Using Sikuli / AutoIt -> Record the windows element and help you to upload (Very flaky)
Solution 3: Using file upload through input element //input[@type='file'] and send the file location and file name using sendKeys

This works when you have multiple parallel execution and/or when executed in multiple machines and also when running in hidden mode

Result: You could automate more scenarios without failures due to selenium non-support


4)Enhance framework with dynamic test data

Situation: We are using Excel to keep the data. Which is providing static data to the test cases. Client has raised this a concern as data whatever we create using automation looks like junk data in data base

Task: I was asked to implement dynamic data for the test cases

Action: I have explored APIs and libraries to dynamic data  and implemented faker one of the java library. Faker is very simple and easy to implement in our framework. 

Result: Data created using Faker is dynamic and looks like real data.








