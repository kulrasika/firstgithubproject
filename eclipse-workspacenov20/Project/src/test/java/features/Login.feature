Feature: Application Login

Scenario: Home Page Login	
Given User is on landing page
When User logins by entering username as "jim" and password as "123"
Then Home page is populated
And Cards are displayed