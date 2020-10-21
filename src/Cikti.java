import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Cikti {

    int  i = 0,counter=0;
    String[] ad = new String[500];
    String[] soyad = new String[500];
    String[] ogrenciNo = new String[500];
    float[] vizeNot = new float[500];
    float[] finalNot = new float[500];
    float[] basariNotu = new float[500];
    String line;
    String[] harfNotu = new String[500];
    String[] parcalar = new String[500];

    float vizeOrt ;
    float finalOrt ;
    float basariNotOrt;
    float toplam = 0;


    public void ciktilar (){
    //BM201Rapor.txt den vize,final ,başarıNotu ve harf notu okunması ve ilgili değişkenlere atma

        File file =new File("C:\\Users\\berka\\Desktop\\BM201Rapor.txt");
        try {
            Scanner reader = new Scanner(file);
            i=0;
            while (reader.hasNextLine()){
                line =  reader.nextLine();

                parcalar = line.split(" ");
                Arrays.toString(parcalar);

                //eğer parçalanan stringin uzunlugu 7 değilse döngüden çık.
                // Çünkü 481 x y 90.0 80.0 84.0 A formatına göre
                if(parcalar.length != 7){
                    break;
                }

                vizeNot[i] =  Float.parseFloat(parcalar[3]);
                finalNot[i]=  Float.parseFloat(parcalar[4]);
                basariNotu[i] = Float.parseFloat(parcalar[5]);
                harfNotu[i] = parcalar[6];

                i++;
                counter++;
            }


            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    //Ekrana BM201Rapor.txt den alınan verileri yazma
    public void writeToCikti(){
        File file =new File("C:\\Users\\berka\\Desktop\\BM201Cikti.txt");
        try {
            FileWriter filewr = new FileWriter(file);

            System.out.println("BM201Cikti.txt  Dosyası");

            for (i=0 ; i<counter ; i++) {
                filewr.write(vizeNot[i] + " " + finalNot[i] + " " + basariNotu[i] + " " + harfNotu[i] + "\n");
            }

            filewr.write("\n");

            //vize not ortlaması hesaplama
            for (int j = 0; j < counter; j++) {

                toplam = vizeNot[j] + toplam;

            }
            vizeOrt = (toplam / counter);


            //final not ortalaması hesaplama
            toplam=0;
            for (int j =0; j<counter; j++) {

                toplam = finalNot[j] + toplam;

            }
            finalOrt = (toplam / counter);

            toplam=0;
            //genel başarı notu ortalaması hesaplama
            for (int j = 0;  j<counter; j++) {

                toplam = basariNotu[j] + toplam;

            }
            basariNotOrt = (toplam / counter);


            filewr.write("Sınıfın Vize Ortalaması : " + vizeOrt + "\n");
            filewr.write("Sınıfın Final Ortalaması : " + finalOrt + "\n");
            filewr.write("Sınıfın Genel Başarı Ortalaması : " + basariNotOrt + "\n");
            filewr.write("\n");

            //Harf Notlarının Frekans Grafiği
            filewr.write("Harf Notlarının Frekans Grafiği:"+"\n");
            filewr.write("A");
            for(int j=0 ; j<counter ; j++){
                if(100 >= basariNotu[j] && basariNotu[j] > 75){
                    filewr.write(" " + " * ");
                }
            }
            filewr.write("\n");

            filewr.write("B");
            for( int j=0 ; j<counter ; j++){
                if(75 >= basariNotu[j] && basariNotu[j] > 50){
                    filewr.write(" " + " * ");
                }
            }
            filewr.write("\n");

            filewr.write("C");
            for(int j=0 ; j<counter ; j++){
                if(50 >= basariNotu[j] && basariNotu[j] > 25){
                    filewr.write(" " + " * ");
                }
            }
            filewr.write("\n");

            filewr.write("D");
            for( int j=0 ; j<counter ; j++){
                if(25 >= basariNotu[j] && basariNotu[j] > 0){
                    filewr.write(" " + " * ");
                }
            }
            filewr.write("\n");



            filewr.close();
        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}




