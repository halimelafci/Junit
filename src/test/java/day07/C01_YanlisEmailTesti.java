package day07;

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

public class C01_YanlisEmailTesti {

  static WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.    Bir Class olusturalim YanlisEmailTesti
        //http://automationpractice.com/index.php sayfasina gidelim
        //Sign in butonuna basalim
        // Email kutusuna @isareti olmayan bir mail yazip enter'a bastigimizda "Invalid email address"
        // uyarisi ciktigini test edelim


    }


   @Test
   public void test1(){
       //http://automationpractice.com/index.php sayfasina gidelim
       driver.get("http://automationpractice.com/index.php");

       //Sign in butonuna basalim
       driver.findElement(By.xpath("//a[@class=\"login\"]")).click();

       // Email kutusuna @isareti olmayan bir mail yazip enter'a bastigimizda "Invalid email address"
       // uyarisi ciktigini test edelim

       WebElement emailKutusu=driver.findElement(By.xpath("//input[@id=\"email_create\"]"));
       emailKutusu.sendKeys("hlmbrk");
       driver.findElement(By.xpath("//i[@class=\"icon-user left\"]")).click();

       WebElement emailkontrol=driver.findElement(By.xpath("//li[text()='Invalid email address.']"));
       String gercekSonuc=emailkontrol.getText();
       String beklenenSonuc="Invalid email address.";
       Assert.assertEquals(gercekSonuc,beklenenSonuc);


   }


    public static void tearDown() {
            driver.close();
        }

}
