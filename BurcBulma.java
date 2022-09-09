import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int gun, ay;
        String burc = "";

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen doğduğunuz ayı giriniz: ");
        ay = inp.nextInt();

        System.out.print("Lütfen doğduğunuz günü giriniz: ");
        gun = inp.nextInt();

        if(ay >= 1 && ay <=12 && gun >= 1 && gun <= 32) {

            if(((ay == 1) && (gun <= 21)) || ((ay == 12) &&(gun > 22 && gun <= 31)))
                burc = "Oğlak";

            else if ( ((ay == 1) && (gun >21 && gun <= 31)) || ( ay == 2 && gun <= 19 ) )
                burc = "Kova";

            else if ( ((ay == 2) && (gun > 19 && gun <= 29)) || ( ay ==3 && gun <= 20) )
                burc = "Balık";

            else if ( ((ay == 3) && (gun > 20 && gun <= 31)) || (ay == 4 && gun <= 20) )
                burc = "Koç";

            else if( ((ay == 4) &&(gun > 20 && gun <= 30)) || (ay == 5 && gun <= 21) )
                burc = "Boğa";

            else if ( ((ay == 5) && (gun > 21 && gun <= 31)) || (ay == 6 && gun <= 22) )
                burc = "İkizler";

            else if ( ((ay == 6) && (gun > 22 && gun <= 30)) || (ay == 7 && gun <= 22) )
                burc = "Yengeç";

            else if( (ay == 7) && (gun > 22 && gun <= 31) || (ay == 8) && (gun <= 22) )
                burc = "Aslan";

            else if ( (ay == 8) && (gun > 22 && gun <= 31) || (ay == 9 && gun <= 22) )
                burc = "Başak";

            else if ( (ay == 9) && (gun > 22 && gun <= 30) || (ay == 10 && gun <= 22) )
                burc = "Terazi";

            else if ( (ay == 10) && (gun > 22 && gun <= 31) || (ay == 11 && gun <= 21) )
                burc = "Akrep";

            else if( (ay == 11) && (gun > 21 && gun <= 30) || (ay == 12 && gun <= 21) )
                burc = "Yay";

            else
                System.out.println("Lütfen doğduğunuz günün numarasını giriniz.(1-31)");

        }

        else
            System.out.println("Lütfen doğduğunuz ayın numarasını giriniz.(1-12)");

        System.out.println("Burcunuz: "+burc);
    }
}
