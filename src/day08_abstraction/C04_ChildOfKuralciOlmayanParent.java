package day08_abstraction;

public class C04_ChildOfKuralciOlmayanParent extends C03_KuralciOlmayanParent{

    /*
        java'da inheritance icin KRAL child class'dir
        - child class istedigi class'i extends keyword kullanarak
          parent edinebilir

        - Child class isterse parent class'daki tum method'lari
          direkt kullanabilir

        - Child class isterse parent class'da var olan method'lari
          kendisine uyarlayabilir

        - Child class isterse parent class'da olmayan
          yeni method'lar barindirabilir
     */

    public static void main(String[] args) {


    }


    public void methodKullanma(){
        method1();
        method2();
        method3();
    }

    public String method2(){
        return "Yasasin Child Class";
    }

    public void method7(){

    }
}
