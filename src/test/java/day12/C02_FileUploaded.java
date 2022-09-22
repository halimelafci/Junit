package day12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.TestBaseBforeAfter;

public class C02_FileUploaded extends TestBaseBforeAfter {

     //Tests packagenin altina bir class oluşturun : UploadFile
    //https://the-internet.herokuapp.com/upload adresine gidelim
    //chooseFile butonuna basalim
    //Yuklemek istediginiz dosyayi secelim.
    //Upload butonuna basalim.
    //“File Uploaded!” textinin goruntulendigini test edelim.

    @Test
    public void test1(){
        driver.get("https://the-internet.herokuapp.com/upload");

       WebElement dosyaSec= driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));

       String dosyaYolu="C:\\Users\\SarıSiyah\\Downloads\\test.txt";
       dosyaSec.sendKeys(dosyaYolu);
    }
}
