package day06_constructors_staticKeyword;

public class C06_PassByValueGercekhayatOrnegi {

    public static void main(String[] args) {
        // verilen fiyat uzerinden %10 ve %20 indirim yapip
        // indirimli fiyati yazdiran 2 method olusturun

        int urunFiyati = 500;
        yuzde10indirim(urunFiyati);
        yuzde20indirim(urunFiyati);
        yuzde20indirim(urunFiyati);
        yuzde10indirim(urunFiyati);

    }


    public static void yuzde10indirim(double urunFiyati){
        urunFiyati = urunFiyati * 90 / 100 ;
        System.out.println("%10 indirimli fiyat : " + urunFiyati);
    }


    public static void yuzde20indirim(double urunFiyati){
        urunFiyati = urunFiyati * 80 / 100 ;
        System.out.println("%20 indirimli fiyat : " + urunFiyati);
    }





}
