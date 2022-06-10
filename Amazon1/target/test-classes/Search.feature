Feature: Search functionality
@tag1
  Scenario Outline: Search the product
  	Given browser opened and url is navigated
		When I search for product as "<Product>"
    And user should click on the product
    When user should click on wishlist 
    Then user should click on view your list
    And user should click on add to cart