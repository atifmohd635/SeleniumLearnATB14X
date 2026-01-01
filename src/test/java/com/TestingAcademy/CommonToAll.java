package com.TestingAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonToAll {
    public ChromeDriver driver;

    public void OpenBrowser(WebDriver driver, String Url){
        driver.get(Url);
        driver.manage().window().maximize();
    }
    public void closeBrowser(WebDriver driver) throws InterruptedException {

        Thread.sleep(5000);
        driver.quit();
    }
}
