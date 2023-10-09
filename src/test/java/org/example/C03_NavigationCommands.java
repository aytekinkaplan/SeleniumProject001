package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //driver.get("https://clarusway.com/");
        //driver.get("https://www.amazon.com/");
        driver.navigate().to("https://clarusway.com/"); //clarusway sayfasina git
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com/"); //amazon sayfasina git

        //navigate().to() - get() methodu ile tamamen ayni islevi yapar.

        //Come back to the Clarusway using the back command.
        driver.navigate().back(); //once claruswaya sonra amazona gittikten sonra clarusway e geri donecek(geri)

        Thread.sleep(3000);

        //Again go back to the amazon website using forward command
        driver.navigate().forward(); //tekrar amazon sayfasina gider (ileri)

        Thread.sleep(2000);

        //Refresh the Browser using refresh command.
        driver.navigate().refresh(); //oldugu sayfayi yeniler
       Thread.sleep(2000);

        driver.close();
    }
}
