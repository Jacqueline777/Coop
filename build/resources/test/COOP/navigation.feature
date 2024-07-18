Feature: Cooperative interview

@coop
Scenario: Navigation through the headers
  Given I access the website "https://www.co-opbank.co.ke/"



  Scenario: Form Submission
    Given I access the website "https://www.co-opbank.co.ke/"
    And I Navigates to personal-banking menu on the home page
    When I Click the Cards Sub-menu
    And scroll down to the bottom of the Cards page.
    And I Click Tell Me More button on Platinum Card
    And I Identify the form requesting user information and fill in all the necessary information in the form fields.
    And I Check the CAPTCHA
    Then I should be able to get all texts