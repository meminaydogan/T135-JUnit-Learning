package tests.day09_cookies_webtables;

import org.junit.Test;
import utilities.ReusableMethods;
import utilities.TestBase_BeforeAfter;

public class C01_Cookies extends TestBase_BeforeAfter {


    @Test
    public void test01(){

        driver.get("https://www.amazon.com");





        ReusableMethods.bekle(3);
    }



}
