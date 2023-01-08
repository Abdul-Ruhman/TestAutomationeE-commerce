Feature: User reset his/her password successfully
  Scenario: reset password
      When  navigate to login page
      And   click on forget password
      And   insert email
      And   click on recover button
    Then  confirm send to mail message appears