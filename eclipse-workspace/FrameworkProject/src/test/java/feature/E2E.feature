Feature: HomePage Login

Scenario Outline: Home Page Login	
Given User is on "http://www.qaclickacademy.com" page
When User logins by entering <username> and <password>
Then Home page is populated

Examples:
|username	|password	|
|abc@gmail.com	|abc@123	|
|xyz@gmail.com	|xyz@123	|