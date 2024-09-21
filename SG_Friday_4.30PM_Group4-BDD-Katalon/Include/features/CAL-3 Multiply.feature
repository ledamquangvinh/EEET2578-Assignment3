Feature: multiply
  I want to use multiply operator

  Scenario Outline: Multiplication
    Given I run the code
    When <a> multiply <b>
    Then I get the result <result> in Long

    Examples:
      | a   | b   | result |
      | 10  | 20  | 200    |
      | 92  | -19 | -1748  |
      | 12  | -19 | -228   |