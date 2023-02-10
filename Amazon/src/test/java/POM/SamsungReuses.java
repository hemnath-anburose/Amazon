package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configClass.GLobalLibrary;

public class SamsungReuses extends GLobalLibrary{
	public SamsungReuses() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//a[@id='nav-hamburger-menu']")
	private static WebElement hamburgerMenu;
	@FindBy(xpath = "//div[text()='TV, Appliances, Electronics']")
	private static WebElement tvSectionElement;
	@FindBy(xpath = "//a[text()='Televisions']")
	private static WebElement tvElement;
	@FindBy(xpath = "//span[text()='Samsung']")
	private static WebElement filetSamsung;
	@FindBy(xpath = "//span[text()='Sort by:']")
	private static WebElement sortBtn;
	@FindBy(xpath = "//a[text()='Price: High to Low']")
	private static WebElement highToLow;
//	@FindBy(xpath = "//div[@data-cel-widget=\"MAIN-SEARCH_RESULTS-2\"]/descendant::a/child::div")
	@FindBy(xpath = "//img[@data-image-index='2']")
	private static WebElement secondProduct;
	@FindBy(xpath = "//h1[text()=' About this item ']/following::ul")
	private static WebElement aboutThis;
	@FindBy(xpath = "//input[@id='buy-now-button']")
	private static WebElement buyMe;
	
	public static WebElement getHamburgerMenu() {
		return hamburgerMenu;
	}
	public static WebElement getSecondProduct() {
		return secondProduct;
	}
	public static WebElement getAboutThis() {
		return aboutThis;
	}
	public static WebElement getTvSectionElement() {
		return tvSectionElement;
	}
	public static WebElement getTvElement() {
		return tvElement;
	}
	public static WebElement getFiletSamsung() {
		return filetSamsung;
	}
	public static WebElement getSortBtn() {
		return sortBtn;
	}
	public static WebElement getHighToLow() {
		return highToLow;
	}
	
	public void Menu() {
		getHamburgerMenu().click();
	}
	public void TvSection() {
		getTvSectionElement().click();
	}
	public void tv() {
		getTvElement().click();
	}
	public void filterBySamsung() {
		getFiletSamsung().click();
	}
	public void sorting() {
		getSortBtn().click();
		getHighToLow().click();
	}
	public void secondProduct() {
		getSecondProduct().click();
	}
	public void About() {
		System.out.println(getAboutThis().getText());
	}
}
