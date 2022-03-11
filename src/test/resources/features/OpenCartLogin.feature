Feature: Opencart Login function

#Scenario: Valid Login
#When User is on opencart home page
#And User navigates to login page
#Given User login with credentials
#Then User navigate to My Account page

#Scenario: Valid Login
#When User is on opencart home page
#And User navigates to login page
#Given User login with "nancyluthras@yahoo.com" and "Home@001"
#Then User navigate to My Account page

#Scenario Outline: Valid Login
#When User is on opencart home page
#And User navigates to login page
#Given User login with "<email>" and "<password>"
#Then User navigate to My Account page


#Examples:
#|email |password |
#|nancyluthras@yahoo.com|Home@001|
#|nancyluthras@yahoo.com|001|

#DataTable
Scenario Outline: Search Item
When User is on opencart home page
And User navigates to login page
Given User login with credentials
| email | pwd |
| nancyluthras@yahoo.com | Home@001 |
Then User navigate to My Account page
And User Search item
| Phone |


#Scenario: Invalid Login
#When User is on opencart home page
#And User navigates to login page
#Given User login with "nancyluthras@yahoo.com" and "Home@0012"
#Then Should display Error Msg