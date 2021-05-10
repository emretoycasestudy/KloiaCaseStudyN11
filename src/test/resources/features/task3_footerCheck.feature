Feature: Writing the links to the text file
  @Task3
  Scenario: Brands links verification from the text file
    Given the user is on the main page
    When the user write all the links to the text file
    And the user click to Brands
    Then verify the links with the text file
