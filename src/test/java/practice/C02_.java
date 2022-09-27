package practice;

import org.junit.Assert;
import org.junit.Test;
import utils.TestBaseBforeAfter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_ extends TestBaseBforeAfter {

    //Verify that we have pom.xml file in our project => please try in 4 min s

    @Test
    public void test01(){
        String dosyaYolu="pom.xml";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
