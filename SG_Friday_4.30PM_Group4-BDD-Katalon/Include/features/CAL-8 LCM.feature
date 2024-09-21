Feature: lcm
  I want to use LCM operator

  Scenario Outline: LCM
    Given I run the code
    When <a> lcm <b>
    Then I get the result <result>

    Examples:
      | a   | b   | result |
      | 4   | 6   | 12     |
      | 222 | 111 | 222    |

  Scenario Outline: Illegal LCM
    Given I run the code
    When <a> illegal lcm <b>
    Then I get the Exception <result>

    Examples:
      | a   | b   | result                   |
      | 0   | 0   | "LCM(0, 0) is undefined" |