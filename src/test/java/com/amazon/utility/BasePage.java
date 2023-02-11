package com.amazon.utility;

import com.amazon.pages.AmazonMainPage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
   protected WebDriver driver = null;

    @Parameters({"remoteserver", "browsername"})
    @BeforeMethod(alwaysRun = true)
    public void testBeforeMethod(Method method, @Optional("") String remoteserver,
                                 @Optional("chrome") String browsername) throws MalformedURLException {


        //LOG.info("Max # of Retries: " + System.getProperty("max.retry.count"));

        // properties setzen
        System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");


        ChromeOptions chOptions = new ChromeOptions();
        chOptions.addArguments("no-proxy-server");

        // chrome lokal
        if (browsername.startsWith("chrome") && remoteserver.isEmpty())
            driver = new ChromeDriver(chOptions);

        // chrome remote
        if (browsername.startsWith("chrome") && !remoteserver.isEmpty())
            driver = new RemoteWebDriver(new URL(remoteserver), chOptions);

        // exception werfen falls driver undefiniert
        if (driver == null)
            throw new InvalidArgumentException("Selenium Konfiguration fehlerhaft / Driver undefiniert");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Values.DEFAULT_TIMEOUT_SEC));
    }
}