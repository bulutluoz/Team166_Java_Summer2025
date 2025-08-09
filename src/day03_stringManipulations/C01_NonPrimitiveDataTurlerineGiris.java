package day03_stringManipulations;

import java.util.Locale;

public class C01_NonPrimitiveDataTurlerineGiris {

    public static void main(String[] args) {


        int sayi = 10;

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str.toLowerCase()); // java candir


        System.out.println(str); // Java Candir


        // kalici olarak buyuk harfe cevirelim

        str = str.toUpperCase();

        System.out.println("Atama yapildiktan sonra str : " + str);
        // Atama yapildiktan sonra str : JAVA CANDIR


        System.out.println(str.toLowerCase()); // java candir ?   XXXXjava candır ?XXXX



        // Eger buyuk/kucuk harf donusumlerinde ingilizceden farkli bir donusum varsa
        // ingilizce de i==> I   Turkce i => İ  ı==>I

        // bu tur local dil farkliliklari icin ozel bir method var

        // JAVA CANDIR 'i Turkce karakterlere uygun olarak "java candır" seklinde kucuk harfe cevirin

        System.out.println(  str.toLowerCase(Locale.CHINESE)  ); // java candir

        System.out.println( str.toLowerCase(Locale.forLanguageTag("Tr"))); // java candır


        str = str.toLowerCase(Locale.forLanguageTag("Tr"));

        System.out.println( str ); // java candır
    }
}
