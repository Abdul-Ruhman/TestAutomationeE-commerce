Feature: User add different products to Wishlist
  Scenario: add product to wishlist
    Given Open browser and the website
      When click on chosen categorise
      And  click on chosen product
    Then  click on add to wishlist icon to selected product
