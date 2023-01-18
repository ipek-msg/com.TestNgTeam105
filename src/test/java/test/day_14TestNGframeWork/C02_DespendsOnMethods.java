package test.day_14TestNGframeWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_DespendsOnMethods {

    @Test(priority = -3)
    public void ilkTest(){
        System.out.println("Ilk test calisti");
        Assert.assertTrue(5>9);
    }

    @Test(dependsOnMethods = "ilkTest")
    public void ikinciTest(){
        System.out.println("Ikinci test calisti");
    }


    @Test(dependsOnMethods = "ikinciTest")
    public void ucuncuTest(){
        System.out.println("Ucuncu test calisti");
    }

    //depensOnMEthods  birbirine baglı methodlardır
    //baglı methodlar tek tek calısamaz
    //faild olan ilktest diger testide calıstırmaz
}

