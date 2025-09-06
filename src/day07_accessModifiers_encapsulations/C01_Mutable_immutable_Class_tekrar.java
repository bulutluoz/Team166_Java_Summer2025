package day07_accessModifiers_encapsulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Mutable_immutable_Class_tekrar {

    public static void main(String[] args) {

        String metin = "Java Candir";

        metin.toUpperCase();

        // yazdirmadigimiz icin konsolda gormeyiz ama 9.satirda java metni JAVA CANDIR yapar

        System.out.println(metin); // Java Candir

        System.out.println("15. satirda metin : " + metin.toLowerCase()); // java candir

        System.out.println("17. satirda metin : " + metin); // Java Candir

        metin = metin.substring(0,4);

        System.out.println("21. satirda metin : " + metin); // Java

        /*
            String immutable bir class'dir
            bu bilginin bize yansiyan en onemli sonucu
            hazir method'larla yapilan degisikler KALICI olmaz
            kalici degisiklik istenirse
            ATAMA yapilmalidir
         */
        //System.out.println(sayilar);
        /*
            Java runTime programdir
            yanii siz calistirmaya basladiginizda
            HERSDEY SIFIRDAN baslar
            calisma devam ettigi surece (consoldaki tus kirmizi oldugu surece)
            yapilan degisiklikler KALICI olur

            Java'nin calismasi durdugunda (consoldaki tus griye dondugunde)
            yapilan tum degisiklikler cope gider

            bir sonraki calismada hersey yine sifirdan baslar
         */


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,7,8,9,2,3));

        System.out.println("38.satirda sayilar : " +sayilar); // [4, 7, 8, 9, 2, 3]

        sayilar.remove(2); // 8'i siler

        System.out.println("42.satirda sayilar : " +sayilar); // [4, 7, 9, 2, 3]

        sayilar.add(11);

        System.out.println("42.satirda sayilar : " +sayilar); // [4, 7, 9, 2, 3, 11]

        /*
            ArrayList mutable(degistirilebilir)dir.
            Bu bilginin bize yansiyan en buyuk sonucu
            bir listede hazir method'la yapilan degisiklik KALICI olur
            ATAMA yapma mecburiyeti YOKTUR
         */

        String str = "Java gercekten cok guzeldir";

        /*
            str bir variable'dir
            String str variable'i icin data turudur.

            String genel olarak bakildiginda bir Class'dir


         */


        Integer sayi = 10;



    }
}
