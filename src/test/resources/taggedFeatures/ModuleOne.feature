@PhaseOne
Feature: Contact and Deal Functions

Background:
Given User must login

@RegressionTest
Scenario: Create new Contact
#Given User must login
When User create a new contact

#@SmokeTest
Scenario: View a contact
#Given User must login
When User view a contact

@IntegrationTest
Scenario: Edit a contact
#Given User must login
When User edit contact details

#@RegressionTest
Scenario: Create new Deal
#Given User must login
When User create a new deal

#@RegressionTest @SmokeTest
Scenario: View a Deal
#Given User must login
When User view deal details

@SmokeTest
Scenario: User logout
#Given User must login
When User Logout from App




