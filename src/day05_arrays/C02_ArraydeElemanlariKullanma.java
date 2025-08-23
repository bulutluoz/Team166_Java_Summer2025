package day05_arrays;

import java.util.Arrays;

public class C02_ArraydeElemanlariKullanma {

    public static void main(String[] args) {

        int[] sayilar = {3,5,8,1,3,5};

        // sayilar'i data turu array
        // icine konulacak elemanlarin data turu int'dir
        // sayilar array'inin length'i (icine konulacak eleman sayisi) 6 dir ve
        // olusturuldugu 7.satirdan sonra length degistirilemez


        // sayilar array'inin ilk elemanini yazdirin
        System.out.println(sayilar[0]); // 3

        // sayilar array'inin 4.index'deki elemanini yazdirin
        System.out.println(sayilar[4]); // 3

        // sayilar array'ini yazdirin
        System.out.println(sayilar); // [I@2752f6e2

        // biz tum array'i degil ama array'in tum elemanlarini yazdirabiliriz

        System.out.print(sayilar[0] +" " +sayilar[1] +" " +sayilar[2] +" " +
                         sayilar[3] +" " +sayilar[4] +" " +sayilar[5] + "\n");



        // yukarda tek yazdirdigimiz elemanlari loop ile yazdirabilirz

        for (int i = 0; i <=5 ; i++) {
            System.out.print(sayilar[i] + " ");
        } // 3 5 8 1 3 5
        System.out.println("");

        // Eger tum array'i yazdirmak isterseniz
        // Java Arrays class'indan hazir method kullanabiliriz

        System.out.println(Arrays.toString(sayilar)); // [3, 5, 8, 1, 3, 5]

        // Tum array'i yazdirdiginizda Java
        // elemanlari arasina virgul ve bir bosluk birakir








    }
}
