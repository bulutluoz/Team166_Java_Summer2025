package day05_arrays;

public class C06_ArananElemanVarMi {

    public static void main(String[] args) {

        // Verilen String bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdirin


        String[] harfler = {"a","d","f","e","a","e","d","a","a","e","a"};

        String arananHarf = "k";

        int sayac = 0;

        for (int i = 0; i < harfler.length ; i++) {

           if ( harfler[i].equals(arananHarf)){
               sayac++;
           }

        }

        System.out.println("Aranan " + arananHarf + " harfinden array'de " + sayac + " tane var");


        elemanSayisiniYazdir(harfler,"e"); // Aranan e harfinden array'de 3 tane var

    }

    // Verilen String bir array’de istenen bir elemanin var olup olmadigini
    // ve varsa kac kere kullanildigini yazdiran bir method olusturun

    public static void elemanSayisiniYazdir(String[] verilenArr , String arananMetin){
        int sayac = 0;

        for (int i = 0; i < verilenArr.length ; i++) {

            if ( verilenArr[i].equals(arananMetin)){
                sayac++;
            }

        }

        System.out.println("Aranan " + arananMetin + " harfinden array'de " + sayac + " tane var");

    }
}
