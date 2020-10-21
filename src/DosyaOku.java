import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOku {

    //BM201Kayit.txt dosyasının konsola yazdırılması.
    public static void readFile1(){
        File file =new File("C:\\Users\\berka\\Desktop\\BM201Kayit.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //BM201Hesap.txt dosyasının konsola yazdırılması.
    public static void readFile2(){
        File file =new File("C:\\Users\\berka\\Desktop\\BM201Hesap.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //BM201Rapor.txt dosyasının konsola yazdırılması.
    public static void readFile3(){
        File file =new File("C:\\Users\\berka\\Desktop\\BM201Rapor.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //BM201Cikti.txt dosyasının konsola yazdırılması.
    public static void readFile4(){
        File file =new File("C:\\Users\\berka\\Desktop\\BM201Cikti.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
