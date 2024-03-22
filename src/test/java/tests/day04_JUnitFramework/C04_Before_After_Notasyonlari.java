package tests.day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C04_Before_After_Notasyonlari {



      /*
        EGER
        her test method'undan once MUTLAKA CALISMASINI istedigimiz bir method varsa
        @Before notasyonu ile isaretlenebilir

        Ayni sekilde
        her test method'undan sonra MUTLAKA CALISMASINI istedigimiz bir method varsa
        @After notasyonu ile isaretlenebilir

     */


    WebDriver driver;

    @After
    public void teardown(){
        ReusableMethods.bekle(2);
        driver.quit();
    }

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    public void youtubeTesti(){
        driver.get("https://www.youtube.com");

        String expectedUrlicerik ="youtube";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlicerik)){
            System.out.println("Youtube testi PASSED");
        } else System.out.println("Youtube testi FAİLED");
    }


    @Test
    public void testotomasyonu(){
        driver.get("https://www.testotomasyonu.com");

        String expectedUrlicerik ="testotomasyonu";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlicerik)){
            System.out.println("testotomasyonu testi PASSED");
        } else System.out.println("testotomasyonu testi FAİLED");
    }


    @Test
    public void wisequarter(){
        driver.get("https://www.wisequarter.com");

        String expectedUrlicerik ="wisequarter";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlicerik)){
            System.out.println("wisequarter testi PASSED");
        } else System.out.println("wisequarter testi FAİLED");
    }
}
