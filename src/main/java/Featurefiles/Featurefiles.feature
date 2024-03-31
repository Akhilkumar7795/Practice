Feature: User Login

Scenario: As a user i want to Successfully login into application
Given User is on the application home page
When User enters email and password credentials (username: "test@gmail.com", password: "test@123")
And User clicks on login button
Then User redirects into the application Myaccount page
And User should see the welcome message displayed
