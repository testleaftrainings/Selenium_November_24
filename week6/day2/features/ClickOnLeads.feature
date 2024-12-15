Feature: Click on Leads Button

Scenario: verify Leads Button is clicked
When Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then Verify Login is Successful
When Click on crmsfa link
And Click on Leads Button
Then Verify the leads clicked