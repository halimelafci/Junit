package day15;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.TestBaseBforeAfter;

import java.io.File;

public class C04_ScreanShot extends TestBaseBforeAfter {


    @Test
    public void test(){

        driver.get("https://amazon.com");

        TakesScreenshot ts=(TakesScreenshot) driver;

        File tumSayfaResmi=ts.getScreenshotAs(OutputType.FILE);
    }
}
