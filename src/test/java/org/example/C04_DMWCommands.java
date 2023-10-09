package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DMWCommands {
    /*
Invoke Chrome Browser
Open URL: https://www.google.com/
Maximize the window.
Print the position and size of the page.
Minimize the page.
Wait 5 seconds in the icon state and maximize the page.
Print the position and dimensions of the page in maximized state.
Make the page fullscreen.
Close the Browser.
 */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        System.out.println("sayfanin pozisyonu : " + driver.manage().window().getPosition());
        System.out.println("sayfanin olculeri : " + driver.manage().window().getSize());

        Thread.sleep(3000);
        driver.manage().window().minimize();

        Thread.sleep(5000);

        driver.manage().window().maximize();

        System.out.println("sayfanin pozisyonu : " + driver.manage().window().getPosition());
        System.out.println("sayfanin olculeri : " + driver.manage().window().getSize());

        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        System.out.println("sayfanin pozisyonu : " + driver.manage().window().getPosition());
        System.out.println("sayfanin olculeri : " + driver.manage().window().getSize());

        Thread.sleep(2000);
        driver.close();
    }
}
