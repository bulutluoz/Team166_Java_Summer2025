package day04_methodOlusturmaVeKullanma;

public class C08_ismiDuzenle {

    public static void main(String[] args) {

        //   Verilen isim ve soyismi alip
        //   Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //   isim bosluk soyisim seklinde yazdiran bir method olusturun
        //   input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz

        ismiDuzenleYazdir("ali","yilmaz");

        ismiDuzenleYazdir("HASAN","KUCUK");



    }


    public static void ismiDuzenleYazdir(String isim, String soyisim){

        isim = isim.substring(0,1).toUpperCase() + // ismin 1.harfi buyuk harf yapildi
               isim.substring(1).toLowerCase(); // kalan harfler kucuk harf yapildi

        soyisim = soyisim.substring(0,1).toUpperCase()+
                  soyisim.substring(1).toLowerCase();

        System.out.println(isim+ " " + soyisim);

    }
}
