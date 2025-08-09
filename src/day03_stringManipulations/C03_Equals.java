package day03_stringManipulations;

public class C03_Equals {

    public static void main(String[] args) {

        String str = "istanbul";

        str = "Istanbul"; // = Java'da karsilastirma islemi yapmaz
                          // = isaretinin Java'daki anlami ATAMA'dir


        // Java'da genel olarak karsilastirma icin == kullanilir

        int sayi = 10 ;
        System.out.println( sayi == 10 ); // true
        System.out.println( sayi-1 == 10 ); // false


        // ama String'de karsilastirma icin == kullanilmasi tercih edilmez
        // cunku karsilastirilan metinler ayni olsa da islem sonucu olarak
        // bazen true bazen false verebilir

        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = new String("Ali");
        String s4 = "A" + "li";

        String str1 = "A";
        String str2 = "li";
        String s5 = str1 + str2 ;

        System.out.println(  s1 == s2  ); // Ali == Ali  ==> true
        System.out.println(  s1 == s3  ); // Ali == Ali  ==> false
        System.out.println(  s1 == s4  ); // Ali == Ali  ==> true
        System.out.println(  s1 == s5  ); // Ali == Ali  ==> false
        System.out.println(  s1 == "Ali"  ); // Ali == Ali  ==> true


        // String'de metinlerin ayni oldugunu kontrol etmek icin
        // equals() kullanilir

        System.out.println("==============");

        System.out.println(  s1.equals(s2)  ); // Ali == Ali  ==> true
        System.out.println(  s1.equals(s3)  ); // Ali == Ali  ==> true
        System.out.println(  s1.equals(s4)  ); // Ali == Ali  ==> true
        System.out.println(  s1.equals(s5)  ); // Ali == Ali  ==> true
        System.out.println(  s1.equals("Ali")  ); // Ali == Ali  ==> true

        // Metinler ayni ise true, karakter farkliligi varsa false verir

        System.out.println("==============");

        System.out.println(  s1.equals("ali")  ); // Ali == ali  ==> false
        System.out.println(  s1.equals("ALI")  ); // Ali == ALI  ==> false
        System.out.println(  s1.equals("Ali ")  ); // Ali == "Ali " ==> false



    }

}
