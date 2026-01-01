package com.TestingAcademy.EX02Basics;

import com.TestingAcademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumProject1 extends CommonToAll {

    @Test
    @Description("Verify that particular text exists on webPage")
    public void testVerifyText() throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        OpenBrowser(driver, "https://app.vwo.com/#/login");
        Thread.sleep(5000);
        if(driver.getPageSource().contains("Sign in to VWO platform")){
            System.out.println("✓ Test case is Passed");
            Assert.assertTrue(true);
        }else{
            System.out.println("✖ Test case is Fail");
            Assert.assertTrue(false);
        }
        CloseBrowser(driver);

    }
}
