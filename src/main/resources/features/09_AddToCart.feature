Feature: User add different products to Shopping cart
  Scenario: add product to cart
    Given Open browser and website
      When clicking on selected categorise
      And  clicking on selected product
    Then  click on add to cart to selected product
