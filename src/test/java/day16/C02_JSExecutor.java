package day16;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.TestBaseBforeAfter;

public class C02_JSExecutor extends TestBaseBforeAfter {

     //Amazon sayfasina gidelim
     //Asagidaki carreers butonunu gorunceye kadar js ile scroll yapalim
     //Carreers butonuna js ile click yapalim

    @Test
    public void test01(){
        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");


        //Asagidaki carreers butonunu gorunceye kadar js ile scroll yapalim
        WebElement carreers=driver.findElement(By.xpath("//*[text()='Careers']"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",carreers);


        //Carreers butonuna js ile click yapalim
        jse.executeScript("arguments[0].click();",carreers);


    }
}
