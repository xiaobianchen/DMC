package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/16
 */
public class Test {

    @BeforeClass
    public void before(){
        System.out.println("Before");
    }

    @AfterClass
    public void after() {
        System.out.println("After");
    }

    @org.testng.annotations.Test
    public void test() {
        System.out.println("test");
    }


}
