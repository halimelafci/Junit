package day15;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import utils.TestBaseBforeAfter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02_WriteExcel extends TestBaseBforeAfter {

      //Yeni bir Class olusturalim WriteExcel
    //Yeni bir test method olusturalim writeExcelTest()
    //Adimlari takip ederek 1.satira kadar gidelim
    //5.hucreye yeni bir cell olusturalim
    //Olusturdugumuz hucreye “Nufus” yazdiralim
    //2.satir nufus kolonuna 1500000 yazdiralim
    //10.satir nufus kolonuna 250000 yazdiralim
    //15.satir nufus kolonuna 54000 yazdiralim
    //Dosyayi kaydedelim
    // 10)Dosyayi kapatalim
    @Test
    public void test1() throws IOException {

        String dosyaYolu="src/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);

        //5.hucreye yeni bir cell olusturalim
        //Olusturdugumuz hucreye “Nufus” yazdiralim

        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Nufus");

        //2.satir nufus kolonuna 1500000 yazdiralim
        workbook.getSheet("Sayfa1").getRow(1).createCell(4).setCellValue("1.500.000");

        //10.satir nufus kolonuna 250000 yazdiralim

        workbook.getSheet("Sayfa1").getRow(9).createCell(4).setCellValue("250.000");

        //15.satir nufus kolonuna 54000 yazdiralim

        workbook.getSheet("Sayfa1").getRow(14).createCell(4).setCellValue("54.000");

        //Excel dosyamiza veri girisi yaptiktan sonra dosyayi
       //akisa aldigimiz gibi sonlandirmamiz gerekir
        //Sonrasinda da workbook objemize kayit etmemiz gerekir

        FileOutputStream fos=new FileOutputStream(dosyaYolu);
        workbook.write(fos);
        fis.close();
        fos.close();workbook.close();


    }
}
