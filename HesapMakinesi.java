import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, islem;


        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı giriniz :");
        n1= input.nextInt();
        System.out.print("İkinci Sayıyı giriniz :");
        n2= input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("İşleminizi seçiniz : ");
        islem = input.nextInt();

        switch (islem){

            case 1:
                System.out.println(" Toplam =" + (n1+n2));
                break;

            case 2:
                System.out.println(" Fark =" + (n1-n2));
                break;

            case 3:
                System.out.println(" Çarpım =" + (n1*n2));
                break;

            case 4:
                if(n2==0)
                    System.out.println("0 ile bölme işlemi yapılamaz");
                else if (n1==0)
                    System.out.println(" Bölüm = 0'dır");
                else
                System.out.println(" Bölüm =" + (n1/n2));
                break;

        }

    }
}
