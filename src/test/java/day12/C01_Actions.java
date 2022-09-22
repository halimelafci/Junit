package day12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utils.TestBaseBforeAfter;

public class C01_Actions extends TestBaseBforeAfter {

    @Test
    public void test1(){
        //Automationexercises.com adresine gidelim

        driver.get("https://www.automationexercise.com");

        //product bölümüne girelim
        driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();



        //ilk ürünü tıklamayalım

        Actions action=new Actions(driver);
       // action.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]")).click();


    }
}
