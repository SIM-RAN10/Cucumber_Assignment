@Simple 
Feature: Simple Form Submission
 

  @positive
  Scenario: To validate the Simple form functionality
    Given open the browser, enter the Simple form url
    When user enters the valid first name
    And user enters the valid last name
    And user enters the valid email
    And user enters the valid contact number
    And user enters a message in the message field
    Then user clicks on the submit button
    And Thank you message should be displayed

 # @tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
   # When I check for the <value> in step
    #Then I verify the <status> in step

 #   Examples: 
 #     | name  | value | status  |
  #    | name1 |     5 | success |
  #    | name2 |     7 | Fail    |
