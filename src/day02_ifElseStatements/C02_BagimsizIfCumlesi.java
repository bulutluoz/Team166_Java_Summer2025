package day02_ifElseStatements;

import java.util.Scanner;

public class C02_BagimsizIfCumlesi {

    public static void main(String[] args) {

        // kullanicidan bir sayi alin
        // sayi pozitif bir sayi ise "girilen sayi gecerli" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi > 0){
            System.out.println("girilen sayi gecerli");
        }

        boolean sonuc = girilenSayi > 0;
        System.out.println("Girilen sayi icin skarsilastirma sonucu : " + sonuc);


    }
}
