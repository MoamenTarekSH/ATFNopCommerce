@tag
Feature: User Can Register Successfully
  I want to use this template for my feature that user could register in my website

  Scenario Outline: User Registration
    Given I in home page
    When i clicl on register link
    And i entered my data to register page "<firstname>","<lastname>","<email>","<pass>","<conpass>"
    Then the registration page displayed successfully

    Examples: 
      | firstname | lastname | email          | pass    | conpass |
      | moamen    | tarek    | demo@gmail.com | 1234560 | 1234560 |
