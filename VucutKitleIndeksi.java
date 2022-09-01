import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kilo, indeks;

        Scanner giris = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = giris.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = giris.nextDouble();

        indeks = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " +indeks);

    }
}
