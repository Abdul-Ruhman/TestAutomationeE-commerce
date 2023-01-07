Feature: User search for any product
  Scenario: search for a product
    Given Open browser then website
      When write product in search box
    Then click search button
