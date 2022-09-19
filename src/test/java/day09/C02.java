package day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {




    //1- Amazon Sayfasina girelim
    //2- Url'nin amazon içerdiğini test edelim
    //3- Yeni bir pencere açıp bestbuy anasayfasına gidelim.(https://www.bestbuy.com)
    //4- title'in BestBuy içerdiğini test edelim
    //5- İlk sayfaya dönüp sayfada java aratalım
    //6- Arama sonuclarının java içerdiğini test edelim
    //7- Yeniden bestbuy sayfasına gidelim
    //8- Logonun görünürlüğünü test edelim
    //9- Sayfaları Kapatalım

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
       // driver.close();
    }

    @Test

    public void test1(){
        //1- Amazon Sayfasina girelim
        //2- Url'nin amazon içerdiğini test edelim

        driver.get("https://amazon.com");
        String amazonWindowHandel=driver.getCurrentUrl();
        String expectedUrl="amazon";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

        //3- Yeni bir pencere açıp bestbuy anasayfasına gidelim.(https://www.bestbuy.com)
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");

        //4- title'in (Best Buy) içerdiğini test edelim
        String actualTitle=driver.getTitle();
        String expectetTitle="Best Buy";
        Assert.assertTrue(actualTitle.contains(expectetTitle));

        //5- İlk sayfaya dönüp sayfada java aratalım
        driver.switchTo().window(amazonWindowHandel);
    }





}
