package day06_constructors_staticKeyword;

public class C02_PassByValue {

    public static void main(String[] args) {

        int sayi = 20;
        // Java'da ayni method icinde, ayni isimde 2 variable OLUSTURULAMAZ

        // int sayi = 40; // Variable 'sayi' is already defined in the scope

        // String sayi = "iki"; // Variable 'sayi' is already defined in the scope
        System.out.println("Main method'da sayi variable nin degeri : " + sayi); // 20
        method1(sayi);
        System.out.println("Main method'da method call'dan sonra sayi variable nin degeri : " + sayi); // 20

        method2(sayi);
        System.out.println("Main method'da method2 call'dan sonra sayi variable nin degeri : " + sayi); // 20

    }

    public static void method1(int sayi){
        sayi = 4 * sayi ;
        System.out.println("method'da sayi variable nin degeri : " + sayi);
    }

    public static void method2 (int a){
        a = 4 * a;
        System.out.println("method'da a variable nin degeri : " + a);
    }

}
