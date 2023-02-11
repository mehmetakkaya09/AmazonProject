package com.amazon.tests;

import com.amazon.utility.BasePage;
import com.amazon.utility.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.lang.module.Configuration;

public class Test2 extends BasePage {


    @Test
    public void test2() {
        driver.get(ConfigurationReader.getProperty("URL"));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");




    }


}
