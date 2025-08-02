package day02_ifElseStatements;

import java.util.Scanner;

public class C07_SayacMethodu {
    public static void main(String[] args) {

        // kullanicidan 2 tam sayi alin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int sayac = 0;

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin
        if (sayi1<sayi2){
            System.out.println("birinci sayi daha kucuk");
            sayac++;
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin
        if (sayi1 > 0){
            System.out.println("birinci sayi sifirdan buyuk");
            sayac++;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin
        if (sayi2 > 50){
            System.out.println("ikinci sayi 50'den buyuk");
            sayac++;
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin
        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
            sayac++;
        }

        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        // sayac en basta 0'di
        // en sona gelindiginde sayac 0,1,2,3 veya 4 olabilir
        // sayac 0 ise yukardaki 4 maddeden HICBIRI yazdirmamis demektir

        if (sayac == 0){
            System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");
        }

    }
}
