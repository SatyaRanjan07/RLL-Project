Feature: FirstCry Login Automation

@Rani
Scenario: Login to FirstCry
Given a user is in the LandingPage on Firstcry
When user click on the login button
And user enter emailid
And user click on the continue button
And user click the submit button
Then user should be logged in successfully
