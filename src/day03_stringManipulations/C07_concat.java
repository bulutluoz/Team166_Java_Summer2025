package day03_stringManipulations;

public class C07_concat {
    public static void main(String[] args) {

        String s1 = "a";
        String s2 = "l";
        String s3 = "i";

        int i1 = 4;
        int i2 = 5;


        // Stringleri birlestirip ali yazdirin

        System.out.println(  s1 + s2 + s3  ); // ali

        // aynisini cocat ile yapin

        System.out.println(  s1.concat(s2).concat(s3) ); // ali

        // ali54 yazdiralim

        System.out.println(s1 + s2 + s3 + i2 + i1); // ali54

        // concat ile yapalim
        // concat islemi sadece String kabul eder
        // String disinda bir deger kullanilirsa hata verir

        // System.out.println(s1.concat(s2).concat(s3).concat(i2).concat(i1));

        System.out.println(s1.concat(s2).concat(s3).concat(i2+"").concat(i1+""));

    }
}
