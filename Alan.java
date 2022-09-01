import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        int a,b,c;
        double u,A;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Birinci kenar uzunluğunu giriniz: ");
        a = girdi.nextInt();
        System.out.println("İkinci kenar uzunluğunu giriniz: ");
        b = girdi.nextInt();
        System.out.println("Üçüncü kenar uzunluğunu giriniz: ");
        c = girdi.nextInt();
        u = (a+b+c)/2;
        A = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı:" + A);
    }
}
