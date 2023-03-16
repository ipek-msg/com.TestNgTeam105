package test.day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_PozitifLoginTesti {

    @Test(groups = "smoke")
    public void test01(){

        // 1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        // 2- login linkine basin
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        // 3- Kullanici email'i olarak valid email girin
        qualitydemyPage.acceptbutonu.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("yasavoj150@prolug.com");
        // 4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys("Asd123123");

        ReusableMethods.bekle(2);

        // 5- Login butonuna basarak login olun
        qualitydemyPage.loginButonu.click();
        //qualitydemyPage.loginButonu.click();
        // 6- Basarili olarak giris yapilabildigini test edin

        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());


        //Driver.closeDriver();
    }
}

