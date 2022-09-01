import java.sql.SQLOutput;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKM=2.20, total, startPrice = 10;

        Scanner giris = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden yazınız : ");
        km = giris.nextInt();

        total = startPrice+(km*perKM);

        total = (total<20) ? 20: total;
        System.out.println("Ödmeniz gereken tutar : " + total);
    }
}
