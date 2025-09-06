package day07_accessModifiers_encapsulations;

public class C05_AyniPackagedakiBaskaClass {

    public static void main(String[] args) {

    }


    public void method1(){
        // baska bir class'daki variable'lara ulasmak icin obje olusturalim
        C04_Datalar datalar = new C04_Datalar();

        System.out.println(datalar.strSPub);
        System.out.println(datalar.strIPub);
        datalar.intSPro = 45;
        datalar.intIPro = 34;
        System.out.println(datalar.blSDef);
        datalar.blIDef = true;
        // private bir variable'a olusturuldugu class disindan ULASILAMAZ
        //datalar.shrtSPri = 22;
        //System.out.println(datalar.shrtIPri);

    }
}
