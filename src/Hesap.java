import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Hesap {

    int i = 0,counter=0;
    String[] ad = new String[500];
    String[] soyad = new String[500];
    String[] ogrenciNo = new String[500];
    float[] vizeNot = new float[500];
    float[] finalNot = new float[500];
    float[] basariNotu = new float[500];
    String line;
    char[] harfNotu = new char[500];
    String[] parcalar = new String[500];


    //BM201Kayit.txt dosyasının okunup ilgili değişkenlere atanması
    public void hesapla() {

        File file =new File("C:\\Users\\berka\\Desktop\\BM201Kayit.txt");
        try {
            Scanner reader = new Scanner(file);
            i=0;
            while (reader.hasNextLine()){
                line =  reader.nextLine();
                parcalar = line.split(" ");

                Arrays.toString(parcalar);
                ogrenciNo[i] =parcalar[0];
                ad[i] = parcalar[1];
                soyad[i] = parcalar[2];
                vizeNot[i] =  Float.parseFloat(parcalar[3]);
                finalNot[i]=  Float.parseFloat(parcalar[4]);
                i++;
                counter++;
            }


            reader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

    }

    //BM201Hesap.txt dosyasına yazma işlemi
    public void writeToHesap(){
        File file =new File("C:\\Users\\berka\\Desktop\\BM201Hesap.txt");
        try {
            FileWriter filewr = new FileWriter(file);
            System.out.println("BM201Hesap.txt  Dosyası");

            //Her öğrenci için başarı notu ve harf notu hesaplama
            for (i=0 ; i<counter ; i++){
                basariNotu[i] = (float) (vizeNot[i] * 0.40 + finalNot[i] * 0.60);


                if (100 >= basariNotu[i] && basariNotu[i] > 75) {
                    harfNotu[i] = 'A';
                } else if (75 >= basariNotu[i] && basariNotu[i] > 50) {
                    harfNotu[i] = 'B';
                } else if (50 >= basariNotu[i] && basariNotu[i] > 25) {
                    harfNotu[i] = 'C';
                } else if (25 >= basariNotu[i] && basariNotu[i] > 0) {
                    harfNotu[i] = 'D';
                }

                filewr.write( ogrenciNo[i]+ " " +ad[i]+ " " + soyad[i] +" " + vizeNot[i]
                        + " " + finalNot[i] + " " + basariNotu[i] + " " + harfNotu[i] + "\n");
            }


            filewr.close();
        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
