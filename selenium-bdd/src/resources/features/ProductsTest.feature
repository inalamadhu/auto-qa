@Regression
Feature: Product Test

  Background:
    Given Access the URL "http://www.google.com"

  @Smoke
  Scenario: f3 - scenaior1
    When Login with "testname" and "53255"
    Then Homepage should be displayed

  @Sanity
  Scenario Outline:f3 - scenario2
    When 2Login with "<userName>" and "<password>"
    Then 2Homepage should be displayed

    Examples:
      | userName  | password |
      | testName2 | 6564     |


  @Sanity
  Scenario: f3 - scenaior3
    When 3Login with credentials
      | testname3    | 878454 |
      | teest343name |4654454 |
    Then 3Homepage should be displayed

  @Smoke
  Scenario: f3 - scenaior4
    When 4Login with credentials
      | username     | password |
      | testname3    | 878454   |
      | teest343name | 4654454  |
    Then 4Homepage should be displayed