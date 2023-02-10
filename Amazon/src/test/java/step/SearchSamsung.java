package step;

import POM.SamsungReuses;
import POM.wrapCart;
import configClass.GLobalLibrary;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchSamsung {
	GLobalLibrary config = new GLobalLibrary();
	SamsungReuses sam;
	wrapCart wc;
	@Given("visit amazon url")
	public void visit_amazon_url() {
	    config.Browser("chrome", "https://www.amazon.in/");
	    config.maxWindow();
	    config.ImpWait(20);
	}
	@Given("visit wrapcart")
	public void visit_wrapcart() {
		config.Browser("chrome", "https://www.wrapcart.com/");
	    config.maxWindow();
	    config.ImpWait(20);
	}
	
	@Then("Click the Hamburger Menu from the Top Left corner")
	public void click_the_hamburger_menu_from_the_top_left_corner() {
	    sam = new SamsungReuses();
	    sam.Menu();
	}
	@Then("Scroll down and click TV,Appliance and Electronics under Shop By Department")
	public void scroll_down_and_click_tv_appliance_and_electronics_under_shop_by_department(){
	    sam.TvSection();
	}
	@Then("Click on Televisions under Tv,Audio and Cameras sub secrion")
	public void click_on_televisions_under_tv_audio_and_cameras_sub_secrion() {
	    sam.tv();
	}
	@Then("Scroll down and filter the result by brand Samsung")
	public void scroll_down_and_filter_the_result_by_brand_samsung() {
	    sam.filterBySamsung();
	}
	@Then("Sort the Samsung results with prive high to low")
	public void sort_the_samsung_results_with_prive_high_to_low() {
	    sam.sorting();
	}

	@Then("Click Second Highest product from the result")
	public void click_second_highest_product_from_the_result() {
	    sam.secondProduct();
	}
	@Then("Switch to the product window")
	public void switch_to_the_product_window() {
	    config.switchWindow();
	}
	@Then("Log the About the Items text in console")
	public void log_the_about_the_items_text_in_console() {
		sam.About();
	}
	@Then("click buy and purchase the item")
	public void click_buy_and_purchase_the_item() {
		System.out.println("dfsdf");
	}
	@And("click card skin")
	public void click_card_skin() {
		wc = new wrapCart();
		wc.selectCardDesign();
	}
	@Then("click first product")
	public void click_first_product() {
		wc = new wrapCart();
		wc.chooseFirstProd();
	}
	@And("Do add cart and buy")
	public void Do_add_cart_and_buy() {
		wc = new wrapCart();
		wc.cartNbuy();
	}
}
