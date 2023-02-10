
Feature: Wrapcart
  
  Background: open the site
  Given visit wrapcart

	
  @wrap
  Scenario: buy the product
  
  And click card skin 
  Then click first product
  And Do add cart and buy
   
    
  

  