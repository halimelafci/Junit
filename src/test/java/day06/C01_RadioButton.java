package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_RadioButton {


   WebDriver driver;


   @Before
   public void setUp(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

   }


   @After
    public void teerDown(){
       driver.close();
   }

   //Bir class oluşturun : RadioButtonTest
    //Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    // https://www.facebook.com adresine gidin
    //Cookies’i kabul edin
    //“Create an Account” button’una basin
    // “radio buttons” elementlerini locate edin
    //Secili degilse cinsiyet butonundan size uygun olani secin

   @Test
    public void test(){
      driver.get("https://www.facebook.com");
       WebElement accontButon=driver.findElement(By.xpath(("//div[@class=\"_6ltg\"][2]")));
       accontButon.click();

     WebElement femaleButton=  driver.findElement(By.xpath("//input[@value=\"1\"]"));
     WebElement maleButton=  driver.findElement(By.xpath("//input[@value=\"2\"]"));
      WebElement custonButon= driver.findElement(By.xpath("//input[@value=\"-1\"]"));

      if (!femaleButton.isSelected()){
          femaleButton.click();
      }
   }


}
