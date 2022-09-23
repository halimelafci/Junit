package day12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestBaseBforeAfter;

import java.time.Duration;

public class C03_SenkranizasyonWait extends TestBaseBforeAfter {

       //Bir class olusturun : WaitTest
       //Iki tane metod olusturun : implicitWait() , explicitWait()
       //Iki metod icin de asagidaki adimlari test edin.
       //https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
       //Remove butonuna basin.
       //“It’s gone!” mesajinin goruntulendigini dogrulayin.
       //Add buttonuna basin
       //It’s back mesajinin gorundugunu test edin
    @Test
    public void implicitWait() {



        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

       driver.findElement(By.xpath("//*[text()='Remove']")).click();

    WebElement mesaj=driver.findElement(By.xpath("//p[@id=\"message\"]"));
      Assert.assertTrue(mesaj.isDisplayed());

       driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();
    WebElement backMesaji=driver.findElement(By.xpath("//p[@id=\"message\"]"));
        Assert.assertTrue(backMesaji.isDisplayed());



    }

    @Test
    public void explicitWait(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//*[text()='Remove']")).click();

        WebDriverWait waid=new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement itsGoneWE=waid.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//p[@id=\"message\"]")));
                Assert.assertTrue(itsGoneWE.isDisplayed());


        WebElement itsBackWE=waid.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//p[@id=\"message\"]")));
        Assert.assertTrue(itsBackWE.isDisplayed());


    }
}
