package day04_methodOlusturmaVeKullanma;

public class C03_MethodOlusturma {

    public static void main(String[] args) {

        // verilen bir metin uzerinde
        // kullanicinin verdigi baslangic ve bitis indexleri arasindaki kismi yazdiran
        // bir method olusturun
        //            Kurallar :
        //            1- eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
        //            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
        //            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

        // method'un calismasi icin
        // mutlaka method call yapilmalidir

        kendiSubstringMethodumuz("Java candir",2,7);
        kendiSubstringMethodumuz("Java harika",5,11);

    }

    public static void kendiSubstringMethodumuz( String metin, int basIndex, int bitIndex   ){

        if (basIndex<0 || bitIndex<0 || basIndex>metin.length() || bitIndex > metin.length()){
            System.out.println("Verilen index negatif veya metnin uzunlugundan fazla olamaz");
        } else if (basIndex > bitIndex) {
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        }else{
            for (int i = basIndex; i < bitIndex ; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println("");
    }

}
