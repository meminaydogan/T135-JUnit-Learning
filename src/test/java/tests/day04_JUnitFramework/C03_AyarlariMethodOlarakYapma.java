package tests.day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C03_AyarlariMethodOlarakYapma {



    WebDriver driver;

    public void teardown(){
        ReusableMethods.bekle(2);
        driver.quit();
    }

    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test @Ignore
    public void youtubeTesti(){
        setup();
        driver.get("https://www.youtube.com");

        String expectedUrlicerik ="youtube";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlicerik)){
            System.out.println("Youtube testi PASSED");
        } else System.out.println("Youtube testi FAİLED");

        teardown();
    }


    @Test
    public void testotomasyonu(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com");

        String expectedUrlicerik ="testotomasyonu";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlicerik)){
            System.out.println("testotomasyonu testi PASSED");
        } else System.out.println("testotomasyonu testi FAİLED");

        ReusableMethods.bekle(2);
        driver.quit();

    }


    @Test
    public void wisequarter(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.wisequarter.com");

        String expectedUrlicerik ="wisequarter";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlicerik)){
            System.out.println("wisequarter testi PASSED");
        } else System.out.println("wisequarter testi FAİLED");

        ReusableMethods.bekle(2);
        driver.quit();

    }

}
