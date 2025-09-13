package day08_abstraction;

public class C06_TandirEkmegi extends C05_KuralciParentEkmek{
    /*
        Abstract bir class'i parent edindiginizde

        - parent abstract class'daki abstract method'lari
          kendinize uyarlamak zorundasiniz

          yani o method'lar mutlaka bulunmali
          ama icine ne yazilacagi child class'a baglidir.

        - Parent abstract class'daki
          abstract(zorunlu) olmayan method'lar
          child class'in istegine birakilmistir
          isterse kendisine uyarlar, isterse paren class'dan kullanir
     */
    public void un() {
        System.out.println("Tandir ekmegi beyaz un kullanir");
    }

    public void bicim() {
        System.out.println("Tandir ekmegi ince yuvarlak olur");
    }

    public void gramaj() {

    }

    public static void maya(){
        System.out.println("tandir ekmeginde binde 1 maya kullanilir");
    }

    // Class 'C06_TandirEkmegi' must either be declared abstract or implement abstract method 'un()' in 'C05_KuralciParentEkmek'
    // C06 class'i abstract (kuralci) bir parent edindi
    // Ya C06 class'i da abstract olmali
    // Ya da C05 class'indaki abstract(Zorunlu) method'lari kendisine uyarlamali

    public void tandirEkmegiOzellikleri(){
        un();// Tandir ekmegi beyaz un kullanir
        tuz(); // ekmekler tuz kullanabilir ama zorunlu degil
        maya();// tandir ekmeginde binde 1 maya kullanilir

    }

}
