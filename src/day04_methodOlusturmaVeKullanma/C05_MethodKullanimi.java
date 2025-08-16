package day04_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C05_MethodKullanimi {

    public static void main(String[] args) {

        // kullanicidan bir sayi isteyip
        // girilen sayinin asal sayi olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen asal sayi kontrolu yapilacak sayiyi girin");
        int girilenSayi = scanner.nextInt();

        C04_AsalMi.asalMiYazdir(girilenSayi);
    }
}
