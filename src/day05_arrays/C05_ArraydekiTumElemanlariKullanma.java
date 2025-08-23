package day05_arrays;

public class C05_ArraydekiTumElemanlariKullanma {

    public static void main(String[] args) {

        int[] sayilar = {4,6,2,6,8,1,2,5,8,0,1,3,5,6,8};

        // sayilar arrayindeki tum elementlerin toplamini asagidaki gibi yazdirin
        // output : array'deki ... sayinin toplami = ....


        // Bir arry'deki tum elementleri elden gecirmeniz gerekiyorsa for loop kullanacagiz

        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {
            toplam += sayilar[i];
        }

        System.out.println("array'deki " + sayilar.length + " sayinin toplami = " + toplam);
        // array'deki 15 sayinin toplami = 65


        // array'de kac tane tek sayi bulundugunu yazdirin

        int sayac = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            if( sayilar[i] % 2 != 0 ){
                sayac++;
            }

        }

        System.out.println("array'de " + sayac + " adet tek sayi var");


        // sayilar array'indeki en buyuk sayiyi yazdirin
        // {4,6,2,6,8,1,2,5,8,0,1,3,5,6,8}

        int enBuyukSayi = sayilar[0];

        for (int i = 0; i <sayilar.length ; i++) {

            if (sayilar[i] > enBuyukSayi){
                enBuyukSayi = sayilar[i];
            }

        }

        System.out.println("Array'deki en buyuk sayi : " + enBuyukSayi);


        // array'deki cift sayilarin toplamini yazdirin
        // {4,6,2,6,8,1,2,5,8,0,1,3,5,6,8}
        toplam = 0;

        for (int i = 0; i <sayilar.length ; i++) {

            if ( sayilar[i] % 2 == 0){
                toplam += sayilar[i];
            }
        }

        System.out.println("Array'deki cift sayilarin toplami : " + toplam);
        // Array'deki cift sayilarin toplami : 50


        // array'deki en kucuk sayiyi yazdirin
        int enKucukSayi = sayilar[0];

        for (int i = 0; i <sayilar.length ; i++) {

            if (sayilar[i] < enKucukSayi){
                enKucukSayi = sayilar[i];
            }
        }

        System.out.println("Array'deki en kucuk sayi : " + enKucukSayi);


    }
}
