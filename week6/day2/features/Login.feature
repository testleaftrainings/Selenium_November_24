Feature: LeafTaps Login Functionality

#common steps all the Scenario 
#Background:
#Given Launch the browser and Load the Url

#tag -name -> @Name

@smoke @dilip
Scenario: Check with Positive Data
When Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then Verify Login is Successful

@regression @smoke
Scenario: Check with Negative Data
When Enter the username as 'Demo'
And Enter the password as 'crmsfa'
And Click on LoginButton
But Verify Login is not Successful

@dilip
Scenario: Check with Positive1 Data
When Enter the username as 'DemoCsr'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then Verify Login is Successful




#DuplicateStepDefinitionException