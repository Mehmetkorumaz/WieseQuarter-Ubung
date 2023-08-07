package day02_dataTurleri;

public class C04_stringdataturlri {
    public static void main(String[] args) {
        int sayi =20;
        System.out.println(sayi);
        String isim = "ali yilmaz";
        System.out.println(isim.toLowerCase()); //ALI YILMAZ
        System.out.println(isim.toLowerCase()); // ali yilmaz
        System.out.println(isim); // ali Yilmaz
        String str1 = "Java";
        String str2 = "Candir";
        System.out.println(str1 + str2);
        // iki tane String + isareti ile toplanmaya calisilirsa
        // Java o iki String'i BIRLESTIRIR
        // JavaCandir
        String str3 = "30";
        String str4 = "40";
        System.out.println(str3 + str4); // 3040
        // Verilen isim ve soyismi
        // Girilen ali uzunkavak database'e kaydedildi
        // seklinde yazdirin
        String adi = "Ramazan";
        String soyadi = "Tatar";
        System.out.println("Girilen "+ adi + " " + soyadi + " database'e kaydedildi");
        // " " arasindaki bosluklar konsolda yazdirilan metne yansir
        // ancak kodlar arasinda birakilan bosluklar metne yansimaz
        // System.out.println("Girilen "+        adi         + " " + soyadi + " database'e kaydedildi");
    }
}
