Feature: search, add to favorite list
  @Task2
  Scenario: search and favorite list function
    Given the user on the login page
    When log in with facebook credentials
    And the user navigate to Kozmetik & Kisisel Bakim and Parfum & Deodorant
    And the user enter the brand filter Lacoste and select
    And select seventh product on the search result page
    And add product to favorites
    And navigate to favorites
    Then product title is the same as with the product details page