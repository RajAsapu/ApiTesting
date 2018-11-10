@SanboxApiTest
Feature: Validation of the Rest end point

  Acceptance Criteria:
    To verify if the name from sandbox api response is carbon credits
    To verify if the canrelist from sandbox api response is true
    To verify if the promotion element with name gallery has a description as '2x larger image' from sandbox api response

  Scenario:To verify if the name from sandbox api response is carbon credits
    Given  the user has access to sandbox end point
    When   the user hits the sandbox end point
    Then   the response code should be 200
    And    the value of name should be "Carbon credits"

  Scenario:To verify if the canrelist from sandbox api response is true
    Given  the user has access to sandbox end point
    When   the user hits the sandbox end point
    Then   the response code should be 200
    And    the value of canReList should be true

  Scenario:To verify if the promotion element with name gallery has a description as '2x larger image' from sandbox api response
    Given  the user has access to sandbox end point
    When   the user hits the sandbox end point
    Then   the response code should be 200
    And    the value of promotion element with name gallery should have description '2x larger image' in it