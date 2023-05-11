@Regression @homepage
Feature: Test homepage for Luma
  Background: Check homepage is loaded
    Given I am on the Luma homepage
    Then I can see homepage is loaded

  Scenario: create an account
    When I click on sign-in link
    Then I can see sign-in form
    When I click on create account
    And I fill up the create account
    Then I check account is created


  Scenario: check sign-in error
    When I click on sign-in link
    Then I can see sign-in form
    When I enter the login detail
    Then I check user is not logged in

