import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        double mesafe, yas, tip, tutar, indirim, topTutar;

        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz");
        mesafe = inp.nextInt();
        System.out.println("Yaşınızı giriniz");
        yas = inp.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tip = inp.nextInt();

        tutar = mesafe * 0.10;
        if (yas<12){
            indirim = tutar * 0.5;
        } else if (yas>=12 && yas<24){
            indirim = tutar * 0.1;
        } else if (yas>65) {
            indirim = tutar * 0.3;
        }else{
            indirim=0;
        }

        topTutar = tutar - indirim;

        if (tip==2){
            topTutar *= 1.6;
        }

        if (mesafe<0 || yas<0 || (tip!=1 && tip!=2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        }else {
            System.out.println("Toplam Tutar =" + topTutar);
        }
    }
}
