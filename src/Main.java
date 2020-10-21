import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // class tanımlama
        Kayit kayit = new Kayit();
        Hesap hesap = new Hesap();
        Rapor rapor = new Rapor();
        Cikti cikti = new Cikti();
        DosyaOku dosyaOku = new DosyaOku(); //konsola yazdırmak için kullandığım class


    //1.class içindeki methodları çağırma
        kayit.ogrenciKayit();
        dosyaOku.readFile1();


    //2.class içindeki methodları çağırma
        hesap.hesapla();
        hesap.writeToHesap();
        dosyaOku.readFile2();

    //3.class içindeki methodları çağırma
        rapor.raporlama();
        rapor.writeToRapor();
        dosyaOku.readFile3();

    //4.class içindeki methodları çağırma
        cikti.ciktilar();
        cikti.writeToCikti();
        dosyaOku.readFile4();
    }
}
