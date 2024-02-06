 Feature: Amazon Shopping Site
 Scenario: Search Functionality of Amazon
Given Open Browser "https://www.amazon.in/"
	When User Enters Searchs the product
	Then User should Specify the Product
	And Click on rhe product