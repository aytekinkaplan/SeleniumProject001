package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW001 {

    /*
Create main method
Set Path
Create chrome driver
Open google home page: https://www.google.com
Get Title on page
Get Current URL on page
Close/Quit the browser
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        String googleTitle = driver.getTitle();
        System.out.println("googleTitle = " + googleTitle);

        String googleUrl = driver.getCurrentUrl();
        System.out.println("googleUrl = " + googleUrl);

        driver.close();

    }
}
