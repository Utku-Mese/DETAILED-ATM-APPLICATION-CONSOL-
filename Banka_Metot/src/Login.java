
import java.util.Scanner;

public class Login {

    public boolean login(Hesap hesap) {

        Scanner input = new Scanner(System.in);

        System.out.println("************  HOŞGELDİNİZ LÜTFEN GİRİŞ YAPINIZ...  ************");

        System.out.print("HESAP NO: ");
        int hesapNo = input.nextInt();
        input.nextLine();

        System.out.print("ŞİFRE: ");
        String sifre = input.nextLine();

        if (hesap.getHesapNo() == hesapNo && hesap.getSifre().equals(sifre)) {

            return true;
        } else {
            System.out.println("YANLIŞ HESAP NO YA DA ŞİFE!");
            return false;
        }
    }
}
