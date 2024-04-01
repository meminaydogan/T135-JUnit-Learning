package tests.day08_actions_faker_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class C05_FileUpload extends TestBase_BeforeAfter {


    @Test
    public void fileUploadTesti(){

        //1.https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //2.chooseFile butonuna basalim
        //3.package içindeki  deneme.txt dosyasını seçelim

        // bilgisayarımızda bulunan dosyalara webdriver ile ulaşamayağımız için
        // choose file butonuna yüklemek istediğimiz dosyanın
        // dosya yolunu yollamamız yeterli olacaktır.

        // C:/Users/muhammed/IdeaProjects/team135_JUnit
        // /src/test/java/tests/day08_actions_faker_fileTestleri\deneme.txt
        String dinamikdosyayolu = System.getProperty("user.dir")+
                "/src/test/java/tests/day08_actions_faker_fileTestleri\\deneme.txt";

        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        chooseFile.sendKeys(dinamikdosyayolu);

        //4.Upload butonuna basalim.

        driver.findElement(By.id("file-submit")).click();

        //5.“File Uploaded!” textinin goruntulendigini test edelim.

        WebElement fileuploadedyaziElementi = driver.findElement(By.tagName("h3"));

        String expectedYazi = "File Uploaded!";
        String actualYazi = fileuploadedyaziElementi.getText();

        Assert.assertEquals(expectedYazi,actualYazi);

        ReusableMethods.bekle(5);
    }
}
