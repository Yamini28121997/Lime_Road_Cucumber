@Regression
Feature: LimeRoad order

Scenario: To click women button

When User launch the Url "https://www.limeroad.com/"
And User clicks the women button

Scenario: To mousehover women option and select Jean

Given To navigate to womencategory section
When User select women jeanandjeggings options
And Select jean
#And apply filter to sort by trending

Scenario: choosing size and adding to cart

 
When User select specific size 
And Adding jean to cart value

Scenario: Purchase item and enter personal details

Given User clicks buy now for purchasing
When User enters mobile number for otp verification
And User clicks get otp option


Scenario: Personal details updation and payment

Given User enters all personal details
When User clicks confirm order for order placing



