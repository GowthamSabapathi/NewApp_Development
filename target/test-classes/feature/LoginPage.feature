Feature: LoginPage for Facebook

  Scenario: Enter the valid username and password
    Given Launch the Browser
    And Enter the URL
    When Enter the username "Aiite"
    And Enter the password "A45AA"
    And Enter the loginbutton
    Then Validate the HomePage
