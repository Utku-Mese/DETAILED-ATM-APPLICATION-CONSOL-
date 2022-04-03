
import java.util.Scanner;

public class Main {

    public static void calıstır(Hesap hesap) {

        Scanner input = new Scanner(System.in);

        Login login = new Login();

        int girishakki = 3;

        while (girishakki > 0) {

            if (login.login(hesap) == true) {

                int i = 0;
                while (true) {

                    if (i > 0) {
                        System.out.println("DEVAM ETMEK İSTERMİSİNİZ? (e/h)");
                        String secim = input.next();

                        switch (secim) {
                            case "e":
                                System.out.println("*******************************************");
                                System.out.println("1 -->PARA ÇEKME\n2 -->PARA YATIRMA\n3 -->BAKİYE\n4 -->HESAP BİLGİLERİ\n5 -->ŞİFRE DEĞİŞTİR\nÇIKMAK İÇİN q");
                                System.out.println("*******************************************");
                                System.out.println("LÜTFEN İŞLEM GİRİNİZ...");
                                String islem = input.next();
                                switch (islem) {
                                    case "q":
                                        System.exit(0);
                                    case "1": {
                                        System.out.println("ÇEKİLECEK MİKTARI GİRİNİZ: ");
                                        double miktar = input.nextDouble();
                                        hesap.paracek(miktar);
                                        break;
                                    }
                                    case "2": {
                                        System.out.println("YATIRILACAK MİKTARI GİRİNİZ: ");
                                        double miktar = input.nextDouble();
                                        hesap.parayatır(miktar);
                                        break;
                                    }
                                    case "3":
                                        System.out.println(hesap.getBakiye());
                                        break;
                                    case "4":
                                        hesap.hesapbilgileri();
                                        break;
                                    case "5":
                                        System.out.print("MEVCUT ŞİFREYİ GİRİNİZ: ");
                                        String onay = input.next();

                                        if (hesap.getSifre().equals(onay)) {
                                            System.out.print("YENİ ŞİFREYİ GİRİNİZ: ");
                                            String yenisifre = input.next();
                                            hesap.setSifre(yenisifre);
                                        } else {
                                            System.out.println("YANLIŞ ŞİFRE!");
                                        }
                                }
                                break;
                            case "h":
                                System.exit(0);
                            default:
                                System.out.println("Yanlış seçim!");
                                break;
                        }
                    } else if (i == 0) {
                        System.out.println("*************HOŞGELDİNİZ*************");
                        System.out.println("1 -->PARA ÇEKME\n2 -->PARA YATIRMA\n3 -->BAKİYE\n4 -->HESAP BİLGİLERİ\n5 -->ŞİFRE DEĞİŞTİR\nÇIKMAK İÇİN q");
                        System.out.println("*******************************************");
                        System.out.println("LÜTFEN İŞLEM GİRİNİZ...");
                        String islem = input.next();

                        switch (islem) {
                            case "q":
                                System.exit(0);
                            case "1": {
                                System.out.println("ÇEKİLECEK MİKTARI GİRİNİZ: ");
                                double miktar = input.nextDouble();
                                hesap.paracek(miktar);
                                break;
                            }
                            case "2": {
                                System.out.println("YATIRILACAK MİKTARI GİRİNİZ: ");
                                double miktar = input.nextDouble();
                                hesap.parayatır(miktar);
                                break;
                            }
                            case "3":
                                System.out.println(hesap.getBakiye());
                                break;
                            case "4":
                                hesap.hesapbilgileri();
                                break;
                            case "5":
                                System.out.print("MEVCUT ŞİFREYİ GİRİNİZ: ");
                                String onay = input.next();

                                if (hesap.getSifre().equals(onay)) {
                                    System.out.print("YENİ ŞİFREYİ GİRİNİZ: ");
                                    String yenisifre = input.next();
                                    hesap.setSifre(yenisifre);
                                    System.out.println("ŞİFRE BAŞARIYLA DEĞİŞTİRİLDİ...");
                                } else {
                                    System.out.println("YANLIŞ ŞİFRE!");
                                }
                        }
                    }
                    i++;
                }
            } else {
                girishakki--;
                System.out.println("KALAN DENEME: " + girishakki);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Hesap hesap01 = new Hesap(1111, "123", "Ahmet BAZ", 100.0, "05060513719", "mutkumese@gmail.com");
        Hesap hesap02 = new Hesap(1112, "123", "Ayşe ŞEN", 100.0, "04567850459", "aysebacı@gmail.com");
        Hesap hesap03 = new Hesap(1113, "123", "Hanzade KOŞAR", 100.0, "05439680457", "koşarım@gmail.com");

        System.out.print("LÜTFEN HESAP NUMARANIZI GİRİNİZ: ");
        int hesapno = input.nextInt();

        int hak = 3;
        while (true) {

            switch (hesapno) {
                case 1111 ->
                    calıstır(hesap01);
                case 1112 ->
                    calıstır(hesap02);
                case 1113 ->
                    calıstır(hesap03);
                default -> {
                    System.out.println("BÖYLE BİR HESAP BULUNAMADI!");
                    hak--;
                    System.out.println("KALAN HAK: " + hak);
                }
            }
        }
    }
}
