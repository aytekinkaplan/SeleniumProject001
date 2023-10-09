package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FirstClass {
    public static void main(String[] args) {
        //Seleniumla calismaya basladigimizda once hangi driver ile calsacagimizi belirtmemiz gerek
        //Driver araciligi ile browser ile iletisim kuracagiz
        //System.setProperty methodu : driver i tanitir..2 parametere ister, ,
        // ilki kullancagimiz browsera ait driverdir,
        // ikincisi de selenium sitesinden indirip projemize ekledigimiz chrome driver in pathi
        //windows kullanicilari sonunda .exe varken , apple kullananlarda yoktur..

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //driver.get("https://www.amazon.com");
        driver.get("https://www.amazon.com/");

        //get() methodu: driver ile bir siteyi acmak istersekdriver objemizin get() methodunu kullaniriz
        //driver imiza  get komutu ile google.com a gitmasinzi soyledik

        //driver.quit(); //driver da acik olan bu sayfalari tamamen kapatir(cikis)

        driver.close(); //driver clasin en sonuna eklenmelidir,
        // cunku bu kod calisinca driver imiz kapanir

        driver.get("https://www.amazon.com/"); //bu kod satiri hata verir..
        // bu koddan sonra yeni bir browser acmak istiyorsak driver a yeni deger atamaliyiz
        //driver objesi olusturmaliyiz
    }
}
