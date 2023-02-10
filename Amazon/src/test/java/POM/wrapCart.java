package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configClass.GLobalLibrary;

public class wrapCart extends GLobalLibrary{
	public wrapCart() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'CARD SKINS')]/parent::a")
	private static WebElement cardSkin;
	@FindBy(xpath = "(//span[contains(text(),'Cyber Card - Yellow')]/parent::a)[1]")
	private static WebElement prodOne;
	@FindBy(xpath = "//select[@id='select-1']")
	private static WebElement cardType;
	@FindBy(xpath = "//select[@id='select-2']")
	private static WebElement cardShape;
	@FindBy(xpath = "(product-add-to-cart)[1]")
	private static WebElement addCart;
	public static WebElement getCardSkin() {
		return cardSkin;
	}
	public static WebElement getProdOne() {
		return prodOne;
	}
	public static WebElement getCardType() {
		return cardType;
	}
	public static WebElement getCardShape() {
		return cardShape;
	}
	public static WebElement getAddCart() {
		return addCart;
	}
	
	public static  void selectCardDesign() {
		getCardSkin().click();
	}
	public static void chooseFirstProd() {
		getProdOne().click();
	}
	public static void cartNbuy() {
		selectDD(getCardType(),"Debit Card");
		selectDD(getCardShape(), "Rectangle Chip");
		getAddCart().click();
	}
}
