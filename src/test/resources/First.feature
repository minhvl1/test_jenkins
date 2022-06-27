Feature: Register,Login and create cv
  Background: create uuid
    Given print uuid

  Scenario: register
    Given go to topcv
    When register
    And logout
    Then Login
    And Create CV
    And Input data to CV
    And Show CV