package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.TestBaseBforeAfter;

import java.util.ArrayList;
import java.util.List;

public class C04_Action extends TestBaseBforeAfter {
           //Yeni bir class olusturalim: MouseActions1
          //https://the-internet.herokuapp.com/context_menu sitesine gidelim
          // 3- Cizili alan uzerinde sag click yapalim
          //Alert’te cikan yazinin “You selected a context menu” oldugunu
          //test edelim.
          //Tamam diyerek alert’i kapatalim
          //Elemental Selenium linkine tiklayalim
          //Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim


    @Test
    public void test1(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement cizgiliAlan=driver.findElement(By.xpath("//div[@id=\"hot-spot\"]"));

        // 3- Cizili alan uzerinde sag click yapalim
        //Alert’te cikan yazinin “You selected a context menu” oldugunu test edelim.
        Actions action=new Actions(driver);
        action.contextClick(cizgiliAlan).perform();
        Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());

        //Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();

        //Elemental Selenium linkine tiklayalim
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();


        List<String> windowlist = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windowlist.get(1));

        //Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim

        Assert.assertEquals("Elemental Selenium",driver.findElement(By.xpath("//h1")).getText());



    }
}
