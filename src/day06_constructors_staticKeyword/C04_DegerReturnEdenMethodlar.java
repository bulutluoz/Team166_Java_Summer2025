package day06_constructors_staticKeyword;

public class C04_DegerReturnEdenMethodlar {

    public static void main(String[] args) {
        int sayi = 11;

        System.out.println("Main method icinde sayi : " + sayi);

        System.out.println("Method call : " + method1(sayi));

        System.out.println("Method call'dan sonra sayi : " + sayi);

    }


    public static int method1(int sayi){

        sayi = sayi + 10;
        System.out.println("Method icinde sayi : " + sayi);

        return sayi;

    }
}
