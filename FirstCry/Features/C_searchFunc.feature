Feature: Test the Search Functionality


@TC_001
Scenario: Verify the search results of Items
Given a user is in the LandingPage on Firstcry
When he login
And he search for Watches
Then he must be able to see the Silicone Spiky Sporty Analogue Watch item successfully.

#@TC_002
#Scenario: Verify the search results of Jackets
And he search for Jackets
Then he must be able to see the Kookie Kids Full Sleeves Hoodie item successfully.

#@TC_003
#Scenario: Verify the search results of Shirts
And he search for Shirts
Then he must be able to see the Pine Kids Cotton Roll Up Full Sleeves Check Shirt item successfully.

#@TC_004
#Scenario: Verify the search results of Pants
And he search for Pants
Then he must be able to see the Babyhug Denim Full Length Stretchable Washed Jogger item successfully.