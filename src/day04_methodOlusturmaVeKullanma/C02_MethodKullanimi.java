package day04_methodOlusturmaVeKullanma;

public class C02_MethodKullanimi {

    public static void main(String[] args) {

        String str = "Java Candir";

        str.toUpperCase();
        // toUpperCase() gorevini yapti ve str'i buyuk harfe cevirdi
        // ammmmaaa yazdirilmadigi icin konsolda gorunmuyor
        // atama yapilmadigi icin str'da degismedi


        System.out.println(str.toLowerCase());
        // toLowerCase() gorevini yapar
        // yazdirildigi icin konsolda goruruz
        // atama yapilmadigi icin str degismedi

        str = str.substring(0,4);
        // substring(0,4)
        // yazdirilmadigi icin method'un "döndürdüğü" sonuc konsolda gorunmedi
        // amma kaydedildigi icin str artik degisti

        System.out.println(str); // Java

        

    }
}
