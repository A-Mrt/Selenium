package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/aleksandramichnowicz/Desktop/repozytoria/Selenium/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.w3schools.com/xml/xpath_syntax.asp");
        //*[@id="accept-choices"]
        driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();
    }
}