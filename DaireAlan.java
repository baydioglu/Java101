import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        int r, a;
        double pi=3.14, A;

        Scanner giris = new Scanner(System.in);

        System.out.println("Yarıçapı giriniz: ");
        r = giris.nextInt();
        System.out.println("Merkez açısını giriniz: ");
        a = giris.nextInt();
        A = (pi*r*r*a)/360;

        System.out.println("Alan : " +A);

    }
}
