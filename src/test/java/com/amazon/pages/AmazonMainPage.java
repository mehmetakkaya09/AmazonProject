package com.amazon.pages;

import com.amazon.utility.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMainPage extends BasePage {

    public AmazonMainPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "icp-nav-flyout")
    public WebElement languageDropDown;
    @FindBy(xpath = "//div[.='Change country/region.']")
    public WebElement changeCountry;
    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    public WebElement changeRegion2class;
    @FindBy(id = "icp-dropdown_18")
    public WebElement turkish2class;
    @FindBy(id = "icp-save-button")
    public WebElement saveButton2class;
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;
    @FindBy(id = "sp-cc-accept")
    public WebElement accept;
    @FindBy(linkText = "Apple iPhone 13 (512 GB) - Yıldız Işığı")
    public WebElement firstIphone;
    @FindBy(xpath = "(//p[@class='a-text-left a-size-base'])[3]")
    public WebElement size512GB;
    @FindBy(xpath = "(//p[@class='a-text-left a-size-base'])[2]")
    public WebElement size256GB;
    @FindBy(xpath = "(//p[@class='a-text-left a-size-base'])[1]")
    public WebElement size128GB;
    @FindBy(xpath = "//div[@id='variation_color_name']//span[@class='selection']")
    public WebElement color;
    @FindBy(xpath = "//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]/span/span[2]/span[1]")
    public WebElement price;
    @FindBy(xpath = "//span[normalize-space(text())='Stokta var.']")
    public WebElement stock;


}
