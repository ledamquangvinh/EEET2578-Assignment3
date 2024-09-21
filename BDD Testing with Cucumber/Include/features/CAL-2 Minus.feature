Feature: minus
  I want to use minus operator

  Scenario Outline: Subtraction
    Given I run the code
    When <a> minus <b>
    Then I get the result <result>

    Examples:
      | a   | b   | result |
      | 10  | 20  | -10    |
      | 222 | 111 | 111    |
      | 100 | -78 | 178    |