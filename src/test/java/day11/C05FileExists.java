package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.TestBaseBforeAfter;

public class C05FileExists extends TestBaseBforeAfter {


           /*
       1-Tests packagenin altina bir class oluşturalim : C04_FileDownload
       2-Iki tane metod oluşturun : isExist( ) ve downloadTest( )
       3-downloadTest ( ) metodunun icinde aşağıdaki testi yapalim:
       4-https://the-internet.herokuapp.com/download adresine gidelim.
       5-test.txt dosyasını indirelim
       6-Ardından isExist( )  methodunda dosyanın başarıyla indirilip indirilmediğini test edelim
        */

    @Test
    public void test1(){

       // 4-https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        //5-test.txt dosyasını indirelim
        driver.findElement(By.xpath("//a[@href=\"download/test.txt\"]")).click();
    }

}
