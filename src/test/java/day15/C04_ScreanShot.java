package day15;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.TestBaseBforeAfter;

import java.io.File;
import java.io.IOException;

public class C04_ScreanShot extends TestBaseBforeAfter {


    @Test
    public void test() throws IOException {

        driver.get("https://amazon.com");

        TakesScreenshot ts=(TakesScreenshot) driver;

        File tumSayfaResmi=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tumSayfaResmi,new File("target/ekranGoruntusu/allPage.jpeg"));
    }
}
