package jnitTests;

import junit.framework.Assert;
import org.junit.Test;

import static strings.Anagrams.isAnnagrams;

public class AnnagramTest {

    @Test
    public void test1(){
        Assert.assertEquals(true,isAnnagrams("astronomer","moon starer"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(false,isAnnagrams(null,null));
    }

    @Test
    public void test3(){
        Assert.assertEquals(false,isAnnagrams("silent",null));
    }

    @Test
    public void test4(){
        Assert.assertEquals(false,isAnnagrams(null,"listen"));
    }
}