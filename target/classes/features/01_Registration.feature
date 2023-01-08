Feature: User could register with valid data
  Scenario: register a new account
      When user navigate to register page
      And  select gender, fill firstname and lastname
      And  choose birthdate day, month, year
      And  insert email, password and confirm password
      And  click on register button
    Then  successful register message appears