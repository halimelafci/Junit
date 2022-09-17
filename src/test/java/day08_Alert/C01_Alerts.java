package day08_Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Alerts {

    WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown() {
        //driver.close();
    }

     // https://the-internet.herokuapp.com/javascript_alerts adresine gidelim
     // Click for JS Alert butonuna tıklayalım
    // Tıkladıktan sonra çıkan uyarı mesajına (Alerte) tamam diyelim

    @Test

    public void test1() throws InterruptedException {
        // https://the-internet.herokuapp.com/javascript_alerts adresine gidelim
        // Click for JS Alert butonuna tıklayalım

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        // Tıkladıktan sonra çıkan uyarı mesajına (Alerte) tamam diyelim
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
    }





}
