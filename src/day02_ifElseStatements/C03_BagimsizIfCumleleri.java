package day02_ifElseStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        // girilen sayiyi kontrol edin ve 50'den kucukse degerini 20 artirin
        // son degeri bir daha kontrol edip sayi 50'den buyukse "gorev tamamlandi" yazdirin


        // kullanicidan bir sayi isteyin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        // girilen sayiyi kontrol edin ve 50'den kucukse degerini 20 artirin
        if (sayi<50){
            sayi += 20;
        }


        // son degeri bir daha kontrol edip sayi 50'den buyukse "gorev tamamlandi" yazdirin

        if (sayi>50){
            System.out.println("gorev tamamlandi");
        }



    }
}
