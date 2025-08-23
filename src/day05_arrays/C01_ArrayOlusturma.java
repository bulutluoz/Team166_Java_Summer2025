package day05_arrays;

public class C01_ArrayOlusturma {

    public static void main(String[] args) {


        int sayi = 20;

        // int sayilar = {2,3,5,7,8,9}; // Array initializer is not allowed here
                                     // primitive int olarak olusturulan bir variable'a birden fazla deger atanamaz

        int sayilar[] = {2,3,5,7,8,9};

        String[] harfler = {"a","K","t","s","q","o","p"};

        /*
            [] variable'in primitive data turunde degil
                           Array data turunde olusturuldugunu belirtir

             sayilar ve harfler variable'larinin data turu "Array" dir
             bunu []'lerden anliyoruz

             basta yazan int ve String sayilar ve harfler variable'larinin data turu DEGIL
             bu array'lere konulacak elementlerin data turudur.

             Array olusturulurken 2 sey deklare edilmek zorundadir
             1- icine konulacak elemanlarin data turu
             2- icine kac eleman konulacagi
                Eger Array olusturulurken direkt olarak elemanlar ataniyorsa
                Java array'in kapasitesi olarak yazilan eleman sayisini kabul eder
                yukardaki orneklere bakilirsa
                sayilar array'i 6 int eleman barindirir
                harfler array'i ise 7 String eleman barindirir

             NOT : array'in olusturuldugu satirda belirlenen eleman sayisi
                   sonradan degistirilemez
                   10 kisilik minubusu kesip bicip 2 kisilik spor araba yapilmaz :)
         */


    }
}
