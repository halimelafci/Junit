package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.TestBaseBforeAfter;

import java.util.List;

public class C03_WebTables extends TestBaseBforeAfter {


      //Bir önceki class'daki adrese gidelim
      //Login() methodunu kullanarak sayfaya giriş yapalım
      //input olarak verilen satır sayısı ve sutun sayısına sahip cell'deki text'i yazdıralım
      //PhoneNo başlığındaki tum numaraları yazdırınız

    @Test
    public void test1(){
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
    }


}
