package tests.day08_actions_faker_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist extends TestBase_BeforeAfter {

    @Test
    public void test01(){

        driver.get(" https://the-internet.herokuapp.com/download");

        driver.findElement(By.linkText("logo.png")).click();

        ReusableMethods.bekle(3);

        String dosyaYolu = "C:/Users/muhammed/Downloads/logo.png";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


    }
}
