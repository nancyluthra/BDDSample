@PhaseTwo
Feature: Task Functions

@RegressionTest
Scenario: Create new Task
Given User must login
When User create a new Task

Scenario: View a Task
Given User must login
When User view a Task

@SmokeTest
Scenario: Edit a Task
Given User must login
When User edit Task details


