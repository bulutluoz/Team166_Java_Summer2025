package day03_stringManipulations;

public class C05_Substring_tekParametre {

    public static void main(String[] args) {

        String str = "Java cok guzel";

        System.out.println(str.substring(3)); // a cok guzel

        System.out.println( str.substring(7)); // k guzel

        System.out.println(str.substring(0)); // Java cok guzel


        System.out.println(str.length()); // 14

        // sondan 3.karakteri yazdirin
        System.out.println(str.charAt(str.length() - 3)); // z


        // sondan 3 karakteri yazdirin  "zel"
        System.out.println( str.substring( str.length()-3));


        // System.out.println(str.charAt(14));
        // NOT : CharAt length veya daha buyuk bir sayiyi
        // index olarak kullanmak istedigimizde
        // StringIndexOutOfBoundsException verir

        System.out.println(str.substring(14));

        // CharAt ile substring arasindaki en onemli fark
        // index olarak length yani karakter sayisi veya daha buyuk bir sayi girilirse
        // CharAt exception firlatir
        // substring() ise length degeri icin "hiclik" sonucunu dondurur

        str = "Ali";

        // System.out.println(str.charAt(3));// exception verir

        System.out.println(str.substring(3)); // hiclik (bos bir satir) yazdirir

        // length() degerinden buyuk sayilar icin ikisi de exception verir


        // System.out.println(str.charAt(5));// exception verir

        // System.out.println(str.substring(5)); // exception verir
    }
}
