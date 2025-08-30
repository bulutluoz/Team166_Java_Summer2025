package day06_constructors_staticKeyword;

public class C07_ReturnIleIndirimHesabi {

    public static void main(String[] args) {
        // verilen fiyat uzerinden %10 ve %20 indirim yapip
        // indirimli fiyati donduren 2 method olusturun
        double urunFiyati = 500;
        System.out.println(yuzde10indirim(urunFiyati));

        System.out.println(yuzde20indirim(urunFiyati));

        System.out.println(yuzde20indirim(urunFiyati));
    }

    public static double yuzde10indirim(double urunFiyati){
        urunFiyati = urunFiyati * 90 / 100 ;
        return urunFiyati;
    }


    public static double yuzde20indirim(double urunFiyati){
        urunFiyati = urunFiyati * 80 / 100 ;
        return urunFiyati;
    }
}
