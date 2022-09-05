import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz, topDers, topNot;
        topNot = 0;
        topDers = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuzu girin: ");
        mat = inp.nextInt();
        if(!(mat <= 0 || mat > 100)) {
            topNot += mat;
            topDers++;
        }


        System.out.println("Fizik Notunuzu girin: ");
        fiz = inp.nextInt();
        if(!(fiz <= 0 || fiz > 100)) {
            topNot += fiz;
            topDers++;
        }


        System.out.println("Türkçe Notunuzu girin: ");
        tur = inp.nextInt();
        if(!(tur <= 0 || tur > 100)) {
            topNot += tur;
            topDers++;
        }

        System.out.println("Kimya Notunuzu girin: ");
        kim = inp.nextInt();
        if(!(kim <= 0 || kim > 100)) {
            topNot += kim;
            topDers++;
        }

        System.out.println("Müzik Notunuzu girin: ");
        muz = inp.nextInt();
        if(!(muz <= 0 || muz > 100)) {
            topNot += muz;
            topDers++;
        }

        double average = topNot/topDers;

        if (average<=55) {
            System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere!");
        }else {
            System.out.println("Tebrikler, sınıfı geçtiniz");
        }

        System.out.println("Ortalamanız = " + average);


    }
}