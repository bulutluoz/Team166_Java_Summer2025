package day09_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_Deque {

    public static void main(String[] args) {


        List<String> isimler = new LinkedList<>();
        // data turu List secildigi icin
        // isimler LinkedList bizim daha once gordugumuz
        // ArrayList ile ayni ozelliklere sahip


        Queue<Integer> sayilar = new LinkedList<>();
        // data turu QUEUE secildigi icin
        // sayilar LinkedList FIFO ozellikleri tasir
        // eklemeler sona yapilirken,
        // silme islemleri en bastan yapilir
        // aradaki index'lere ekleme veya ardan silme OLMAZ


        Deque<String> sehirler = new LinkedList<>();
        // data turu Deque(Double ended queue - iki uclu kuyruk) secildigi icin
        // sehirler LinkedList iki uctan ekleme ve cikarma yapacak ozelliklere (method) sahiptir
        // ayni zamanda Deque Queue'nun child'i oldugundan
        // Queue'daki tum method'lari da kullanabilir

        sehirler.add("Adana");

        System.out.println(sehirler); // [Adana]

        sehirler.add("Eskisehir"); // en sona ekler

        System.out.println(sehirler); // [Adana, Eskisehir]

        sehirler.addLast("Ankara");
        sehirler.addFirst("Istanbul");

        System.out.println(sehirler); // [Istanbul, Adana, Eskisehir, Ankara]

        // diger butun method'larda da
        // double ended yapisindan dolayi en basa veya en sona tercihini
        // yapabilecegimiz method'lar barindirir

        sehirler.remove();  // Retrieves and removes the head of the queue

        sehirler.removeFirst(); // Retrieves and removes the first element of this deque.

        sehirler.removeLast(); // Retrieves and removes the last element of this deque.

        sehirler.removeFirstOccurrence("Hatay");
        sehirler.removeLastOccurrence("Hatay");

        /*
            [Istanbul, Hatay, Adana, Hatay, Eskisehir, Ankara, Hatay]
            remove() : hangi sehir olduguna bakmadan bastaki sehri siler
            removeFirst() : hangi sehir olduguna bakmadan bastaki sehri siler
            removeLast() : hangi sehir olduguna bakmadan sondaki sehri siler
            removeFirstOccurrence("Hatay") : Hatay sehrinin ilkini(1.index) siler
            removeLastOccurrence("Hatay") : Hatay sehrinin sonuncusunu(6.index) siler
         */







    }
}
