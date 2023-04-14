Feature: Automated End2End Tests
Description: The purpose of this feature is to test End 2 End integration.

Scenario: Customer place an order by purchasing an item from search women bottoms pants

	Given user is on Home Page
	When he search for "pants"
	And choose to buy the first item
	And moves to checkout from mini cart
	And enter personal details on checkout page
	Then place the order 