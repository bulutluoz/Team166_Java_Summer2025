package day07_accessModifiers_encapsulations;

public class C03_PublicBilgileriKullananClass {

    public static void main(String[] args) {

        System.out.println(C02_PublicBilgilerClass.hastaneIsmi); // Yildiz Hastanesi
        System.out.println(C02_PublicBilgilerClass.bashekimIsmi); // Doktor Mehmet


        C02_PublicBilgilerClass.bashekimIsmi = "Doktor Alper";

        System.out.println(C02_PublicBilgilerClass.bashekimIsmi); // Doktor Alper


    }
}
