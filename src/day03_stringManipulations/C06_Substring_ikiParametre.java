package day03_stringManipulations;

public class C06_Substring_ikiParametre {

    public static void main(String[] args) {


        String str = "Java candir";

        System.out.println(str.substring(3,6));   // a c
        // 3.index'deki karakterden basla (3.index dahil)
        // 6.index'e kadar (6.index dahil ndegil) olan degerleri getir

        System.out.println(str.substring(4,8)); // " can"


        // baslangic ve bitis indexleri ayni olursa?

        System.out.println(str.substring( 3,3));
        // hiclik yazdirir


        // baslangic degeri bitis degerinden buyuk olursa
        // StringIndexOutOfBoundsException verir

        // Java candir

        //System.out.println(  str. substring(7,3));


        System.out.println(str.substring(2,3)); // v
        System.out.println(str.substring(0,1)); // J
        System.out.println(str.substring(5,6)); // c


        // ornegin 7.index'deki karakteri yazdiralim
        System.out.println(str.charAt(7)); // n

        System.out.println(str.substring(7,8)); // n

        // aralarindaki en onemli fark
        // substring bize string getirdigi icin manipule edilebilir

        // str.charAt(5).toLowerCase();

        str.substring(5,6).toLowerCase();
    }
}
