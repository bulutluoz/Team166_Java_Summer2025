package day04_methodOlusturmaVeKullanma;

public class C06_MetniTerstenYazdirma {

    public static void main(String[] args) {

        // verilen metni tersten yazdiran bir method olusturun

        metniTerstenYazdir("Bugunku konu cok onemli");

    }


    public static void metniTerstenYazdir( String metin){

        for (int i = metin.length()-1  ; i >=0  ; i--) {

            System.out.print(metin.charAt(i));
        }
        System.out.println("");

    }
}
