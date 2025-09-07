package day07_accessModifiers_encapsulations;

public class C06_GormeVeAtamaYetkileriniAyirma {

    public static void main(String[] args) {

        C04_Datalar datalar = new C04_Datalar();

        // Encapsulation'in temel amaci
        // bir datayi goruntuleme (READ yetkisi) ve
        // o dataya deger atama (WRITE yetkisi) yetkilerini birbirinden ayirmaktir

        // Bunu access modifier ile YAPAMAYIZ
        // Access modifier ile bir variable'a ulasilabiliyorsa
        // hem degeri gorulur hem de deger atanabilir

        System.out.println(datalar.strSPub);  // Public static String
        datalar.strSPub = "Yeni deger";
        System.out.println(datalar.strSPub); // Yeni deger

        System.out.println(datalar.intIPro); // 0
        datalar.intIPro = 55;
        System.out.println(datalar.intIPro); // 55

        // Access modifier ile bir variable'a ulasilamiyorsa
        // ne degeri gorulur ne de deger atanabilir

        // System.out.println(datalar.shrtSPri);
        // 'shrtSPri' has private access in 'day07_accessModifiers_encapsulations.C04_Datalar'

        // datalar.shrtSPri = 23;

    }
}
