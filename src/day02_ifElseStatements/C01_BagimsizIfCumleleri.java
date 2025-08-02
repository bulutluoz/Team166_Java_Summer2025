package day02_ifElseStatements;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // Bagimsiz if cumleleri adindan da anlasilacagi gibi
        // kodun geri kalanindan bagimsizdir
        // TEK BIR sarti kontrol eder
        // sart ssonucu true ise if body calisir
        // sart sonucu false ise if body calismaz

        int sayi1 = 75;
        int sayi2 = 7;

        // eger sayi2 cift ise "cift sayilari severim" yazdirin
        if ( sayi2 % 2 == 0){
            System.out.println("cift sayilari severim");
        }


        // sayi1 50'den buyukse "sayi1 buyuk sayi" yazdirin

        if ( sayi1 > 50  ){
            System.out.println("sayi1 buyuk sayi");
        }


    }
}
