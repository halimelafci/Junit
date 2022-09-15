package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Assetion {


   static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");

    }



            //Amazon sayfasina git
            //3 farkli test method'u olustur
            //- url'in "amazon" icergini test et
            //- title'in "facebook" icermedigini test et
            //- sol ust kosede amazon logosunun gorundugunu test et


      @Test
      public void test1(){
          //- url'in "amazon" icergini test et
          String exepceteUrl="amazon";
       String actualUrl=driver.getCurrentUrl();
          Assert.assertTrue(actualUrl.contains(exepceteUrl));
      }


    @Test
    public void test2(){
        //- title'in "facebook" icermedigini test et

        String actualTitle=driver.getTitle();
        String expectedTitle="facebook";
        Assert.assertFalse(actualTitle.contains(expectedTitle));

    }
    @Test
    public void test3(){
        //- sol ust kosede amazon logosunun gorundugunu test et
        WebElement amazonlogo=driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));

        Assert.assertTrue(amazonlogo.isDisplayed());


    }


    @AfterClass
    public static void tearDown(){
        driver.close();
    }



}
