
Feature: User able to login with valid username and password
Scenario: User login with valid username, password varify the page

Given User able to open any browser 
And User able to enter the URL

When User able to click on Signin button
And User able to enter the Username 
And User able to enter the PW
And User able to click on submit button

Then User able to login in susscessfully
And User able to verify the page title


Feature: User able to login with valid username and password
Scenario Outline: User login with valid username, password varify the page

Given User able to open any browser 
And User able to enter the "http://automationpractice.com/index.php"

When User able to click on Signin button
And User able to enter the <Username>
And User able to enter the <PW>
And User able to click on submit button

Then User able to login in susscessfully
And User able to verify the page title

Examples:

|URL                                    |Username            |PW        |
|http://automationpractice.com/index.php|j4inul1993@gmail.com|j@inul1993|
|www.yahoo.com                          |j4inul@ymail.com    |jainul123 |
