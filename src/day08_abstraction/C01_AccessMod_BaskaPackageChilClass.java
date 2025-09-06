package day08_abstraction;

import day07_accessModifiers_encapsulations.C04_Datalar;

public class C01_AccessMod_BaskaPackageChilClass extends C04_Datalar {
    // extends C04_Datalar : yazilan bu kodlar, bu class'i C04_Datalar Class'inin child'i yaopar


    public static void main(String[] args) {

    }


    public void method3(){
        System.out.println(strSPub);
        System.out.println(strIPub);
        intSPro = 45; // baska package'da olsak da child oldugu icin ulasabilir
        intIPro = 34;
        // Default access modifier'a sahip olan variable'lar
        // baska package'dan kullanilamaz
        // System.out.println(blSDef);
        // blIDef = true;

        // private bir variable'a olusturuldugu class disindan ULASILAMAZ
        // shrtSPri = 22;
        // System.out.println(shrtIPri);
    }

}




