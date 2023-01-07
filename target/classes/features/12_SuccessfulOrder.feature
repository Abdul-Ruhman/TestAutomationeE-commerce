Feature: User create a successful Order
  Scenario: create a successful Order
    Given opening browser and website
      When choose and click on selected categorise
      And  choose and click on selected product
      And  choose and click on add to cart to selected product
      And  click on shopping cart upper page
      And  click on checkbox to agree terms
    Then  click on checkout button
