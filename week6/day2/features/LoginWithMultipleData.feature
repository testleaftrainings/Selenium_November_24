Feature: Login With Multiple Data for LeafTaps Applications

Scenario Outline: Login with Multiple data
#Given Launch the browser and Load the Url
When Enter the username as <UserName>
And Enter the password as <PassWord>
And Click on LoginButton
Then Verify Login is Successful

Examples:
|UserName|PassWord|
|'Democsr'|'crmsfa'|
|'Democsr2'|'crmsfa'|
|'Demosalesmanger'|'crmsfa'|

Scenario Outline: Login with Multiple data
#Given Launch the browser and Load the Url
When Enter the username as <UserName>
And Enter the password as <PassWord>
And Click on LoginButton
Then Verify Login is Successful

Examples:
|UserName|PassWord|
|'Democsr'|'crmsfa'|
|'Democsr2'|'crmsfa'|
|'Demosalesmanger'|'crmsfa'|