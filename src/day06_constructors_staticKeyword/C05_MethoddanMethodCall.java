package day06_constructors_staticKeyword;

public class C05_MethoddanMethodCall {

    public static void main(String[] args) {

        String str = "Ali";
        System.out.println("Main method'da str : " + str);

        System.out.println("Method call : " + method1(str));

        System.out.println("Method call'dan sonra main method'da str : " + str);
    }


    public static String method1(String str){
        method2(str);
        str = str.substring(0,1);
        System.out.println("Method1 icinde str : " + str);

        return str;
    }


    public static void method2(String metin){

        metin = metin.toUpperCase();
        System.out.println("method2'de metin : " + metin);
    }





}
