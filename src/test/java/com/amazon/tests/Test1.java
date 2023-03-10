package com.amazon.tests;

import com.amazon.pages.AmazonMainPage;
import com.amazon.utility.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class Test1 extends BasePage {
    Actions actions;
    AmazonMainPage page;
    @BeforeMethod
    public void setUp() {
        page = new AmazonMainPage();
        //actions = new Actions(driver);
    }

    @Test
    public void test1() {
        driver.get("https://www.amazon.com/");
//        actions.moveToElement(page.languageDropDown).build().perform();
//        page.changeCountry.click();
//        page.changeRegion2class.click();
//        page.turkish2class.click();
//        page.saveButton2class.click();
//        Set<String> windowHandles = driver.getWindowHandles();
//        for (String windowHandle : windowHandles) {
//            if (!windowHandle.equals(driver.getWindowHandle())) {
//                driver.switchTo().window(windowHandle);
//                break;
//            }
//        }
        page.searchBox.sendKeys("iphone13 512"+ Keys.ENTER);
        page.accept.click();
        page.firstIphone.click();
        WebElement size =null;
        String GB = "512";
        if (GB.equals("512")) {
            size=page.size512GB;
        } else if (GB.equals("256")) {
            size=page.size256GB;
        }else if (GB.equals("128")) {
            size=page.size128GB;
        }
        size.click();

        WebElement color = page.color;
        WebElement price = page.price;
        WebElement stock = page.stock;
        if (color.getText().equalsIgnoreCase("Yıldız Işığı")) {
            System.out.println("color = " + color.getText());
        } else {
            System.out.println(size.getText() +" "+ color.getText()+ " bulunmaktadır. Ancak 'Yıldız ışığı' rengi mevcut değildir!");
        }
        System.out.println("price = " + price.getText());
        System.out.println("stock = " + stock.getText());

    }


}
