package day14;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;
import utils.TestBaseBforeAfter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_ReadExcel extends TestBaseBforeAfter {

    //-Dosya yolunu bir String degiskene atayalim
    //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
    //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
    //-WorkbookFactory.create(fileInputStream)
    //-sayfa 2'ye gidip satir sayisinin 6, kullanilan satir sayisinin ise 3 oldugunu test edin

    @Test
    public void readExcelTest() throws IOException {
        //-Dosya yolunu bir String degiskene atayalim
        String dosyaYolu="src/resources/ulkeler.xlsx";

       //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis=new FileInputStream(dosyaYolu);

        //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        // -WorkbookFactory.create(fileInputStream)
        Workbook workbook= WorkbookFactory.create(fis);

        //-sayfa 2'ye gidip satir sayisinin 6, kullanilan satir sayisinin ise 4 oldugunu test edin

        int sonSatir=workbook.getSheet("Sayfa2").getLastRowNum();
        System.out.println("son satir : "+sonSatir);

        int expectedLastRow=15;
        Assert.assertEquals(expectedLastRow,sonSatir+1);


        int kullanilanSatir=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();//kullanilan sstir ssyisini verir
        System.out.println("kullanilan satir sayisi :"+kullanilanSatir);



    }
}
