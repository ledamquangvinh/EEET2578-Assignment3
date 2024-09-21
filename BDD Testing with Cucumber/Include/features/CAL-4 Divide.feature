Feature: divide
  I want to use divide operator

  Scenario Outline: Division
    Given I run the code
    When <a> divide <b>
    Then I get the result <result> in Double with <precision>

    Examples:
      | a   | b   | result | precision |
      | 10  | 20  | 0.5    | 1         |
      | 222 | 111 | 2.0    | 0         |
      | 132 | 1   | 132.0  | 0         |

  Scenario Outline: Illegal Division
    Given I run the code
    When <a> illegal divide <b>
    Then I get the Exception <result>

    Examples:
      | a   | b   | result                   |
      | 10  | 0   | "Divisor cannot be zero" |