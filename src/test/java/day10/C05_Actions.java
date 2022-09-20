package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.TestBaseBforeAfter;

public class C05_Actions extends TestBaseBforeAfter {



    //Yeni bir class olusturalim: MouseActions2
    //https://demoqa.com/droppable adresine gidelim
    //“Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
    //“Drop here” yazisi yerine “Dropped!” oldugunu test edin


    @Test
    public void test1(){
        //https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");

        //“Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim

        WebElement dragKutusu=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));

        WebElement dropHereKutusu=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        Actions action=new Actions(driver);

        action.dragAndDrop(dragKutusu,dropHereKutusu).perform();  //div[@id="droppable"]

        //“Drop here” yazisi yerine “Dropped!” oldugunu test edin

     Assert.assertEquals("Dropped!",driver.findElement(By.xpath("//p[text()='Dropped!']")).getText());




    }
}
