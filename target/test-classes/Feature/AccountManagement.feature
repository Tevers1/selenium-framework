@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using valid email address
    Given  I am on create an account page
    When I enter "<FirstName>" "<LastName>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then My account page is displayed



    Examples:
      | FirstName | LastName | Email                 | Password   | ConfirmPassword |
      | Daniel    | Campbell | daniel2camp@gmail.com | Daniel123£ | Daniel123£      |


    @SignIn
  Scenario Outline: Account Login - Registered Customer to Login with username and password
    Given I am on Account Sign in
    When I enter "<Email>" "<Password>"
    And I click on sign in
    Then My sign in page displayed


    Examples:
      | Email                | Password |
      | daniel2camp@gmail.com | Daniel123£  |