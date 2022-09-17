package day08_Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Allerts {


      /*
        bir web sitesine girdigimizde karsımıza bir uyarı mesajı yada bir buttona tıkladığımızda bir uyarı cıkabilir
        eğer bu uyarıya incele(mause sağ-tik inspect) yapabiliyorsak bu tür alert lere html alert denir.
        ve istedigimiz locate'i alabiliriz. Ama gelen uyarı kutusuna müdahale (sağ tik inspect ile) edemiyorsak
        bu tür alertlere  js alert denir.
        js alert'lere müdahale edebilmek icin

        -- tamam ya da ok icin
        driver.switchTo().alert().accept();

        --iptal icin
        driver.switchTo().alert().dismiss();

        --alert icindeki mesajı almak icin
        driver.switchTo().alert().getText();

        --alert bizden bir metin istiyorsa
        driver.switchTo().alert().sendKeys("");

        methodları kullanilir!!

       */





     WebDriver driver;

     @Before
    public void setUp(){
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     }
     @After
    public void tearDown(){
         //driver.close();
     }


     //Bir class olusturun: Alerts
    //https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
    //Bir metod olusturun: acceptAlert
    //1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının  “You successfully clicked an alert” oldugunu test edin.
    //Bir metod olusturun: dismissAlert
    //2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
    //“successfuly” icermedigini test edin.
    //Bir metod olusturun: sendKeysAlert
    //3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
    //tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.


    @Test
    public void test1() throws InterruptedException {
        //https://the-internet.herokuapp.com/javascript_alerts adresine gidin.

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
        // “You successfully clicked an alert” oldugunu test edin.
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        WebElement mesaj=driver.findElement(By.xpath("//p[@id=\"result\"]"));
        String actualMesaj=mesaj.getText();
        String expectMesaj="You successfully clicked an alert";

        Assert.assertEquals(expectMesaj,actualMesaj);


    }

    @Test
    public void test2() throws InterruptedException {
        //2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
        //“successfuly” icermedigini test edin.
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        System.out.println("2.Butonun Alert Mesaji :"+driver.switchTo().alert().getText());
        Thread.sleep(3000);

        driver.switchTo().alert().dismiss();
        String actualMesaj=driver.findElement(By.xpath("//*[@id='result']")).getText();

        String expectedMesaj="successfuly";

        Assert.assertFalse(actualMesaj.contains(expectedMesaj));


    }
    @Test
    public void test3() throws InterruptedException {
        //3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
        //tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(3000);

        //alert uzerindeki mesaji yazdirin
        System.out.println("3. Butonun alert mesaji :"+driver.switchTo().alert().getText());


        driver.switchTo().alert().sendKeys("Halime");
        driver.switchTo().alert().accept();

        String actualMesaj=driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
        String expectedMesaj="Halime";
        Assert.assertTrue(actualMesaj.contains(expectedMesaj));


    }



}
