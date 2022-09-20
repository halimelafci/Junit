package day10;

import org.junit.Test;
import utils.C01_TestBaseBforeAfter;

public class C01_IlkTestBaseClass extends C01_TestBaseBforeAfter {


    @Test
    public void test1(){
        driver.get("https://amazon.com");

    }
}
