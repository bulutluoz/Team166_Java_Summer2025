package day08_abstraction;

import day07_accessModifiers_encapsulations.C04_Datalar;

public class C02_AccessMod_BaskaPackageChildOlmayanClass {


    public static void main(String[] args) {


    }

    public void method1(){

        // baska bir class'daki variable'lara ulasmak icin obje olusturalim
        C04_Datalar datalar = new C04_Datalar();

        // Public variable'lara her yerden ulasilabilir
        System.out.println(datalar.strSPub);
        System.out.println(datalar.strIPub);

        // Datalar ile ayni package'da degil, child class da olmadigindan ulasilamaz
        // datalar.intSPro = 45;
        // datalar.intIPro = 34;

        // Default access modifier'a sahip olan variable'lar
        // baska package'dan kullanilamaz
        // System.out.println(datalar.blSDef);
        // datalar.blIDef = true;

        // private bir variable'a olusturuldugu class disindan ULASILAMAZ
        //datalar.shrtSPri = 22;
        //System.out.println(datalar.shrtIPri);
    }


}


