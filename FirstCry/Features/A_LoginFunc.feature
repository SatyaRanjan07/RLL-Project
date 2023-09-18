Feature: FirstCry Login Automation

@Rani
Scenario: Login to FirstCry
Given a user is in the LandingPage on Firstcry
When user click on the login button
And user enter valid emailid
And user click on the continue button
And user click the submit button
And user should be logged in successfully
And user again go to login page
And enter invalid emailid
Then user cant login and screenshot is generated