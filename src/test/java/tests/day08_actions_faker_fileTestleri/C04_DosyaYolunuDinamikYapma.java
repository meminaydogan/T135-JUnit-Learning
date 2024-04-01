package tests.day08_actions_faker_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase_BeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_DosyaYolunuDinamikYapma extends TestBase_BeforeAfter {


    @Test
    public void test01(){


        String dosyaYolu= "C:/Users/muhammed/Desktop/logo.png";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        System.out.println(System.getProperty("user.home"));
        // bilgisayardaki kullanıcının ana dosya yolunu verir

        System.out.println(System.getProperty("user.dir"));
        // çalıştığımız projenin dosya yolunu verir


        String dinamikDosyaYolu = System.getProperty("user.home") + "/Desktop/logo.png";



        dosyaYolu = "C:/Users/muhammed/IdeaProjects/team135_JUnit/src/test/java/tests/day08_actions_faker_fileTestleri/deneme.txt";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


        dinamikDosyaYolu = System.getProperty("user.dir") + "/src/test/java/tests/day08_actions_faker_fileTestleri/deneme.txt";

        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));
    }
}
