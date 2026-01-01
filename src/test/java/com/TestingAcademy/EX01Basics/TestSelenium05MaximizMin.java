package com.TestingAcademy.EX01Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium05MaximizMin {

    @Test
    public void MaxMIn() throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //Assert.assertEquals(driver.getTitle(), "Login - VWO");
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://app.vwo.com/#/login");
        driver.close();
    }
}
