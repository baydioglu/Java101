import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tutar, kdvoran, toplam, kdvtutar ;
        System.out.println("Tutar giriniz = ");
        tutar = input.nextDouble();
        if (tutar <= 1000 && tutar>0 ){
            kdvoran = 0.18;
            kdvtutar = tutar * kdvoran;
            toplam = tutar + kdvtutar;
            System.out.println("KDV'siz tutar = "+tutar);
            System.out.println("KDV oranı = "+kdvoran);
            System.out.println("KDV tutarı = "+kdvtutar);
            System.out.println("KDV'li fiyat = "+toplam);
        }
        if (tutar >1000) {
            kdvoran = 0.08;
            kdvtutar = tutar * kdvoran;
            toplam = tutar + kdvtutar;
            System.out.println("KDV'siz tutar = " + tutar);
            System.out.println("KDV oranı = " + kdvoran);
            System.out.println("KDV tutarı = " + kdvtutar);
            System.out.println("KDV'li fiyat = " + toplam);
        }
        if (tutar <0 ) {
            System.out.println("Lütfen 0'dan büyük sayılar giriniz");
            }
        }
    }
