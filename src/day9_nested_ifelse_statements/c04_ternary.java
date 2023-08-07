package day9_nested_ifelse_statements;

public class c04_ternary {
    public static void main(String[] args) {
        // input olarak verilen sayinin 3 ile tam bolunup bolunmedigini yazdirin

        int input =20;
       // input%3 ==0 ? "3 ile tam bolunuyor" : "3 ile tam bolunemiyor" kirmizili yazi
        // bu soruda ternary bize bir String donduruyor
        // bunu YA direk yazdirmalisiniz
        // VEYA bir String variable'a atamalisiniz
        System.out.println(input%3 ==0 ? "3 ile tam bolunuyor" : "3 ile tam bolunemiyor");

        String sonuc = input%3 ==0 ? "3 ile tam bolunuyor" : "3 ile tam bolunemiyor";
        System.out.println(sonuc);

        // verilen input cift sayi ise "cift sayi" ,
        // input tek sayi ise 2 * input sonucunu veren bir ternary yazin
        System.out.println(input%2==0 ? "cift sayi" : 2*input);
        // veya
        //int sonuc2= input%2==0 ? "cift sayi" : 2*input; yazdirmiyor- kirmizilar var
        /*
            Eger ternary'de true durumu ile false durumu
            bize farkli data turunde sonuclar donduruyorsa
            sonucu bir variable'a atayamayiz
            ama direk yazdirabiliriz
         */









        // String veya int sonuc2 = input%3 ==0 ? "3 ile tam bolunuyor" : (2*input);olmuyor
        System.out.println(input%3 ==0 ? "3 ile tam bolunuyor" : (2*input));

    }
}
