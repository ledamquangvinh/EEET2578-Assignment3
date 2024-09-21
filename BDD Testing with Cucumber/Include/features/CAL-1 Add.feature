Feature: add
    I want to use add operator

    Scenario Outline: Addition
       Given I run the code
       When <a> plus <b>
       Then I get the result <result>

       Examples:
          | a   | b   | result |
          | 10  | 20  | 30     |
          | 123 | 456 | 579    |
          | 177 | 13  | 190    |