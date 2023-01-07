@smoke

Feature: User log in with valid email and password

  #Test Scenario
  Scenario: login with valid email and password
    Given user open browser
      And  user navigate to login page
      When user enter valid email and password
    Then  user click on login button
  #Expected Result
#    Then  user could login successfully
