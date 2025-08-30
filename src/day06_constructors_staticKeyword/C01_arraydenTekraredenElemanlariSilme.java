package day06_constructors_staticKeyword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_arraydenTekraredenElemanlariSilme {

    public static void main(String[] args) {
        // Verilen bir array'de tekrar eden sayi varsa
        // tekrar eden sayilari silip,
        // array'i her sayidan sadece 1 tane bulunacak sekilde kaydedin
        // ornek input : {2,3,4,5,2,4,2,2,4,2,4,3,5,1}
        //       output : [1,2,3,4,5]

        Integer[] arr = {2,3,4,5,2,4,2,2,4,2,4,3,5,1};
        System.out.println("Array'in ilk hali : " + Arrays.toString(arr));

        // Array'ler olusturulduktan sonra uzunlugu degistirilemez
        // Ancak yeni bir array olusturup eski array'e yeni array atamasi yapilabilir

        // uzunlugu degistirilebilir olan en kolay yapi arrayList oldugundan
        // bir list olusturup tekrarsiz elemanlari oraya koyalim

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (  ! tekrarsizList.contains(arr[i])  ){
                tekrarsizList.add(arr[i]);
            }
        }

        // System.out.println("Listenin son hali : " + tekrarsizList);

        // System.out.println("Array'in son hali : " + Arrays.toString(arr));

        // bizden istenen array'i bu hale dondurmek oldugundan
        // listedeki elemanlari bir sekilde array'e kaydetmeliyiz

        // ArrayList'i array'e çevirme
        Integer[] tekrarsizArr = tekrarsizList.toArray(new Integer[0]);

        //System.out.println("tekrarsiz array'in son hali : " + Arrays.toString(tekrarsizArr));


        // artik eski array'e yeni degerini atayabiliriz
        arr = tekrarsizArr;


        System.out.println("Array'in en son hali : " + Arrays.toString(arr));


    }
}
