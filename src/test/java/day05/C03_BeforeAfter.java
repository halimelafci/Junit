package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BeforeAfter {


    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void method1(){
        driver.get("https://amazon.com");
    }

    @Test
    public void method2(){
        driver.get("https://techproeducation.com");
    }
    @Test
    public void method3(){
        driver.get("https://hepsiburada.com");
    }


    @After
    public void tearDown(){
       driver.close();
    }
}
