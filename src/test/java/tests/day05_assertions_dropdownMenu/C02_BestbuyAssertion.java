package tests.day05_assertions_dropdownMenu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C02_BestbuyAssertion {



    // https://www.bestbuy.com/ Adresine gidin
    // farkli test method’lari olusturarak asagidaki testleri yapin
    // Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    // titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    // logoTest => BestBuy logosunun görüntülendigini test edin
    // FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin

    static WebDriver driver;

    @BeforeClass
    public static void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com/");
    }

    @AfterClass
    public static void teardown(){
        ReusableMethods.bekle(3);
        driver.quit();
    }

    @Test
    public void urlTest(){
        String expectedUrl = "https://www.bestbuy.com/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }


    @Test
    public void titleTest(){
            String unExpectedTitleicerik = "Rest";
            String actualtitle = driver.getTitle();

            Assert.assertFalse(actualtitle.contains(unExpectedTitleicerik));
    }

    @Test
    public void logoTest(){

        WebElement logoElementi = driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));

        Assert.assertTrue(logoElementi.isDisplayed());

    }

    @Test
    public void franciasTesti(){

        WebElement francaisLinkElementi = driver.findElement(By.xpath("//*[text()='Français']"));

        Assert.assertTrue(francaisLinkElementi.isDisplayed());
    }



}
