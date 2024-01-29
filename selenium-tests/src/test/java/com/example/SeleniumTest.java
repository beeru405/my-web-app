package com.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    @Test
    public void testWebApp() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the web application
        driver.get("http://localhost:8080/my-web-app/");

        // Perform Selenium actions if needed
        driver.findElement(By.id("elementId")).click();
        driver.findElement(By.name("username")).sendKeys("yourUsername");
         // Add more actions as needed

        // Close the browser
        driver.quit();
    }
}
