Feature: power
  I want to use power operator

  Scenario Outline: Exponentiation
    Given I run the code
    When <a> to the power of <b>
    Then I get the result <result> in Double with <precision>

    Examples:
      | a  | b  | result   | precision |
      | 10 | 5  | 100000.0 | 0         |
      | 8  | 3  | 512.0    | 0         |

  Scenario Outline: Negative Exponentiation
    Given I run the code
    When <a> to the power of <b>
    Then I get the result <result> in Double with <precision>

    Examples:
      | a   | b    | result     | precision |
      | 10  | -5   | 0.000001   | 5         |
      | 27  | -3   | 0.00000508 | 8         |

  Scenario Outline: Error Exponentiation
    Given I run the code
    When illegal <a> to the power of <b>
    Then I get the Exception <result>

    Examples:
      | a  | b   | result                              |
      | 0  | -10 | "Undefined for 0^(negative number)" |