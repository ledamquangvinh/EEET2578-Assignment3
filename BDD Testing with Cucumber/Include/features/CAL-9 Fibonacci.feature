Feature: fibonacci
  I want to use add operator

  Scenario Outline: Fibonacci
    Given I run the code
    When fibonacci number of <a>
    Then I get the result <result> in Long

    Examples:
      | a   | result         |
      | 15  | 610            |
      | 1   | 1              |
      | 0   | 0              |
      | 50  | 12586269025    |

  Scenario Outline: Error Fibonacci
    Given I run the code
    When illegal fibonacci number of <a>
    Then I get the Exception <result>

    Examples:
      | a   | result                                                |
      | -1  | "Fibonacci cannot be calculated for negative numbers" |