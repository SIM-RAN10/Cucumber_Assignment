
@SignUp
Feature: Sign Up


  @positive
  Scenario: To validate the sign up functionality.
    Given Open browser, enter Instagram url.
    When user enters all mandatory fields
    And user clicks the signup button
    Then Successful sign up message should be displayed

 # @tag2
 # Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
 #   When I check for the <value> in step
 #  Then I verify the <status> in step

   # Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
