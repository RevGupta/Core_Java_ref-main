package jnitTests;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static strings.CheckRotation.isRotated;
import static strings.CheckRotation.isRotated;

public class CheckRotationTest {

    @Test
    public void test1(){
        Assert.assertEquals(true,isRotated("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(false,isRotated("JavaJ2eeStruts","StrutsHibernateJavaJ2ee"));
    }

    @Test
    public void test3(){
        Assert.assertEquals(true,isRotated("JavaJ2ee StrutsHibernate","StrutsHibernateJavaJ2ee "));
    }

    @Test
    public void test4(){
        Assert.assertEquals(false,isRotated(null,null));
    }

    @Test
    public void test5(){
        Assert.assertEquals(false,isRotated("revanth",null));
    }
}