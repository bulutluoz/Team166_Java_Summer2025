package day04_methodOlusturmaVeKullanma;

public class C04_AsalMi {

    public static void main(String[] args) {

        // Verilen bir tamsayinin,
        // asal sayi olup olmadigini kontrol edip, sonucu yazdiran bir method olusturun

        asalMiYazdir(20);
        asalMiYazdir(17);

    }

    public static void asalMiYazdir( int sayi ){

        for (int i = 2; i < sayi ; i++) {


            if (sayi % i == 0){
                System.out.println("Asal degil");
                break;
            }

            if (i == sayi-1){

                System.out.println("Sayi asal");
            }

        }
    }

}
