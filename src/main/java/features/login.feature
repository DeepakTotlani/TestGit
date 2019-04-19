Feature: Free CRM Login Actions

Scenario: Login with valid credentials

Given user is already on login page
When title of login page is Free CRM
Then user enter username and password
Then user clicks on login button
Then user is home page
