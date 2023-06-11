Feature: Home Test

  Scenario: f2 - scenaior1
    When Login with "testname" and "53255"
    Then Homepage should be displayed


  Scenario Outline:f2 - scenario2
    When 2Login with "<userName>" and "<password>"
    Then 2Homepage should be displayed

    Examples:
      | userName  | password |
      | testName2 | 6564     |



  Scenario: f2 - scenaior3
    When 3Login with credentials
      | testname3    | 878454 |
      | teest343name |4654454 |
    Then 3Homepage should be displayed


  Scenario: f2 - scenaior4
    When 4Login with credentials
      | username     | password |
      | testname3    | 878454   |
      | teest343name | 4654454  |
    Then 4Homepage should be displayed