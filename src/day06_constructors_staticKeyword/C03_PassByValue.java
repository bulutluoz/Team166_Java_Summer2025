package day06_constructors_staticKeyword;

public class C03_PassByValue {

    public static void main(String[] args) {


        String isim = "Ali Can";

        System.out.println("main method'da isim : " + isim);

        buyukYazdir(isim);

        System.out.println("method call'dan sonra isim : " + isim);

    }


    public static void buyukYazdir(String name){

        System.out.println("Method'da name : " + name.toUpperCase());

        // System.out.println(isim); // bu mahallede isim variable'i yok
        // 12.satirda method call yapilirken "isim" variable'i
        // buyukYazdir()'una yollandi
        // AAMMMMMAAAA Java method'lar arasi variable yollanirken
        // variable'in kendisini (referrence) DEGIL
        // variable'in degerini (value) GONDERIR
        // Cunku Java PASS BY VALUE ozelligini kabul etmistir
    }

}
