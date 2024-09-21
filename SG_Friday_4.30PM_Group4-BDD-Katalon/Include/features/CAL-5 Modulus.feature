Feature: modulus
  I want to use modulus operator

  Scenario Outline: Modulation
    Given I run the code
    When <a> modulus <b>
    Then I get the result <result> in Double with <precision>

    Examples:
      | a   | b   | result | precision |
      | 10  | 20  |  10.0  | 0         |
      | 222 | 111 |  0.0   | 0         |

  Scenario Outline: Illegal Modulation
    Given I run the code
    When <a> illegal modulus <b>
    Then I get the Exception <result>

    Examples:
      | a   | b   | result                   |
      | 10  | 0   | "Modular cannot be zero" |