import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, answer;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen Kullanıcı Adınızı yazınız: ");
        userName = inp.nextLine();
        System.out.println("Lütfen parolanızı yazınız: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123") ){
            System.out.println("Başarıyla Giriş Yapılmıştır.");

        }else if (!password.equals("java123")) {
            System.out.println("Parola hatalı girildi.");
            System.out.println("Parolayı sıfırlamak ister misiniz? Y/N");
            answer = inp.nextLine();

            if (answer.equals("Y")) {
                System.out.println("Lütfen yeni parolanızı yazınız: ");
                password = inp.nextLine();
                if (password.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            }else if (answer.equals("N")){
                System.out.println("Yeniden giriş yapmak için sayfayı yenileyin");
            }
        }

    }
}
