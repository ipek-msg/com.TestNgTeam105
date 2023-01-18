package test.day18_htmlReports;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProviderIleNegativeLoginTesti {


    // Qualitydemy anasayfaya gidin
    // verilen yanlis kullanici adi ve password kombinasyonlari icin
    // giris yapilamadigini test edin
    // username     password
    // A11          A12345
    // B12          B12345
    // C13          C12345
    // D14          D12345
    // E15          E12345

    @DataProvider
    public static Object[][] kullaniciBilgileri() {

        Object[][] kullaniciBilgileriArr=
                {{"A11","A12345"},{"B12","B12345"},{"C13","C12345"},{"D14","D12345"},{"E15","E12345"}};
        return kullaniciBilgileriArr;
    }

    @Test(dataProvider = "kullaniciBilgileri")
    public void negativeLoginTest(String username, String password){

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        QualitydemyPage qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        qualitydemyPage.kullaniciEmailKutusu.sendKeys(username);
        qualitydemyPage.passwordKutusu.sendKeys(password);
       // qualitydemyPage.AcceptButonu.click();
        qualitydemyPage.loginButonu.sendKeys("Login"+ Keys.ENTER);

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
    }
}


