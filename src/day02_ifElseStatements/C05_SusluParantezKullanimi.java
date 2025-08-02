package day02_ifElseStatements;

import java.util.Scanner;

public class C05_SusluParantezKullanimi {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi girin...");
        int sayi = scanner.nextInt();

        /*
            EGER if statement'da {} kullanilmazsa
            Java if body olarak
            ilk ; e kadar olan kismi alir
            sonraki kodlarin if ile ilgisi OLMAZ
         */

        if (sayi%3 == 0)
            System.out.println("Uc ile bolunebilen sayi");
            System.out.println("3");


        if (sayi%5 == 0)
            System.out.println("Bes ile bolunebilen sayi");
            System.out.println("5");

    }
}
