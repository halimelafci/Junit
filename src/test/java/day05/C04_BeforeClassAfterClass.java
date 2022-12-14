package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BeforeClassAfterClass {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    @Ignore //calismasını istemedigimiz teste yazariz
    public void method(){
        driver.get("https://amazon.com");
    }
    @Test
    public void method1(){
        driver.get("https://techproeducation.com");
    }
    @Test
    public void method2(){
        driver.get("https://hepsiburada.com");
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }
}