Feature: User	Login

  Scenario: Successful Login
    Given the user is on OrangeHRM Page
    When the user enters the valid credentials (Usernmae: "Admin", password: "admin123")
    And the user clicks on the login button
    Then the user redirected to the dashboard page.
