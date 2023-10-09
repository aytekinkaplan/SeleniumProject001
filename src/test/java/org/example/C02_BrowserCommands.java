package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowserCommands {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");
        driver.get("https://www.trendyol.com/");
        driver.get("https://www.ebay.com/");

        String amazonTitle = driver.getTitle();
        System.out.println("amazonTitle = " + amazonTitle); //amazonTitle = Amazon.com. Spend less. Smile more.

        String amazonUrl = driver.getCurrentUrl();
        System.out.println("amazonUrl = " + amazonUrl); //amazonUrl = https://www.amazon.com/

        driver.close();
    }
}
