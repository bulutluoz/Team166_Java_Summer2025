package day03_stringManipulations;

public class C02_CharAt {

    public static void main(String[] args) {

        String str = "Java Guzeldir.";

        // str'in ilk harfini yazdirin

        System.out.println(  str.charAt(0) ); // Java'da index hep 0'dan baslar   J


        // Sadece ilk karakter degil, tum karakterlere charAt() ile ulasilabilir


        // str'in 7.karakterini yazdirin  "u"
        System.out.println(str.charAt(6));


        // str'in 40.karakterini yazdirin

        // System.out.println( str.charAt(23)); // StringIndexOutOfBoundsException
                                                // verilen index sinirlarin disinda


        // Java Guzeldir. metninde sondan 3.karakteri yazdirin. // i
        System.out.println( str.charAt(11)); // i

        str = "Java";
        // sondan 3.karakter icin yukaridaki kodu yazsak
        // System.out.println( str.charAt(11)); // i

        // Dinamik olarak sondaki veya sondan 3. gibi sondan karakter saymamiz istenirse
        // length kullanilir


        // str'in 4 karakterli oldugu biliniyorsa - - - -
        // sondan 3.karakteri nedir?

        System.out.println(str.charAt(1)); // a


        str = "Yaprak Sinem Yilmaz Demir";

        // sondan 2.karakteri yazdirin 23

        System.out.println( str.charAt(23));// i


        // length() method'u String bir ifadedeki karakter sayisini verir

        System.out.println(  str.length() ); // 25

        // 25 karakter olduguna gore son karakterin indexi 24
        System.out.println(str.charAt(24)); // r

        // sondan 2.karakter

        System.out.println(str.charAt(25-2)); // i

        System.out.println(str.charAt( str.length() -2 ));
        // 62.satirdaki kod, str ne olursa olsun hep sondan 2.karakteri verir


        str = "java";

        System.out.println(str.charAt( str.length() -2 )); // v

        str = "Bugun hava cok guzel";

        System.out.println(str.charAt( str.length() -2 )); // e




    }
}
