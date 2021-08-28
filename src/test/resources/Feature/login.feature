Feature: Login functionality
@incorrectusername
Scenario: Checking for incorrect username and password
Given Load the url
When enter the username
And enter the password
Then click the login button
Then I should see the login page


@correctPassword
Scenario: Checking for incorrect username and correct password
Given Load the url
When enter the username
And enter the password
Then click the login button
Then I should see the login page