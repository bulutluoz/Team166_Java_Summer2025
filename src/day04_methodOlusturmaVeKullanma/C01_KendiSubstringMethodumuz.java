package day04_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C01_KendiSubstringMethodumuz {

    public static void main(String[] args) {


        /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        System.out.println("Lutfen metin parcasinin baslangic index'ini girin");
        int basIndex = scanner.nextInt();

        System.out.println("Lutfen metin parcasinin bitis index'ini girin");
        int bitIndex = scanner.nextInt();


        // metin  : Java candir
        // basInd : 2
        // bitInd : 7
        // output : va ca

        if (basIndex<0 || bitIndex<0 || basIndex>metin.length() || bitIndex > metin.length()){
            System.out.println("Verilen index negatif veya metnin uzunlugundan fazla olamaz");
        } else if (basIndex > bitIndex) {
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        }else{
            for (int i = basIndex; i < bitIndex ; i++) {
                System.out.print(metin.charAt(i));
            }
        }


        System.out.println("\n"+ metin.substring(basIndex, bitIndex));




    }
}
