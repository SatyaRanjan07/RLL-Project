Feature: Cart Functionality

@Swapnil
Scenario: A user must be able to perform in the Cart

Given a user is in the LandingPage on Firstcry
When he login on firstcry
And he search for Toycars
And he clicks on first result
And he clicks on Add to Cart option
And he clicks on Cart option
And he clicks on quantity
And he clicks on two
And he click on Remove option
Then he must be able to see empty cart