week7.day2:

Today's Agenda:
02:30 - 03:30 -> POM with Cucumber
03:30 - 04:10 -> Breakout
04:10 - 05:20 -> POM with Multi Lingual
05:20 - 05:50 -> Breakout+Break
05.50 - 06:30 -> Extent Report

TestNG with POM:

Driver- static
Constructor call in each page -> seq and parallel



Cucumber with POM:
 - Create 4 packages
     - base
        Create BaseClass with common methods
        BaseClass should extend AbstractTestNGCucumberTests
     - features
         Create feature files
     - pages
        Create classes for each page and each page should extend BaseClass
     - runner
        Create CucumberRunner class and , mention glue="pages"
        The runner class should extend BaseClass
		
		
For TestNG:
if driver - > static
   only sequential execution is possible

For both sequential and parallel execution:
   Create constrcutor in each of the pages  by removing static keyword from base class


For Cucumber:
In cucumber with POM - constructor is not allowed
io.cucumber.core.exception.CucumberException: class pages.LoginPage does not have a public zero-argument constructor.
if driver - > static
   only sequential execution is possible 
   
   
If you want to have a hybrid framework combination of both TestNG + Cucumber

ThreadLocal
 It is a class in java for thread safety
 InSide BaseClass:
Steps: 1. private static final ThreadLocal<RemoteWebDriver> cDriver = 
new ThreadLocal<RemoteWebDriver>();

 private:
   It can be accessed only within the class
 static final:
    static+final = constant
 ThreadLocal:
   It is a class that provides thread-local variable

2. Use setter and getter methods
     Sets the current thread's copy of this thread-local variable
      public void setDriver(String browser){
      if(browser.equalIgnoreCase("Chrome")) {
	cDriver.set(new ChromeDriver());
      }
      else if(browser.equalIgnoreCase("Edge")){

      cDriver.set(new EdgeDriver());
      }
}
 Returns the value in the current thread's copy of this thread-local variable   
public RemoteWebDriver getDriver() {
	return cDriver.get();
}

@BeforeMethod
public void precondition(){

  setDriver();
  then replace driver variable into getDriver()
  getDriver().manage.window.max();
}

For TestNG _POM : - with driver as static -> sequential execution is possible
 - To have sequential and parallel execution declare Parameterized Constructor in each pages

For Cucumber_POM: 
- Constructor should not be defined 
- With driver as static 
-> sequential execution is possible



POM with ThreadLocal:

Thread safety when working with variable ina multithreaded environment .
it allows you to store and retrieve values that are specific to the current thread,

-Java Class to create variable which can be used to read and write within a single thread. 
ThreadLocal implementation of Webdriver will support TestNG parallel execution and cucumber

DisAdvantage:

As the constructor call is not allowed in cucumber
To acheive parallel execution without constructor in cucumber

==============================

To support both cucumberand TestNG

---supportsequential execution of both TestNG and cucumber

--not able to use for parallel executionof TestNG because cucumber is not supporting driver to be passed inthe constructor.

Add ThreadLocalclass in Basecall method 
private static final ThreadLocal<RemoteWebDriver> tldriver=new ThreadLocal<RemoteWebDriver>();


ThreadLocal:
Java class which is used to access each thread independently
 private static final ThreadLocal chDriver = new ThreadLocal();
private: - This variable can be accessed only within the class static+final
 - constant -> cannot change the value

private static final ThreadLocal<RemoteWebDriver> tldriver=new ThreadLocal<RemoteWebDriver>();

public void setDriver() {
    //Sets the current thread's copy of this thread-local variable
	chDriver.set(new ChromeDriver());
}

public ChromeDriver getDriver() {
    //Returns the value in the current thread's copy of this thread-local variable
	return chDriver.get();
}

add setDriver() method to @BeforeMethod

Remove the constructor from all the pages

Change the 'driver' to 'getDriver()'  in all the actions in the pages
Encapsulation:
 - getter and setter methods



 
Extent Report:


<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>3.1.5</version>
</dependency>

is a widely used reporting framework

1.screen shot 
2.information based testcase
3.pic,graph and relevant details
4.stauts pass or fail

step1 :
set path for the report ExtentHtmlReporter
ExtentHtmlReporter wb= new ExtentHtmlReporter("./report/loginReport.html");
step2:
Create object for ExtentReports
ExtentReports repo=new ExtentReports();
step3:
attach the data with physical file (combine step1 and step2)
repo.attach(wb);
step4:
create testcase and adding details about testcase(tc name,tc desp,category,author)
testcasename
testdc
category
author

step5:
step level status(fail,pass)
pubic void enterUsername(){
driver.findElement(By.id("username")).sendKeys("democsr);
}

test.pass(EnterUsername+ snap shot);
test.pass(enterpassword + snap shot)
test.fail(click loginButton + snap shot)

step6:
mandatory close report
flush();
close the extentreports
repo.flush();