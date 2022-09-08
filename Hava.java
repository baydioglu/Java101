import java.util.Scanner;

public class Hava {
    public static void main(String[] args) {
        int heat;

        System.out.print("Lütfen Hava sıcaklığını Giriniz : ");
        Scanner giris = new Scanner(System.in);

        heat = giris.nextInt();

        if (heat<5) {
            System.out.println("Kayak");
        } else if (heat<15) {
            System.out.println("Sinema");
        } else if (heat<25) {
            System.out.println("Piknik");
        } else System.out.println("Yuzme");
    }
}