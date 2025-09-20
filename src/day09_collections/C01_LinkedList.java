package day09_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {

    public static void main(String[] args) {


        // List<String> isimlerListesi = new List<>();
        // 'List' is abstract; cannot be instantiated
        // List abstract oldugundan direkt obje olusturulamaz
        // Abstract yapilardan obje olusturabilmek icin child class'larinin constructor'i kullanilabilir
        List<String> isimlerListesi = new LinkedList<>();


        // Queue<Integer> sayilarQueue = new Queue<>();
        // 'Queue' is abstract; cannot be instantiated
        Queue<Integer> sayilarQueue = new LinkedList<>();


        // Deque<Integer> numbersDeque = new Deque<>();
        // 'Deque' is abstract; cannot be instantiated
        Deque<Integer> numbersDeque = new LinkedList<>();



        LinkedList<String> sehirler = new LinkedList<>();


    }



}
