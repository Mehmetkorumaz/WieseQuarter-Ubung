package day10_switchcase_stringmanipulations;

public class C05_equals {
    public static void main(String[] args) {
        String str1 = "Mehmet";
        String str2 = "MEHMET";
        String str3 = "mehmet";
        String str4 = "MEHmet";
        System.out.println(str1==str2);//false
        System.out.println(str3==str4.toLowerCase());// mehmet == mehmet  false
        System.out.println(str2 ==str3.toUpperCase()); // MEHMET== MEHMET  false

        /*
            String'lerde == bekledigimiz sonuclari DONMEYEBILIR
            Bunun sebebi String class'ini olustururken yapilan bazi ozelliklerdir
            bu konu ilerde detayli bir sekilde anlatilacak
            Verilen iki String'in metinsel olarak ayni olup olmadigini
            kontrol etmek icin == yerine equals() kullanilir
            equals()'u bire bir ayni olan iki metin icin true,
            farkli metinler icin false sonucu uretir(döndürür)
            bu karsilastirmada metnin ayni olmasi yaninda,
            buyuk kucuk harf durumunu da kontrol eder (case sensitive)
            EGER case sensitive olmadan metinleri karsilastirmak isterseniz
            equalsIgnoreCase()'u kullanilir
         */



        
    }
}
