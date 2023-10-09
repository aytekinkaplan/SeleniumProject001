package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_SetPosition_SetSize {
      /*
 Go to the Amazon URL : https://www.amazon.com/
 Print the position and size of the page.
 Adjust the position and size of the page as desired.
 Test that the page is in the position and size you want.
 Close the page.
*/

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        System.out.println("sayfanin pozisyonu : " + driver.manage().window().getPosition());
        System.out.println("sayfanin olculeri : " + driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(80,50));
        driver.manage().window().setSize(new Dimension(600,500));

        System.out.println("sayfanin pozisyonu : " + driver.manage().window().getPosition());
        System.out.println("sayfanin olculeri : " + driver.manage().window().getSize());

        int xCoordinate = driver.manage().window().getPosition().getX();
        int yCoordinate = driver.manage().window().getPosition().getY();
        System.out.println(xCoordinate);
        System.out.println(yCoordinate);

        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();
        System.out.println(width);
        System.out.println(height);

        if(xCoordinate ==80 && yCoordinate ==50 && width ==600 && height ==500 ){
            System.out.println("olceklendirme testi PASSED");
        }else System.out.println("olceklendirme test FAILED");

        driver.close();
    }
}
