Feature: Automate Amazon India

Background: 
	Given visit amazon url

Scenario: Perfom the amazon task
		
	Then Click the Hamburger Menu from the Top Left corner
	And  Scroll down and click TV,Appliance and Electronics under Shop By Department
	Then Click on Televisions under Tv,Audio and Cameras sub secrion
	And  Scroll down and filter the result by brand Samsung
	Then Sort the Samsung results with prive high to low
	And Click Second Highest product from the result
	Then Switch to the product window
	And Log the About the Items text in console


