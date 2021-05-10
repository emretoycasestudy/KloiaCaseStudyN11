
Feature: Task1 Login Functionality

  @Task1
  Scenario: Login with facebook credentials
    Given the user on the login page
    When log in with facebook credentials
    Then verify the user should be able to login

