package day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.TestBaseBforeAfter;

public class C01_Actions extends TestBaseBforeAfter {

       //Bir Class olusturalim KeyboardActions1
    //https://www.amazon.com sayfasina gidelim
    //Arama kutusuna actions method’larine kullanarak  samsung A71 yazdirin ve Enter’a basarak arama  yaptirin
    //aramanin gerceklestigini test edin


    @Test
    public void test1() {
        //https://www.amazon.com sayfasina gidelim
        driver.get("https://www.amazon.com");

        //Arama kutusuna actions method’larine kullanarak  samsung A71 yazdirin ve Enter’a basarak arama  yaptirin
        //aramanin gerceklestigini test edin
        Actions action=new Actions(driver);
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        action.click(aramaKutusu).
                sendKeys("s").
                sendKeys("a").
                sendKeys("m").
                sendKeys("s").
                sendKeys("u").
                sendKeys("n").
                sendKeys("g").
                sendKeys(" ").keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("7").sendKeys("1").
                sendKeys(Keys.ENTER).perform();

     WebElement aramaSonucu=driver.findElement(By.xpath("//span[@class=\"a-color-state a-text-bold\"]"));
        Assert.assertTrue(aramaSonucu.isDisplayed());

    }
}
