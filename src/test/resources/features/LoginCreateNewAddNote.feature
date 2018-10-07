Feature: Sign-in and create a new note

    Scenario: Sign in successfully
        When I open test app website
        And I click login
        And I login with username "testuser@example.com" and password "test123"
        Then I am at Home page
        When I click on Add Note button
        And I enter text "Test note" to title field
        And I enter text "Test note" to description field
        And I click on Add Note button
