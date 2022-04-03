
public class Hesap {

    private int hesapNo;
    private String isim;
    private String sifre;
    private double bakiye;
    private String telefonNo;
    private String email;

    public void hesapbilgileri() {
        System.out.println("HESAP NO: " + this.hesapNo);
        System.out.println("İSİM SOYİSİM: " + this.isim);
        System.out.println("BAKİYE: " + this.bakiye);
        System.out.println("TEL NO: " + this.telefonNo);
        System.out.println("E-MAİL: " + this.email);
    }

    public Hesap(int hesapNo, String sifre, String isim, double bakiye, String telefonNo, String email) {
        this.hesapNo = hesapNo;
        this.sifre = sifre;
        this.isim = isim;
        this.bakiye = bakiye;
        this.telefonNo = telefonNo;
        this.email = email;
    }

    public void parayatır(double miktar) {
        bakiye += miktar;
        System.out.println("*******************************************");
        System.out.println("GÜNCEL BAKİYENİZ: " + this.bakiye);
        System.out.println("*******************************************");
    }

    public void paracek(double miktar) {
        if (miktar > 1500) {
            System.out.println("*******************************************");
            System.out.println("TEK SEFERDE 1500 TL DEN FAZLA PARA ÇEKEMEZSİNİZ!");
            System.out.println("*******************************************");
        }
        if (bakiye < miktar) {
            System.out.println("*******************************************");
            System.out.println("HESABINIZDA YETERLİ PARA BULUNMAMAKTADIR!");
            System.out.println("*******************************************");
        } else {
            bakiye -= miktar;
            System.out.println("*******************************************");
            System.out.println("GÜNCEL BAKİYENİZ: " + this.bakiye);
            System.out.println("*******************************************");
        }
    }

    public int getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getIsim() {
        return isim;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
