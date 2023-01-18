package test.day_14TestNGframeWork;

import org.testng.annotations.Test;

public class C01_TestNGtest {


     /*
        TestNG test method'larini isim sirasina gore calistirir
        priority degeri verilen method'lar priority degeri kucukten buyuge dogru calisir
        esit olan priority degerlerinde harf sirasina gore calisir
        eger priority degeri yazmazsak priority=0 kabul edilir
     */


    @Test (priority = 6)
    public void ilkTest(){
        System.out.println("ilk test calıstı");

    }

    @Test(priority = 9)
    public void ikinciTest(){
        System.out.println("ikinci test calıstı");
    }
    @Test(priority = 44)
    public void ucuncuTest(){
        System.out.println("ucuncu test calıstı");

    }
}
