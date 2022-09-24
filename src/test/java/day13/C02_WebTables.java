package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.TestBaseBforeAfter;

import java.util.List;

public class C02_WebTables extends TestBaseBforeAfter {

    @Test
    public void test1(){

          //Bir class oluşturun : C02_WebTables
        //login( ) metodun oluşturun ve oturum açın.



        //https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //Username : manager
        //Password : Manager1!
        //table( ) metodu oluşturun
        //Tüm table body’sinin boyutunu(sutun sayisi) bulun.
        //Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        //printRows( ) metodu oluşturun //tr
        //table body’sinde bulunan toplam satir(row) sayısını bulun.
        //Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        //4.satirdaki(row) elementleri konsolda yazdırın.


        driver.get("https://www.hotelmycamp.com/admin/HotelRoomAdmin");

        driver.findElement(By.xpath("//*[@id='UserName']")).click();
        Actions action=new Actions(driver);
        WebElement userName=driver.findElement(By.xpath("//*[@id='UserName']"));
        action.click(userName).sendKeys("manager").
                sendKeys(Keys.TAB).sendKeys("Manager1!").sendKeys(Keys.ENTER).perform();

        List<WebElement> sutunSayisi=driver.findElements(By.xpath("//thead//tr//th"));
        System.out.println("sutun Sayisi : "+sutunSayisi.size());


        WebElement basliklar=driver.findElement(By.xpath("//thead//tr"));
        System.out.println("basliklar : "+basliklar.getText());

        WebElement body= driver.findElement(By.xpath("//tbody"));
        System.out.println("Tum body : "+body.getText());


        //table body’sinde bulunan toplam satir(row) sayısını bulun.


        List<WebElement>satirList=driver.findElements(By.xpath("//tbody//tr"));
        System.out.println("Tablodaki Satir Sayisi : "+satirList.size());

        //Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        satirList.forEach(t-> System.out.println(t.getText()));

        //4.satirdaki(row) elementleri konsolda yazdırın.
        System.out.println("4.satir : "+driver.findElement(By.xpath("//tbody//tr[4]")).getText());





    }


}
