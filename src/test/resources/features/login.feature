Feature: Free CRM Login Feature f
  Scenario: Free CRM Login Test 
    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters "naveenk" and "test@123"
    Then user clicks on login button
    Then user is on home page
