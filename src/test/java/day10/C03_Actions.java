package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.TestBaseBforeAfter;

import javax.swing.*;

public class C03_Actions extends TestBaseBforeAfter {

    @Test
    public void test1(){
        // 1 Amazon sayfasina gidelim
       //2 Account menusunden create a list linkine tiklayalim

        driver.get("https://amazon.com");
        WebElement accontMenusu=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));

        Actions action=new Actions(driver);
        action.moveToElement(accontMenusu).perform();
        driver.findElement(By.xpath("(//span[@class=\"nav-text\"])[1]")).click();

        /*
    Bir web sitesinde bir mouse ile açılan bir web elementine ulaşmak istersek
    actions.moveToElement() methodunu kullanmamız gerekir.
     Aksi takdirde html kodları arasında
    web elementi bulur ama ulaşamadığı için ElemenNotInteractableException: element not interactable exception'i fırlatır
       */
    }


}
