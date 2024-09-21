Feature: gcd
  I want to use GCD operator

  Scenario Outline: GCD
    Given I run the code
    When <a> gcd <b>
    Then I get the result <result>

    Examples:
      | a   | b   | result |
      | 92  | 312  | 4     |
      | 222 | 111 | 111    |

  Scenario Outline: Illegal GCD
    Given I run the code
    When <a> illegal gcd <b>
    Then I get the Exception <result>

    Examples:
      | a   | b   | result                   |
      | 0   | 0   | "GCD(0, 0) is undefined" |