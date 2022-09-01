
import java.util.Scanner;

public class NotOrtalama {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


            System.out.println("Türkçe ortalamanizi girin: ");
            double tr=input.nextDouble();

            System.out.println("MAtematik ortalamanizi girin : ");
            double mat=input.nextDouble();

            System.out.println("Fizik ortalamanizi girin: ");
            double fz=input.nextDouble();

            System.out.println("Kimya ortalamanizi girin: ");
            double kim=input.nextDouble();

            System.out.println("Tarih ortalamanizi girin: ");
            double tar=input.nextDouble();

            System.out.println("Müzik ortalamanizi girin: ");
            double muz=input.nextDouble();

            double toplam=(tr+mat+fz+kim+tar+muz);
            double ort=toplam/6;


            System.out.println("Ortalama: " + ort);
            System.out.println(ort>60 ? "Sınıfı GEçti" : "Sınıfta Kaldı");
        }
    }
