import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Kayit {


    int ogrenciSayisi = 0, i = 0;
    String[] ad = new String[500];
    String[] soyad = new String[500];
    String[] ogrenciNo = new String[500];
    float[] vizeNot = new float[500];
    float[] finalNot = new float[500];



    public void ogrenciKayit() throws IOException {


        Scanner sc = new Scanner(System.in);

        System.out.print("Ogrenci Sayısı Giriniz: ");
        ogrenciSayisi = sc.nextInt();

        //ogrenci sayısına göre bilgilerin alınması
        for (i = 1; i <= ogrenciSayisi; i++) {

            System.out.printf("%d. Ögrenci Numarasını gir: ", i);
            ogrenciNo[i] = sc.next();

            System.out.printf("%d. Ögrenci Adı gir: ", i);
            ad[i] = sc.next();

            System.out.printf("%d. Ögrenci Soyadı gir: ", i);
            soyad[i] = sc.next();

            System.out.printf("%d. Öğrenci Vize Notu Giriniz: ", i);
            vizeNot[i] = sc.nextFloat();

            System.out.printf("%d. Öğrenci Final Notu Giriniz: ", i);
            finalNot[i] = sc.nextFloat();
        }

        //Ogrenci bilgilerini dosyaya basma
            File file = new File("C:\\Users\\berka\\Desktop\\BM201Kayit.txt");
            try {
                FileWriter filewr = new FileWriter(file);

                System.out.println("BM201Kayit.txt  Dosyası");

                for (i = 1; i <= ogrenciSayisi; i++) {

                    filewr.write(ogrenciNo[i] + " " + ad[i] + " "+ soyad[i] + " " + vizeNot[i] + " " + finalNot[i] + "\n");

                }
                filewr.close();
        } catch (
                IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }




}


