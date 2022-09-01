import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double ar=2.14, el=3.67,dom=1.11, mu=0.95, pa=5.00;
        double art, arkg, elt, elkg, domt, domkg, mut, mukg, pat, pakg, Toplam;

        Scanner giris = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        arkg = giris.nextDouble();
        System.out.println("Elma Kaç Kilo ? :");
        elkg = giris.nextDouble();
        System.out.println("Domates Kaç Kilo ? :");
        domkg = giris.nextDouble();
        System.out.println("Muz Kaç Kilo ? :");
        mukg = giris.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? :");
        pakg = giris.nextDouble();

        art=ar*arkg;
        elt=el*elkg;
        domt=dom*domkg;
        mut=mu*mukg;
        pat=pa*pakg;

        Toplam = art + elt+domt+mut+pat;
        System.out.println("Toplam Tutar :" + Toplam);

    }
}
