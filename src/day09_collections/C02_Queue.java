package day09_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_Queue {

    public static void main(String[] args) {

        List<String> isimler = new LinkedList<>();
        // bugune kadar List data turunde hep ArrayList kullandik
        // isimler icin data turu yine List
        // ama constructor degisti
        // isimler icin bugune kadar kullandigimiz ArrayList ozellikleri disinda bir ozellik var mi?
        // diye kontrol edelim

        // yeni hicbir method yok




        // Queue (Kuyruk) yapisinda FIFO gecerlidir
        // yeni eklenenler en sona eklenir
        // silinecekler en bastan silinir

        Queue<Integer> sayilar = new LinkedList<>();

        // eskiden kullandigimiz list'de 2 tane add method'u vardi
        // bir tanesi eklenen elementi en sona ekliyordu
        // digeri ise istegimiz index'e eleman eklememizi sagliyordu
        // queue FIFO geregi araya eleman eklememize izin veren method'u kullandirtmiyor
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(2);
        sayilar.add(9);

        System.out.println(sayilar); // [3, 7, 2, 9]


        // Queue kuyruk oldugundan silmenin en bastan yapilmasi lazim

        sayilar.remove();
        // Retrieves and removes the head of this queue.
        // Queue'nun basindaki elementi siler ve method'un calistigi yere getirir
        System.out.println(sayilar); // [7, 2, 9]


        System.out.println( sayilar.remove() ); // 7
        System.out.println(sayilar); // [2, 9]

        System.out.println(sayilar.size()); // 2
        sayilar.clear();
        System.out.println(sayilar); // []


        sayilar.add(30);
        sayilar.add(73);
        sayilar.add(25);
        sayilar.add(98);

        System.out.println(sayilar); // [30, 73, 25, 98]

        sayilar.poll();
        // Retrieves and removes the head of this queue, or
        // returns null if this queue is empty.
        // remove() ve poll()
        // ikisi de ilk elemani siler ve döndürür
        // aralarindaki fark bos bir queue'da calistirildiklarinda
        // remove() exception firlatir, poll() ise null döndürür

        System.out.println(sayilar); // [73, 25, 98]


        System.out.println(sayilar.peek()); // 73
        // Retrieves, but does not remove, the head of this queue,
        // or returns null if this queue is empty.
        // ilk elemani silmeden döndürür
        System.out.println(sayilar); // [73, 25, 98]


        sayilar.offer(88);
        // verilen 88'i queue'ya ekler
        // yani add() ile ayni islevi yapar
        // sadece kucuk bir farkla,
        // EGER queue icin bir eleman sayisi sinirlamasi varsa
        // offer() siniri asan durumlarda elemani eklemez
        // diger bir deyisle 88'in eklenmesini teklif eder,
        // yeriniz varsa eklemek istiyorum der


        sayilar.element();
        // peek() ile ayni islevi yapar
        // tek bir farkla, eger queue bos ise eleman getiremez ve exception firlatir
        // peek() ise bos queue'da calistiginda eleman getiremez onun yerine null dondurur.




    }
}
