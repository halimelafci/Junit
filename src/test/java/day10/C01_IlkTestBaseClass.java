package day10;

import org.junit.Test;
import utils.TestBaseBforeAfter;

public class C01_IlkTestBaseClass extends TestBaseBforeAfter {


    @Test
    public void test1(){
        driver.get("https://amazon.com");

    }
}
