package day02_ifElseStatements;

import java.util.Scanner;

public class C08_FlagMetodu {
    public static void main(String[] args) {

        // kullanicidan 2 tam sayi alin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int flag = 23; // HERHANGI bir deger olabilir

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin
        if (sayi1<sayi2){
            System.out.println("birinci sayi daha kucuk");
            flag = 34;
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin
        if (sayi1 > 0){
            System.out.println("birinci sayi sifirdan buyuk");
            flag = 34;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin
        if (sayi2 > 50){
            System.out.println("ikinci sayi 50'den buyuk");
            flag = 34;
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin
        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
            flag = 34;
        }

        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        // en basta flag 23'du
        // sona gelindiginde flag ya 23 olur ya da 34

        // EGER flag 23 ise ilk 4 sarttan hicbiri bir sey yazdirmadi demektir

        if (flag == 23){
            System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");
        }

    }
}
