package day10_switchcase_stringmanipulations;

public class C03_stringManipulations {
    public static void main(String[] args) {
        /*
            String manipulation,
            verilen bir String uzerinde HAZIR METHOD'lar kullanarak
            - degisiklik yapmak
            - veya verilen String uzerindeki bir bilgiyi
            almak icin yaptigimiz tum islemlerdir
            String uzerinde yapilan manipulation islemleri
            String'i kalici olarak degistirmez
            Eger yapilan islem sonucundaki yeni halin kalici olmasini istersek
            ATAMA yapmaliyiz
         */


        String str= "Jawa Candir";
        // str'in ilk harfini yazdirin
        System.out.println(str.charAt(0));// J

        // str'i tum harfleri buyuk olacak sekilde yazdirin
        System.out.println(str.toUpperCase()); //JAWA CANDIR

        System.out.println(str); //Jawa Candir  normai yadirir- degiklikler kalici degil

        // str'i tamamen kucuk harflerden olusan bir metne cevirin
        System.out.println(str.toLowerCase());

        System.out.println(str); // terrar normal Jawa Candir yazdirdi- degisiklikler kalici degildir

    }
}
